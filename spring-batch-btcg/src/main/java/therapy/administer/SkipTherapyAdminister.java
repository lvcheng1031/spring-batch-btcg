package therapy.administer;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;

public class SkipTherapyAdminister implements SkipListener<BeanTherapyAdminister, BeanTherapyAdminister>{
	Logger logger=Logger.getLogger(SkipTherapyAdminister.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[therapyAdministerJob][therapyAdministerStep][read][skip]["+t.toString()+"]");
		
	}

	@Override
	public void onSkipInWrite(BeanTherapyAdminister item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[therapyAdministerJob][therapyAdministerStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
		
	}

	@Override
	public void onSkipInProcess(BeanTherapyAdminister item, Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[therapyAdministerJob][therapyAdministerStep][process][skip]["+t.toString()+"]["+item.toString()+"]");
		
	}
	
}
