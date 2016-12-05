package patientrelative;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;
import patientmaster.contact.PMIContact;

public class SkipListenerPMIContactToPatientRelative implements SkipListener<PMIContact, PMIContact> {
	Logger logger=Logger.getLogger(SkipListenerPMIContactToPatientRelative.class);
	@Override
	public void onSkipInRead(Throwable t) {
		// TODO Auto-generated method stub
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[patientrelativeJob][patientrelativeStep][read][skip]["+t.toString()+"]");
	}

	@Override
	public void onSkipInWrite(PMIContact item, Throwable t) {
		// TODO Auto-generated method stub
//		if(t instanceof DataIntegrityViolationException)
//			System.out.println("DataIntegrityViolationException:"+t.toString()+": "+item.getPatient_id());
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[patientrelativeJob][patientrelativeStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
	}

	@Override
	public void onSkipInProcess(PMIContact item, Throwable t) {
		// TODO Auto-generated method stub
		// System.out.println("skip");
		// Logger logger=Logger.getLogger(SkipListenerPMIContact.class);
		// logger.error("[病人主索引JOB]:[跳过非本人现住址的联系方式]:[主键为"+item.getPatient_id()+","+item.getSerial_no()+","+item.getContact_type()+"]");
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[patientrelativeJob][patientrelativeStep][process][skip]["+t.toString()+"]["+item.toString()+"]");
	}

}