package op.record;

import org.springframework.batch.item.ItemProcessor;

public class ProcessorOpProcedureMasterToOperationRecord implements ItemProcessor<BeanSourceOpProcedureMaster, BeanTargetOperationRecord>{

	@Override
	public BeanTargetOperationRecord process(BeanSourceOpProcedureMaster item) throws Exception {
		// TODO Auto-generated method stub
		BeanTargetOperationRecord out=new BeanTargetOperationRecord();
		out.setOPERATION_ID(item.getPROCEDURE_ID());
		out.setVISIT_ID(item.getVISIT_ID());
		out.setCASE_OBJECT_ID(item.getPATIENT_ID());
		out.setOPERATOR_ID(item.getSURGEON_ID());
		out.setOPERATOR_NAME(item.getSURGEON_NAME());
		out.setHOSPITAL_DEPARTMENT_ID(item.getOP_DEPT_ID());
		out.setHOSPITAL_DEPARTMENT_NAME(item.getOP_DEPT_NAME());
		out.setOPERATION_BEGIN_DT(item.getOP_START_TIME());
		out.setOPERATION_END_DT(item.getOP_END_TIME());
		out.setINPUT_DATE(item.getINPUT_DATE());
		return out;
	}

}
