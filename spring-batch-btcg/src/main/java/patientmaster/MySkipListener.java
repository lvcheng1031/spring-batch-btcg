package patientmaster;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;

public class MySkipListener implements SkipListener<EnterpriseMasterPatientIndex,EnterpriseMasterPatientIndex>{
	Logger logger=Logger.getLogger(MySkipListener.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[masterindexJob][masterindexStep][read][skip]["+t.toString()+"]");
	}

	@Override
	public void onSkipInWrite(EnterpriseMasterPatientIndex item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[masterindexJob][masterindexStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
//		if(t instanceof DuplicateKeyException)
//			System.out.println("DuplicateKeyException:"+t.toString()+": "+item.toString());
	}

	@Override
	public void onSkipInProcess(EnterpriseMasterPatientIndex item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[masterindexJob][masterindexStep][process][skip]["+t.toString()+"]["+item.toString()+"]");
	}
	

}
