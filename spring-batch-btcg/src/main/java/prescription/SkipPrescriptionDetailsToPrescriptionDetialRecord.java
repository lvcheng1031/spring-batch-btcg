package prescription;

import java.sql.PreparedStatement;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import codetrans.GetMapCodeTrans;
import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;

public class SkipPrescriptionDetailsToPrescriptionDetialRecord
		implements SkipListener<BeanSourcePrescriptionDetails, BeanTargetPrescriptionDetialRecord> {
	Logger logger=Logger.getLogger(SkipPrescriptionDetailsToPrescriptionDetialRecord.class);
	@Override
	public void onSkipInRead(Throwable t) {
		// TODO Auto-generated method stub
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[prescriptionJob][prescriptionDetailStep][read][skip]["+t.toString()+"]");
	}

	@Override
	public void onSkipInWrite(BeanTargetPrescriptionDetialRecord item, Throwable t) {
		// TODO Auto-generated method stub
		// if(t instanceof DataIntegrityViolationException)
		// System.out.println("DataIntegrityViolationException:"+t.toString()+":
		// "+item.toString());
		// if(t instanceof DuplicateKeyException)
		// System.out.println("DuplicateKeyException:"+t.toString()+":
		// "+item.toString());
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[prescriptionJob][prescriptionDetailStep][write][skip]["+t.toString()+"]["+item.toString()+"]");
	}

	@Override
	public void onSkipInProcess(BeanSourcePrescriptionDetails item, Throwable t) {
		// TODO Auto-generated method stub
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException))
			logger.warn("[prescriptionJob][prescriptionDetailStep][process][skip]["+t.toString()+"]["+item.toString()+"]");
	}

}
