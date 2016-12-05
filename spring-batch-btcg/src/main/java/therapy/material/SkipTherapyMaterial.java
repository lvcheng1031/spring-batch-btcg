package therapy.material;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;

public class SkipTherapyMaterial implements SkipListener<BeanTherapyMaterial, BeanTherapyMaterial>{
	Logger logger=Logger.getLogger(SkipTherapyMaterial.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyMaterialJob][therapyMaterialStep][read][skip][" + t.toString() + "]");
		
	}

	@Override
	public void onSkipInWrite(BeanTherapyMaterial item, Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyMaterialJob][therapyMaterialStep][write][skip][" + t.toString() + "]["
					+ item.toString() + "]");
		
	}

	@Override
	public void onSkipInProcess(BeanTherapyMaterial item, Throwable t) {
		if (!(t instanceof MySkipableException || t instanceof DuplicateKeyException))
			logger.warn("[therapyMaterialJob][therapyMaterialStep][process][skip][" + t.toString() + "]["
					+ item.toString() + "]");
		
	}
	
}	
