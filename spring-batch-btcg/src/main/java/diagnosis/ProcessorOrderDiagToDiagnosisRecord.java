package diagnosis;

import org.springframework.batch.item.ItemProcessor;

import codetrans.GetMapCodeTrans;

public class ProcessorOrderDiagToDiagnosisRecord implements ItemProcessor<BeanSourceOrderDiag,BeanTargetDiagnosisRecord>{

	@Override
	public BeanTargetDiagnosisRecord process(BeanSourceOrderDiag in) throws Exception {
		BeanTargetDiagnosisRecord out=new BeanTargetDiagnosisRecord();
		out.setDIAGNOSIS_ID(in.getDIAG_NO());
		out.setVISIT_ID(in.getVISIT_ID());
		out.setCASE_OBJECT_ID(in.getPATIENT_ID());
		
		String DIAG_TYPE_source=GetMapCodeTrans.getCodeSource(in.getDIAG_TYPE_ID(), "DIAGNOSIS_RECORD", "DIAG_TYPE");
		out.setDIAG_TYPE(DIAG_TYPE_source);
		
		out.setDIAG_NO(in.getDIAG_SQNO());
		out.setDIAG_DATE(in.getINPUT_TIME());
		out.setDOCTOR_ID(in.getUSER_ID());
		out.setUSER_NAME(in.getUSER_NAME());
		out.setDIAG_CODE(in.getDIAG_CODE());
		out.setDIAG_NAME(in.getDIAG_NAME());
		return out;
	}
	

}
