package therapy.material;

import org.springframework.batch.item.ItemProcessor;

public class ProcessorTherapyMaterial implements ItemProcessor<BeanTherapyMaterial, BeanTherapyMaterial>{

	@Override
	public BeanTherapyMaterial process(BeanTherapyMaterial in) throws Exception {
		// TODO Auto-generated method stub
		return in;
	}
	
}
