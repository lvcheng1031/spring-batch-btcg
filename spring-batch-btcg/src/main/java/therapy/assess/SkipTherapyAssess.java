package therapy.assess;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;

public class SkipTherapyAssess implements SkipListener<BeanTherapyAssess, BeanTherapyAssess>{
	Logger logger=Logger.getLogger(SkipTherapyAssess.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyAssessJob][therapyAssessStep][read][skip][" + t.toString() + "]");
		
	}

	@Override
	public void onSkipInWrite(BeanTherapyAssess item, Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyAssessJob][therapyAssessStep][write][skip][" + t.toString() + "]["
					+ item.toString() + "]");
		
	}

	@Override
	public void onSkipInProcess(BeanTherapyAssess item, Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyAssessJob][therapyAssessStep][process][skip][" + t.toString() + "]["
					+ item.toString() + "]");
		
	}
	
}
