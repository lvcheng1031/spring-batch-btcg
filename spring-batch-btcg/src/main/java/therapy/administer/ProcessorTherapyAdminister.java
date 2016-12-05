package therapy.administer;

import org.springframework.batch.item.ItemProcessor;

public class ProcessorTherapyAdminister implements ItemProcessor<BeanTherapyAdminister, BeanTherapyAdminister>{

	@Override
	public BeanTherapyAdminister process(BeanTherapyAdminister in) throws Exception {
		// TODO Auto-generated method stub
		return in;
	}
	
}
