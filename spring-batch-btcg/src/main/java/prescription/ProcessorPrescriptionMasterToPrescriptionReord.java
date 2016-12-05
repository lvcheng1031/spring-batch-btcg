package prescription;

import org.springframework.batch.item.ItemProcessor;

public class ProcessorPrescriptionMasterToPrescriptionReord
		implements ItemProcessor<BeanSourcePrescriptionMaster, BeanTargetPrescriptionRecord> {

	@Override
	public BeanTargetPrescriptionRecord process(BeanSourcePrescriptionMaster in) throws Exception {
		BeanTargetPrescriptionRecord out = new BeanTargetPrescriptionRecord();
		out.setPRESCRIPTION_ID(in.getPresc_id());
		out.setVISIT_ID(in.getVisit_id());
		out.setCASE_OBJECT_ID(in.getPatient_id());
		out.setDOCTOR_ID(in.getOrdering_doctor_id());
		out.setDOCTOR_NAME(in.getOrdering_doctor_name());
		out.setHOSPITAL_DEPARTMENT_ID(in.getDept_id());
		out.setHOSPITAL_DEPARTMENT_NAME(in.getOrdering_doctor_name());
		out.setOPEN_ORDERS_TIME(in.getPresc_time());
//		System.out.println(out.toString());
		return out;
	}
}
