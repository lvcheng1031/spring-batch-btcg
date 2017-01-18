package listener;

import org.apache.log4j.Logger;
import org.springframework.batch.core.SkipListener;
import org.springframework.dao.DuplicateKeyException;

import diagnosis.SkipOrderDiagToDiagnosisRecord;
import exception.MySkipableException;
import patientmaster.contact.SkipListenerPMIContact;
import variable.Whole;

public class MySkipListener implements SkipListener<Object,Object>{
	Logger logger=Logger.getLogger(MySkipListener.class);
	@Override
	public void onSkipInRead(Throwable t) {
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException)){
			logger.warn(t.toString());
			ifExit();
		}
	}

	@Override
	public void onSkipInWrite(Object item, Throwable t) {
//		logger.warn("write**********"+Whole.skipCount+t.toString());
//		if(t instanceof DuplicateKeyException){
//			System.out.println(t.getMessage()+"***********"+item.toString());
//		}
//		System.out.println();
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException)){
			logger.warn(t.toString()+"----->"+item.toString());
			ifExit();
		}
	}

	@Override
	public void onSkipInProcess(Object item, Throwable t) {
//		logger.warn("process**********"+Whole.skipCount);
		if(!(t instanceof MySkipableException ||t instanceof DuplicateKeyException)){
			logger.warn(t.toString()+"----->"+item.toString());
			ifExit();
		}
	}
	public void ifExit(){
		Whole.skipCount++;
		if(Whole.skipCount>Whole.skipLimit){
			logger.warn("异常超过阈值，程序已停止");
			System.exit(0);
		}
	}
}
