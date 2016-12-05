package visitrecord;

import org.springframework.batch.item.ItemProcessor;

import codetrans.GetMapCodeTrans;

public class ProcessorRegVisitMasterToVisitRecord implements ItemProcessor<BeanSourceRegVisitMaster,BeanTargetVisitRecord>{

	@Override
	public BeanTargetVisitRecord process(BeanSourceRegVisitMaster in) throws Exception {
		BeanTargetVisitRecord out=new BeanTargetVisitRecord();
		out.setVisit_id(in.getVisit_id());
		out.setCase_object_id(in.getPatient_id());
		out.setDoctor_id(in.getDoctor_id());
		out.setDoctor_name(in.getDoctor_name());
		out.setHospital_department_id(in.getDept_id());
		out.setHospital_department_name(in.getDept_name());
		out.setVisit_date(in.getVisit_date());
//		System.out.println(in.getVisit_date());
		
		String visit_type_source=GetMapCodeTrans.getCodeSource(in.getVisit_type(), "VISIT_RECORD", "VISIT_TYPE");
		out.setVisit_type(visit_type_source);
		
//		out.setHealth_insurance_type(in.getPayer_type());
		String health_insurance_type_source=GetMapCodeTrans.getCodeSource(in.getPayer_type(), "VISIT_RECORD", "HEALTH_INSURANCE_TYPE");
		out.setHealth_insurance_type(GetMapCodeTrans.getCode(health_insurance_type_source, "VISIT_RECORD", "HEALTH_INSURANCE_TYPE", "VISIT_ID", in.getVisit_id()));
		
		out.setRigistration_type(in.getReg_class());
		
//		out.setAppointments_type(in.getAppoint_code());
		String appointments_type_source=GetMapCodeTrans.getCodeSource(in.getAppoint_code(), "VISIT_RECORD", "APPOINTMENTS_TYPE");
		out.setAppointments_type(GetMapCodeTrans.getCode(appointments_type_source, "VISIT_RECORD", "APPOINTMENTS_TYPE", "VISIT_ID", in.getVisit_id()));
		
//		out.setFirst_visit_flag(in.getFirst_visit());
		String first_visit_flag=GetMapCodeTrans.getCodeSource(in.getFirst_visit(), "VISIT_RECORD", "FIRST_VISIT_FLAG");
		out.setFirst_visit_flag(GetMapCodeTrans.getCode(first_visit_flag, "VISIT_RECORD", "FIRST_VISIT_FLAG", "VISIT_ID", in.getVisit_id()));
				
//		System.out.println("process: "+out.getVisit_id());
		return out;
		
	}

}
