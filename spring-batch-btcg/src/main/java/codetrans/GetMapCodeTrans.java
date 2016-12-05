package codetrans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

import exception.MySkipableException;
import schedule.SchedulerLauncher;

public class GetMapCodeTrans {
	public static Map<String, String> trans;
	public static Map<String, String> trans_source;
	public static Connection conn;
	public static Logger logger=Logger.getLogger(GetMapCodeTrans.class);
	static {
		try {
			trans = new HashMap<String, String>();
			Properties props = new Properties();
			props.load(new FileInputStream(Object.class.getResource("/db.properties").getPath()));
			String drivers = props.getProperty("datasource.driver");
			String url = props.getProperty("datasource.url");
			String user = props.getProperty("datasource.username");
			String password = props.getProperty("datasource.password");
			Class.forName(drivers);
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select * from MAP_CODE_TRANS";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String CONTENT = rs.getString("CONTENT");
				String TARGET_TABLE = rs.getString("TARGET_TABLE");
				String TARGET_COLUMN = rs.getString("TARGET_COLUMN");
				String CODE = rs.getString("CODE");
				trans.put(CONTENT + "#" + TARGET_TABLE + "#" + TARGET_COLUMN, CODE);
			}
			ps.close();
			
			trans_source = new HashMap<String, String>();
			String sqlSource = "select * from MAP_CODE_TRANS_SOURCE";
			PreparedStatement psSource = conn.prepareStatement(sqlSource);
			ResultSet rsSource = psSource.executeQuery();
			while (rsSource.next()) {
				String CONTENT = rsSource.getString("CONTENT");
				String TARGET_TABLE = rsSource.getString("TARGET_TABLE");
				String TARGET_COLUMN = rsSource.getString("TARGET_COLUMN");
				String CODE = rsSource.getString("CODE");
				trans_source.put(CODE + "#" + TARGET_TABLE + "#" + TARGET_COLUMN, CONTENT);
			}
			psSource.close();
			
		} catch (Exception e) {
			logger.error(e.toString());
		}
	}

	public static String getCode(String CONTENT, String TARGET_TABLE, String TARGET_COLUMN, String PK_COLUMNS,
			String PK_VALUES) {
		if (CONTENT == null || trans.containsKey(CONTENT + "#" + TARGET_TABLE + "#" + TARGET_COLUMN)) {
			if (CONTENT == null)
				return null;
			else
				return trans.get(CONTENT + "#" + TARGET_TABLE + "#" + TARGET_COLUMN);
		} else {
			try {
				String sql = "insert into LOG_CODE_TRANS (CONTENT,TARGET_TABLE,TARGET_COLUMN,PK_COLUMNS,PK_VALUES) values(?,?,?,?,?)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, CONTENT);
				pstmt.setString(2, TARGET_TABLE);
				pstmt.setString(3, TARGET_COLUMN);
				pstmt.setString(4, PK_COLUMNS);
				pstmt.setString(5, PK_VALUES);
				pstmt.execute();
				pstmt.close();
			} catch (SQLException e) {
				if(!(e instanceof SQLIntegrityConstraintViolationException)){
					Logger logger=Logger.getLogger(GetMapCodeTrans.class);
					logger.info("[GetMapCodeTrans.getCode]CONTENT="+CONTENT+";TARGET_TABLE="+TARGET_TABLE+";TARGET_COLUMN="+TARGET_COLUMN+";PK_COLUMNS="+PK_COLUMNS+";PK_VALUES"+PK_VALUES+";"+e.toString());
				}
			}
			return "-1";
		}
	}
	
	public static String getCodeSource(String CODE, String TARGET_TABLE, String TARGET_COLUMN) {
		if(CODE==null) return null;
		if(trans_source.containsKey(CODE + "#" + TARGET_TABLE + "#" + TARGET_COLUMN))
			return trans_source.get(CODE + "#" + TARGET_TABLE + "#" + TARGET_COLUMN);
		else{
			Logger logger=Logger.getLogger(GetMapCodeTrans.class);
			logger.info("[GetMapCodeTrans.getCodeSource]出现了源表相关字段的字典表以外的代码:CODE="+CODE+";TARGET_TABLE="+TARGET_TABLE+";TARGET_COLUMN="+TARGET_COLUMN);
			return CODE;
		}
	}

	public static void updateCodeBaseLog() {
		try {
			String CONTENT;
			String TARGET_TABLE;
			String TARGET_COLUMN;
			String PK_COLUMNS;
			String PK_VALUES;
			String sql = "select * from LOG_CODE_TRANS";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CONTENT = rs.getString(1);
				TARGET_TABLE = rs.getString(2);
				TARGET_COLUMN = rs.getString(3);
				PK_COLUMNS = rs.getString(4);
				PK_VALUES = rs.getString(5);
				String updateSql = "update "+TARGET_TABLE+" set "+TARGET_COLUMN+" = ? where ";
				String[] pks = PK_COLUMNS.split("#");
				String[] vals = PK_VALUES.split("#");
				String where = pks[0] + "=" + vals[0];
				for (int i = 1; i < pks.length; i++) {
					where += " and " + pks[i] + "=" + vals[i];
				}
				updateSql+=where;
				PreparedStatement updatePs = conn.prepareStatement(updateSql);
				if (!trans.containsKey(CONTENT + "#" + TARGET_TABLE + "#" + TARGET_COLUMN)) {
					throw (new MySkipableException("请手动添加映射:" + " CONTENT=" + CONTENT + " ;TARGET_TABLE=" + TARGET_TABLE
							+ " ;TARGET_COLUMN=" + TARGET_COLUMN));
				} else {
					updatePs.setString(1, trans.get(CONTENT + "#" + TARGET_TABLE + "#" + TARGET_COLUMN));
				}
				updatePs.execute();
				updatePs.close();
			}
			ps.close();

			String deleteSql = "delete from LOG_CODE_TRANS";
			PreparedStatement deletePs = conn.prepareStatement(deleteSql);
			deletePs.execute();
			deletePs.close();
		} catch (MySkipableException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateMap(String CONTENT, String TARGET_TABLE, String TARGET_COLUMN, String CODE) {
		try {
			String insertSql = "insert into MAP_CODE_TRANS(CONTENT,TARGET_TABLE,TARGET_COLUMN,CODE) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insertSql);
			ps.setString(1, CONTENT);
			ps.setString(2, TARGET_TABLE);
			ps.setString(3, TARGET_COLUMN);
			ps.setString(4, CODE);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println(trans.size());
//		updateMap("汉", "MASTER_PATIENT_INDEX", "NATION_ID", "1");
		updateCodeBaseLog();
	}
}
