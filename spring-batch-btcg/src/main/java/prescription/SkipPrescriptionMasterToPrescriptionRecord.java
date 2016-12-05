package prescription;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;


public class SkipPrescriptionMasterToPrescriptionRecord implements SkipListener<BeanSourcePrescriptionMaster,BeanTargetPrescriptionRecord>{
	Logger logger=Logger.getLogger(SkipPrescriptionMasterToPrescriptionRecord.class);
	@Override
	public void onSkipInRead(Throwable t) {
		// TODO Auto-generated method stub
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[prescriptionJob][prescriptionMasterStep][read][skip]["+t.toString()+"]");
	}

	@Override
	public void onSkipInWrite(BeanTargetPrescriptionRecord item, Throwable t) {
		// TODO Auto-generated method stub
//		if(t instanceof DataIntegrityViolationException)
//			System.out.println("DataIntegrityViolationException:"+t.toString()+": "+item.toString());
//		if(t instanceof DuplicateKeyException)
//			System.out.println("DuplicateKeyException:"+t.toString()+": "+item.toString());
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[prescriptionJob][prescriptionMasterStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
	}

	@Override
	public void onSkipInProcess(BeanSourcePrescriptionMaster item, Throwable t) {
		// TODO Auto-generated method stub
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[prescriptionJob][prescriptionMasterStep][proceess][skip]["+t.toString()+"]["+item.toString()+"]");
	}

}
