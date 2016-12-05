package therapy.master;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;

public class SkipTherapyMaster implements SkipListener<BeanTherapyMaster,BeanTherapyMaster>{
	Logger logger=Logger.getLogger(SkipTherapyMaster.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[therapymasterJob][therapymasterStep][read][skip]["+t.toString()+"]");
		
	}

	@Override
	public void onSkipInWrite(BeanTherapyMaster item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[therapymasterJob][therapymasterStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
		
	}

	@Override
	public void onSkipInProcess(BeanTherapyMaster item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[therapymasterJob][therapymasterStep][process][skip]["+t.toString()+"]["+item.toString()+"]");
		
	}
	
}
