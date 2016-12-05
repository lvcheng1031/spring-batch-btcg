package patientmaster.contact;

import org.springframework.batch.item.ItemProcessor;
import exception.MySkipableException;

public class ProcessorPMIContact implements ItemProcessor<PMIContact, PMIContact> {

	public PMIContact process(PMIContact in) throws Exception {
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
		if (!(in.getSerial_no() != null && in.getSerial_no().equals("1") && in.getContact_type() != null
				&& in.getContact_type().equals("NOW_ADDRESS") && in.getRelation() != null
				&& in.getRelation().equals("本人"))) {
			throw (new MySkipableException("非本人的现在的联系方式"));
		}
		return out;
	}

}