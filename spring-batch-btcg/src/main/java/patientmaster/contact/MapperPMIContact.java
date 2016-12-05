package patientmaster.contact;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MapperPMIContact implements RowMapper<PMIContact> {

	public PMIContact mapRow(ResultSet rs, int rowNum) throws SQLException {
		PMIContact row = new PMIContact();
		row.setPatient_id(rs.getString("patient_id"));
		row.setSerial_no(rs.getString("serial_no"));
		row.setContact_type(rs.getString("contact_type"));
		row.setRelation(rs.getString("relation"));
		row.setModify_date(rs.getString("modify_date"));
		row.setActive_flag(rs.getString("active_flag"));
		row.setCompany(rs.getString("company"));
		row.setAddress(rs.getString("address"));
		row.setZip(rs.getString("zip"));
		row.setContact_name(rs.getString("contact_name"));
		row.setContact_id_no(rs.getString("contact_id_no"));
		return row;
	}
}
