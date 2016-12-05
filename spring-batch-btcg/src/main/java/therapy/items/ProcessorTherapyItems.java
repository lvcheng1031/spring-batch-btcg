package therapy.items;

import org.springframework.batch.item.ItemProcessor;

public class ProcessorTherapyItems implements ItemProcessor<BeanTherapyItems, BeanTherapyItems>{

	@Override
	public BeanTherapyItems process(BeanTherapyItems in) throws Exception {
		// TODO Auto-generated method stub
		return in;
	}
	
}
