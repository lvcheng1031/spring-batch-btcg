package therapy.master;

import org.springframework.batch.item.ItemProcessor;

public class ProcessorTherapyMaster implements ItemProcessor<BeanTherapyMaster,BeanTherapyMaster>{

	@Override
	public BeanTherapyMaster process(BeanTherapyMaster in) throws Exception {
		// TODO Auto-generated method stub
		return in;
	}
	
}
