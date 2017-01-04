package diagnosis;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import exception.MySkipableException;

public class SkipOrderDiagToDiagnosisRecord implements SkipListener<BeanSourceOrderDiag,BeanTargetDiagnosisRecord>{
	Logger logger=Logger.getLogger(SkipOrderDiagToDiagnosisRecord.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[diagnosisJob][diagnosisStep][read][skip]["+t.toString()+"]");
		
	}

	@Override
	public void onSkipInWrite(BeanTargetDiagnosisRecord item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[diagnosisJob][diagnosisStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
		
	}

	@Override
	public void onSkipInProcess(BeanSourceOrderDiag item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[diagnosisJob][diagnosisStep][process][skip]["+t.toString()+"]["+item.toString()+"]");
		
	}
	
}
