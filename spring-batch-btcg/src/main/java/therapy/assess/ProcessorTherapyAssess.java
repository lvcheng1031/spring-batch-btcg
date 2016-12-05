package therapy.assess;

import org.springframework.batch.item.ItemProcessor;

public class ProcessorTherapyAssess implements ItemProcessor<BeanTherapyAssess, BeanTherapyAssess>{

	@Override
	public BeanTherapyAssess process(BeanTherapyAssess in) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(in.getASSESS_NO());
		return in;
	}
	
}
