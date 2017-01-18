package op.material;

import org.springframework.batch.item.ItemProcessor;

public class ProcessorToOperationMaterialRecord implements ItemProcessor<BeanSource, BeanTargetOperationMaterialRecord>{

	@Override
	public BeanTargetOperationMaterialRecord process(BeanSource item) throws Exception {
		// TODO Auto-generated method stub
		BeanTargetOperationMaterialRecord out=new BeanTargetOperationMaterialRecord();
		out.setSEQ(item.getEVENT_ID());
		out.setOPERATION_ID(item.getPROCEDURE_ID());
		out.setINTERVENTION_NAME(item.getITEM_NAME());
		out.setINTERVENTION_NUM(item.getAMOUNT());
		out.setUNIT(item.getUNIT());
		out.setEVENT_START_TIME(item.getEVENT_START_TIME());
		out.setEVENT_END_TIME(item.getEVENT_END_TIME());
		out.setINPUT_DATE(item.getINPUT_DATE());
//		System.out.println(out.getSEQ());
		return out;
	}
	
}
