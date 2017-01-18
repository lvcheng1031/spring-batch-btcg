package tool.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import schedulerLauncher.allJob.SchedulerLauncher;

public class DeleteForFixAfterException {
	public static void deleteBetweenLastAndCuDateFromAllTable(String last_date,String cu_date) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
		Logger logger=Logger.getLogger(DeleteForFixAfterException.class);//logger.error
		
		Properties props = new Properties();
		props.load(new FileInputStream(Object.class.getResource("/db.properties").getPath()));
		String drivers = props.getProperty("datasource_out.driver");
		String url = props.getProperty("datasource_out.url");
		String user = props.getProperty("datasource_out.username");
		String password = props.getProperty("datasource_out.password");
		Class.forName(drivers);
		Connection conn = DriverManager.getConnection(url, user, password);
		
		String sql="";
		PreparedStatement ps=null;
		
//		sql="delete from MASTER_PATIENT_INDEX where CREATE_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and CREATE_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss')";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		logger.warn("相应时间段的病人基本信息已清空");
//		
//		sql="delete from PATIENT_RELATIVE where MODIFY_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and MODIFY_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss')";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		logger.warn("相应时间段的病人亲属信息已清空");
//		
//		sql="delete from VISIT_RECORD where VISIT_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and VISIT_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss')";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		logger.warn("相应时间段的就诊记录已清空");
//		
//		sql="delete from DIAGNOSIS_RECORD where DIAG_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and DIAG_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss')";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		logger.warn("相应时间段的诊断记录已清空");
//		
//		sql="delete from PRESCRIPTION_DETIAL_RECORD where PRESCRIPTION_ID in(select PRESCRIPTION_ID from PRESCRIPTION_RECORD where OPEN_ORDERS_TIME >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and OPEN_ORDERS_TIME < to_date(?,'yyyy-MM-dd HH24:mi:ss'))";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		sql="delete from PRESCRIPTION_RECORD where OPEN_ORDERS_TIME >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and OPEN_ORDERS_TIME < to_date(?,'yyyy-MM-dd HH24:mi:ss')";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		logger.warn("相应时间段的用药信息已清空");
//		
//		sql="delete from THERAPY_APPLY_ITEMS where THERAPY_ID in(select THERAPY_ID from THERAPY_MASTER where ORDER_TIME >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and ORDER_TIME < to_date(?,'yyyy-MM-dd HH24:mi:ss'))";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		sql="delete from THERAPY_MASTER where ORDER_TIME >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and ORDER_TIME < to_date(?,'yyyy-MM-dd HH24:mi:ss')";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		
//		sql="delete from THERAPY_ITEMS where ( ACTION_DATE &gt;= to_date(?,'yyyy-MM-dd HH24:mi:ss') and ACTION_DATE &lt; to_date(?,'yyyy-MM-dd HH24:mi:ss'))";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		
//		sql="delete from THERAPY_MATERIAL where THERAPY_VISIT_ID in(select THERAPY_VISIT_ID from THERAPY_ADMINISTER where CHECKIN_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and CHECKIN_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss'))";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		sql="delete from THERAPY_ADMINISTER where CHECKIN_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and CHECKIN_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss')";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		
//		
//		sql="delete from THERAPY_ASSESS where RECORD_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and RECORD_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss')";
//		ps = conn.prepareStatement(sql);
//		ps.setString(1, last_date);
//		ps.setString(2, cu_date);
//		ps.execute();
//		logger.warn("相应时间段的治疗信息已清空");
		
		sql="delete from OPERATION_RECORD where ( INPUT_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and INPUT_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss'))";
		ps = conn.prepareStatement(sql);
		ps.setString(1, last_date);
		ps.setString(2, cu_date);
		ps.execute();
		
		sql="delete from OPERATION_MATERIAL_RECORD where ( INPUT_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and INPUT_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss'))";
		ps = conn.prepareStatement(sql);
		ps.setString(1, last_date);
		ps.setString(2, cu_date);
		ps.execute();
		
		sql="delete from OPERATION_OPERATE_RECORD where ( INPUT_DATE >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and INPUT_DATE < to_date(?,'yyyy-MM-dd HH24:mi:ss'))";
		ps = conn.prepareStatement(sql);
		ps.setString(1, last_date);
		ps.setString(2, cu_date);
		ps.execute();
		
		logger.warn("相应时间段的手术信息已清空");
		
		sql="delete from ANESTHESIA_RECORD where ( SCHEDULED_DATE_TIME >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and SCHEDULED_DATE_TIME < to_date(?,'yyyy-MM-dd HH24:mi:ss'))";
		ps = conn.prepareStatement(sql);
		ps.setString(1, last_date);
		ps.setString(2, cu_date);
		ps.execute();
		
		sql="delete from ANAESTHETIC_RECORD where ( START_TIME >= to_date(?,'yyyy-MM-dd HH24:mi:ss') and START_TIME < to_date(?,'yyyy-MM-dd HH24:mi:ss'))";
		ps = conn.prepareStatement(sql);
		ps.setString(1, last_date);
		ps.setString(2, cu_date);
		ps.execute();
		
		logger.warn("相应时间段的麻醉信息已清空");
		
		logger.warn("清空完毕");
		ps.close();
		conn.close();
	}
}
