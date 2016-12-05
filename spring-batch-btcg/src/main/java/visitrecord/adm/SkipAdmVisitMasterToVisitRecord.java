package visitrecord.adm;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;
import visitrecord.BeanTargetVisitRecord;

public class SkipAdmVisitMasterToVisitRecord implements SkipListener<BeanSourceAdmVisitMaster,BeanTargetVisitRecord>{
	Logger logger=Logger.getLogger(SkipAdmVisitMasterToVisitRecord.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[visitrecordadmJob][visitrecordadmStep][read][skip]["+t.toString()+"]");
		
	}

	@Override
	public void onSkipInWrite(BeanTargetVisitRecord item, Throwable t) {
//		if(t instanceof DuplicateKeyException){
//			System.out.println("[visitrecordadmJob][visitrecordadmStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
//		}
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[visitrecordadmJob][visitrecordadmStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
		
	}

	@Override
	public void onSkipInProcess(BeanSourceAdmVisitMaster item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[visitrecordadmJob][visitrecordadmStep][process][skip]["+t.toString()+"]["+item.toString()+"]");
		
	}

}
