package patientmaster;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MapperEnterpriseMasterPatientIndex implements RowMapper<EnterpriseMasterPatientIndex> {
	public EnterpriseMasterPatientIndex mapRow(ResultSet rs, int rowNum) throws SQLException {
		EnterpriseMasterPatientIndex row=new EnterpriseMasterPatientIndex();
		row.setPatient_id(rs.getString("patient_id"));
		row.setPatient_name(rs.getString("patient_name"));
		row.setSex(rs.getString("sex"));
		row.setNationality(rs.getString("nationality"));
		row.setNation(rs.getString("nation"));
		row.setMarital_status(rs.getString("marital_status"));
		row.setOccupation(rs.getString("occupation"));
		row.setEducation_level(rs.getString("education_level"));
		row.setDate_of_birth(rs.getString("date_of_birth"));
		row.setId_type(rs.getString("id_type"));
		row.setId_no(rs.getString("id_no"));
//		row.setCompany(rs.getString("company"));
//		row.setAddress(rs.getString("address"));
//		row.setZip(rs.getString("zip"));
		row.setCell_phone(rs.getString("cell_phone"));
		row.setPayer_type(rs.getString("payer_type"));
		row.setCreate_date(rs.getString("create_date"));
//		row.setContact_type(rs.getString("contact_type"));
//		row.setRelation(rs.getString("relation"));
		row.setModify_date(rs.getString("modify_date"));
		return row;
	}

}
