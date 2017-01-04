package listener;

import org.apache.log4j.Logger;
import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

import patientmaster.contact.SkipListenerPMIContact;
import variable.Whole;

public class MyChunkListener implements ChunkListener {
	Logger logger=Logger.getLogger(MyChunkListener.class);
	@Override
	public void beforeChunk(ChunkContext context) {
		// log context.toString();
//		System.out.println("before one chunk completed");
	}

	@Override
	public void afterChunk(ChunkContext context) {
		logger.warn(context.getStepContext().getStepName()+" : 累计读取 "+context.getStepContext().getStepExecution().getReadCount()+" 条记录,"+"跳过 "+" "+context.getStepContext().getStepExecution().getSkipCount()+" 条记录,"+"写入 "+" "+context.getStepContext().getStepExecution().getWriteCount()+" 条记录");
	}

	@Override
	public void afterChunkError(ChunkContext context) {
//		System.out.println(context.toString());
	}

}