package op.operation;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<BeanSource, BeanTarget>{

	@Override
	public BeanTarget process(BeanSource item) throws Exception {
		BeanTarget out =new BeanTarget();
		out.setSEQ(item.getEVENT_ID());
		out.setOPERATION_ID(item.getPROCEDURE_ID());
		out.setOPERATE_NAME(item.getOPERATE_NAME());
		out.setOPERATE_CD(item.getOP_CLASS_CODE());
		out.setTARGET_POSITION(item.getOPERATE_POSITON());
		out.setEVENT_START_TIME(item.getEVENT_START_TIME());
		out.setEVENT_END_TIME(item.getEVENT_END_TIME());
		out.setINPUT_DATE(item.getINPUT_DATE());
		return out;
	}

}
