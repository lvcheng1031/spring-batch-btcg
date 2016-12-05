package therapy.applyitems;

import org.springframework.batch.item.ItemProcessor;

public class ProcessorApplyItems implements ItemProcessor<BeanApplyItems, BeanApplyItems>{

	@Override
	public BeanApplyItems process(BeanApplyItems in) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println(in.getTHERAPY_ID());
		return in;
	}

}
