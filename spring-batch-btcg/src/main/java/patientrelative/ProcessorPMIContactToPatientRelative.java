package patientrelative;

import org.springframework.batch.item.ItemProcessor;

import exception.MySkipableException;
import patientmaster.contact.PMIContact;

public class ProcessorPMIContactToPatientRelative implements ItemProcessor<PMIContact, PMIContact> {

	public PMIContact process(PMIContact in) throws Exception {
//		System.out.println("ok");
		PMIContact out = new PMIContact();
		out.setPatient_id(in.getPatient_id());
		out.setSerial_no(in.getSerial_no());
		out.setContact_type(in.getContact_type());
		out.setRelation(in.getRelation());
		out.setModify_date(in.getModify_date());
		out.setActive_flag(in.getActive_flag());
		out.setCompany(in.getCompany());
		out.setAddress(in.getAddress());
		out.setZip(in.getZip());
		out.setContact_name(in.getContact_name());
		out.setContact_id_no(in.getContact_id_no());
//		if (in.getRelation()==null||in.getRelation().equals("本人")) {
//			throw (new MySkipableException("非亲属的现在的联系信息"));
//		}
//		if(out.getContact_name()==null){
//			throw (new MySkipableException("亲属姓名为空"));
//		}
//		System.out.println(out.getPatient_id()+":"+out.getContact_id_no()+":"+out.getRelation()+":"+out.getContact_type()+":"+out.getSerial_no());
		return out;
	}

}