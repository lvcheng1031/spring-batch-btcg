package anesthesia.anaesthetic;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<BeanSource, BeanTarget>{

	@Override
	public BeanTarget process(BeanSource item) throws Exception {
		BeanTarget out =new BeanTarget();
		out.setSEQ(item.getPATIENT_ID()+"#"+item.getVISIT_ID()+"#"+item.getOPER_ID()+"#"+item.getITEM_NO()+"#"+item.getEVENT_NO());
		out.setANESTHESIA_ID(item.getPATIENT_ID()+"#"+item.getVISIT_ID()+"#"+item.getOPER_ID());
		out.setANAESTHETIC_ID(item.getITEM_CODE());
		out.setANAESTHETIC_NAME(item.getITEM_NAME());
		out.setANAESTHETIC_QUANTITY(item.getDOSAGE());
		out.setSTART_TIME(item.getSTART_TIME());
		out.setEND_DATE(item.getEND_DATE());
		return out;
	}
	
}
