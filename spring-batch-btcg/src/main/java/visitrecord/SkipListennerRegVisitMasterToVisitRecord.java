package visitrecord;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;

public class SkipListennerRegVisitMasterToVisitRecord  implements SkipListener<BeanSourceRegVisitMaster,BeanTargetVisitRecord>{
	Logger logger=Logger.getLogger(SkipListennerRegVisitMasterToVisitRecord.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[regVisitMasterToVisitRecordJob][regVisitMasterToVisitRecordStep][read][skip]["+t.toString()+"]");
	}

	@Override
	public void onSkipInWrite(BeanTargetVisitRecord item, Throwable t) {
		// TODO Auto-generated method stub
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[regVisitMasterToVisitRecordJob][regVisitMasterToVisitRecordStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
	}

	@Override
	public void onSkipInProcess(BeanSourceRegVisitMaster item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[regVisitMasterToVisitRecordJob][regVisitMasterToVisitRecordStep][process][skip]["+t.toString()+"]["+item.toString()+"]");
	}

}
