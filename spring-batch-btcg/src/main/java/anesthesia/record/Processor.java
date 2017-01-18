package anesthesia.record;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<BeanSource, BeanTarget>{

	@Override
	public BeanTarget process(BeanSource item) throws Exception {
		BeanTarget out=new BeanTarget();
		out.setANESTHESIA_ID(item.getPATIENT_ID()+"#"+item.getVISIT_ID()+"#"+item.getOPER_ID());
		out.setOPERATION_ID(item.getRESERVED5());
		out.setCASE_OBJECT_ID(item.getPATIENT_ID());
		out.setANESTHESIA_METHODS(item.getANESTHESIA_METHOD());
		out.setANAESTHETIST_ID(item.getANESTHESIA_DOCTOR());
		out.setANESTHESIA_BEGIN(item.getANES_START_TIME());
		out.setANESTHESIA_END(item.getANES_END_TIME());
		out.setASA_LEVEL_CD(item.getASA_GRADE());
//		out.setSPILE_SORT(item.getITEM_VALUE());
		out.setANESTHESIA_POSTURE(item.getOPERATION_POSITION());
		out.setPREANAESTHETIC_MEDICINE(item.getPRE_ANES_PHAM());
		out.setWEIGHT(item.getWEIGHT());
		out.setENTER_DATE_TIME(item.getENTER_DATE_TIME());
		out.setIN_DATE_TIME(item.getIN_DATE_TIME());
		out.setOUT_DATE_TIME(item.getOUT_DATE_TIME());
		out.setSCHEDULED_DATE_TIME(item.getSCHEDULED_DATE_TIME());
		return out;
	}

}
