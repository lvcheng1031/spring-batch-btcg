package patientmaster.contact;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;

public class SkipListenerPMIContact implements SkipListener<PMIContact,PMIContact>{
	Logger logger=Logger.getLogger(SkipListenerPMIContact.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[masterindexJob][updateContactStep][read][skip]["+t.toString()+"]");
		
	}

	@Override
	public void onSkipInWrite(PMIContact item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[masterindexJob][updateContactStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
		
	}

	@Override
	public void onSkipInProcess(PMIContact item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[masterindexJob][updateContactStep][process][skip]["+t.toString()+"]["+item.toString()+"]");
		// TODO Auto-generated method stub
//		System.out.println("skip");
//		Logger logger=Logger.getLogger(SkipListenerPMIContact.class);
//		logger.error("[病人主索引JOB]:[跳过非本人现住址的联系方式]:[主键为"+item.getPatient_id()+","+item.getSerial_no()+","+item.getContact_type()+"]");
	}

}
