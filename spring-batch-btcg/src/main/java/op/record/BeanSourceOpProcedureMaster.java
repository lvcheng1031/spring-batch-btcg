package op.record;

public class BeanSourceOpProcedureMaster {
	String PROCEDURE_ID,VISIT_ID,PATIENT_ID,SURGEON_ID,SURGEON_NAME,OP_DEPT_ID,OP_DEPT_NAME,OP_START_TIME,OP_END_TIME,INPUT_DATE;

	public String getPROCEDURE_ID() {
		return PROCEDURE_ID;
	}

	public void setPROCEDURE_ID(String pROCEDURE_ID) {
		PROCEDURE_ID = pROCEDURE_ID;
	}

	public String getVISIT_ID() {
		return VISIT_ID;
	}

	public void setVISIT_ID(String vISIT_ID) {
		VISIT_ID = vISIT_ID;
	}

	public String getPATIENT_ID() {
		return PATIENT_ID;
	}

	public void setPATIENT_ID(String pATIENT_ID) {
		PATIENT_ID = pATIENT_ID;
	}

	public String getSURGEON_ID() {
		return SURGEON_ID;
	}

	public void setSURGEON_ID(String sURGEON_ID) {
		SURGEON_ID = sURGEON_ID;
	}

	public String getSURGEON_NAME() {
		return SURGEON_NAME;
	}

	public void setSURGEON_NAME(String sURGEON_NAME) {
		SURGEON_NAME = sURGEON_NAME;
	}

	public String getOP_DEPT_ID() {
		return OP_DEPT_ID;
	}

	public void setOP_DEPT_ID(String oP_DEPT_ID) {
		OP_DEPT_ID = oP_DEPT_ID;
	}

	public String getOP_DEPT_NAME() {
		return OP_DEPT_NAME;
	}

	public void setOP_DEPT_NAME(String oP_DEPT_NAME) {
		OP_DEPT_NAME = oP_DEPT_NAME;
	}

	public String getOP_START_TIME() {
		return OP_START_TIME;
	}

	public void setOP_START_TIME(String oP_START_TIME) {
		OP_START_TIME = oP_START_TIME;
	}

	public String getOP_END_TIME() {
		return OP_END_TIME;
	}

	public void setOP_END_TIME(String oP_END_TIME) {
		OP_END_TIME = oP_END_TIME;
	}

	public String getINPUT_DATE() {
		return INPUT_DATE;
	}

	public void setINPUT_DATE(String iNPUT_DATE) {
		INPUT_DATE = iNPUT_DATE;
	}

	@Override
	public String toString() {
		return "BeanSourceOperationRecord [PROCEDURE_ID=" + PROCEDURE_ID + ", VISIT_ID=" + VISIT_ID + ", PATIENT_ID="
				+ PATIENT_ID + ", SURGEON_ID=" + SURGEON_ID + ", SURGEON_NAME=" + SURGEON_NAME + ", OP_DEPT_ID="
				+ OP_DEPT_ID + ", OP_DEPT_NAME=" + OP_DEPT_NAME + ", OP_START_TIME=" + OP_START_TIME + ", OP_END_TIME="
				+ OP_END_TIME + ", INPUT_DATE=" + INPUT_DATE + "]";
	}
	
}
