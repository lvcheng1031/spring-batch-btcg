package visitrecord.adm;

import org.springframework.batch.item.ItemProcessor;

import codetrans.GetMapCodeTrans;
import visitrecord.BeanTargetVisitRecord;

public class ProcessorAdmVisitMasterToVisitRecord implements ItemProcessor<BeanSourceAdmVisitMaster,BeanTargetVisitRecord>{

	@Override
	public BeanTargetVisitRecord process(BeanSourceAdmVisitMaster in) throws Exception {
		BeanTargetVisitRecord out=new BeanTargetVisitRecord();
		out.setVisit_id(in.getVISIT_ID());
		out.setCase_object_id(in.getPATIENT_ID());
		out.setDoctor_id(in.getDOCTOR_ID());
		out.setDoctor_name(in.getDOCTOR_NAME());
		out.setHospital_department_id(in.getLAST_DEPT_ID());
		out.setVisit_date(in.getVISIT_DATE());
		
		String visit_type_source=GetMapCodeTrans.getCodeSource(in.getSOURCE(), "VISIT_RECORD", "VISIT_TYPE_ADM");
		out.setVisit_type(visit_type_source);
		
		String health_insurance_type_source=GetMapCodeTrans.getCodeSource(in.getPAYER_TYPE(), "VISIT_RECORD", "HEALTH_INSURANCE_TYPE");
		out.setHealth_insurance_type(GetMapCodeTrans.getCode(health_insurance_type_source, "VISIT_RECORD", "HEALTH_INSURANCE_TYPE", "VISIT_ID", in.getVISIT_ID()));
		
		String IF_KEPT_OBSERVATION_source=GetMapCodeTrans.getCodeSource(in.getVISIT_TYPE(), "VISIT_RECORD", "IF_KEPT_OBSERVATION");
		out.setIF_KEPT_OBSERVATION(IF_KEPT_OBSERVATION_source);
		return out;
	}

}
