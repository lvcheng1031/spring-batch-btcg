package therapy.applyitems;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;

public class SkipExtraApplyItems implements SkipListener<BeanApplyItems, BeanApplyItems> {
	Logger logger=Logger.getLogger(SkipExtraApplyItems.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyapplyitemsJob][extratherapyapplyitemsStep][read][skip][" + t.toString() + "]");

	}

	@Override
	public void onSkipInWrite(BeanApplyItems item, Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyapplyitemsJob][extratherapyapplyitemsStep][write][skip][" + t.toString() + "]["
					+ item.toString() + "]");

	}

	@Override
	public void onSkipInProcess(BeanApplyItems item, Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyapplyitemsJob][extratherapyapplyitemsStep][process][skip][" + t.toString() + "]["
					+ item.toString() + "]");
	}

}