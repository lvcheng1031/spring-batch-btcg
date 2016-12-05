package patientmaster;

import java.sql.SQLException;

import org.springframework.batch.item.ItemProcessor;

import codetrans.GetMapCodeTrans;
import exception.MySkipableException;


public class ProcessorEnterpriseMasterPatientIndex
		implements ItemProcessor<EnterpriseMasterPatientIndex, EnterpriseMasterPatientIndex> {
	public EnterpriseMasterPatientIndex process(EnterpriseMasterPatientIndex in) throws SQLException {
		//System.out.println(in.toString());
		EnterpriseMasterPatientIndex out=new EnterpriseMasterPatientIndex(in);
		out.setEducation_level(GetMapCodeTrans.getCode(in.getEducation_level(), "MASTER_PATIENT_INDEX", "EDUCATIONAL_LEVEL_ID", "CASE_OBJECT_ID", in.getPatient_id()));
		out.setMarital_status(GetMapCodeTrans.getCode(in.getMarital_status(), "MASTER_PATIENT_INDEX", "MARRIAGE_TYPE", "CASE_OBJECT_ID", in.getPatient_id()));
		out.setNation(GetMapCodeTrans.getCode(in.getNation(), "MASTER_PATIENT_INDEX", "NATION_ID", "CASE_OBJECT_ID", in.getPatient_id()));
		out.setNationality(GetMapCodeTrans.getCode(in.getNationality(), "MASTER_PATIENT_INDEX", "NATIONNALITY_ID", "CASE_OBJECT_ID", in.getPatient_id()));
		out.setId_type(GetMapCodeTrans.getCode(in.getId_type(), "MASTER_PATIENT_INDEX", "PAPERS_TYPE_ID", "CASE_OBJECT_ID", in.getPatient_id()));
		out.setSex(GetMapCodeTrans.getCode(in.getSex(), "MASTER_PATIENT_INDEX", "GENDER", "CASE_OBJECT_ID", in.getPatient_id()));
//		if(!(in.getContact_type()!=null&&in.getContact_type().equals("NOW_ADDRESS")&&in.getRelation()!=null&&in.getRelation().equals("本人"))){
//			throw(new MySkipableException("非本人的现在的联系方式"));
//		}
//		if(in.getPatient_id().equals("20000080")) throw(new Exception("test"));
		return out;
	}

}
