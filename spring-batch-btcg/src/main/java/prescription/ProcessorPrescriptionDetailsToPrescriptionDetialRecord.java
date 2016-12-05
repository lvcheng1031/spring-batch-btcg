package prescription;

import java.sql.PreparedStatement;

import org.springframework.batch.item.ItemProcessor;

import codetrans.GetMapCodeTrans;
import exception.MySkipableException;

public class ProcessorPrescriptionDetailsToPrescriptionDetialRecord
		implements ItemProcessor<BeanSourcePrescriptionDetails, BeanTargetPrescriptionDetialRecord> {

	@Override
	public BeanTargetPrescriptionDetialRecord process(BeanSourcePrescriptionDetails in) throws Exception {
		BeanTargetPrescriptionDetialRecord out = new BeanTargetPrescriptionDetialRecord();
		out.setPRESCRIPTION_ID(in.getPRESC_ID());
		out.setSEQ(in.getSERIAL_NO());
		out.setDRAG_CODE(in.getDRUG_CODE());
		out.setDRAG_NAME(in.getDRUG_NAME());
		out.setFREQUENCY(in.getFREQ_CODE());
		out.setDOSAGE_UNIT(in.getDOSAGE_UNIT());
		out.setDOSAGE_ONCE(in.getDOSAGE());
		out.setDOSAGE_ACCUMULATE(in.getTOTAL_AMOUNT());
		out.setROUTE_CODE(GetMapCodeTrans.getCode(in.getADMINISTRATION(), "PRESCRIPTION_DETIAL_RECORD", "ROUTE_CODE", "PRESCRIPTION_ID#SEQ", in.getPRESC_ID()+"#"+in.getSERIAL_NO()));
//		System.out.println(out.toString());
		return out;
	}
}
