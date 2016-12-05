package therapy.items;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;

public class SkipTherapyItems implements SkipListener<BeanTherapyItems, BeanTherapyItems>{
	Logger logger=Logger.getLogger(SkipTherapyItems.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyItemsJob][therapyItemsStep][read][skip][" + t.toString() + "]");
		
	}

	@Override
	public void onSkipInWrite(BeanTherapyItems item, Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyItemsJob][therapyItemsStep][write][skip][" + t.toString() + "]["
					+ item.toString() + "]");
		
	}

	@Override
	public void onSkipInProcess(BeanTherapyItems item, Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyItemsJob][therapyItemsStep][process][skip][" + t.toString() + "]["
					+ item.toString() + "]");
		
	}
	
}
