package listener;

import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

public class MyChunkListener implements ChunkListener {

	@Override
	public void beforeChunk(ChunkContext context) {
		// log context.toString();
	}

	@Override
	public void afterChunk(ChunkContext context) {
	}

	@Override
	public void afterChunkError(ChunkContext context) {
		
	}

}