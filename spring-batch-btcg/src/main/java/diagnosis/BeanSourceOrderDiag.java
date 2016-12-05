package diagnosis;

public class BeanSourceOrderDiag {
	String DIAG_NO;
	String VISIT_ID;
	String PATIENT_ID;
	String DIAG_TYPE_ID;
	String DIAG_SQNO;
	String INPUT_TIME;
	String USER_ID;
	String USER_NAME;
	String DIAG_CODE;
	String DIAG_NAME;
	public String getDIAG_NO() {
		return DIAG_NO;
	}
	public void setDIAG_NO(String dIAG_NO) {
		DIAG_NO = dIAG_NO;
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
	public String getDIAG_TYPE_ID() {
		return DIAG_TYPE_ID;
	}
	public void setDIAG_TYPE_ID(String dIAG_TYPE_ID) {
		DIAG_TYPE_ID = dIAG_TYPE_ID;
	}
	public String getDIAG_SQNO() {
		return DIAG_SQNO;
	}
	public void setDIAG_SQNO(String dIAG_SQNO) {
		DIAG_SQNO = dIAG_SQNO;
	}
	public String getINPUT_TIME() {
		return INPUT_TIME;
	}
	public void setINPUT_TIME(String iNPUT_TIME) {
		INPUT_TIME = iNPUT_TIME;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getDIAG_CODE() {
		return DIAG_CODE;
	}
	public void setDIAG_CODE(String dIAG_CODE) {
		DIAG_CODE = dIAG_CODE;
	}
	public String getDIAG_NAME() {
		return DIAG_NAME;
	}
	public void setDIAG_NAME(String dIAG_NAME) {
		DIAG_NAME = dIAG_NAME;
	}
	@Override
	public String toString() {
		return "BeanSourceOrderDiag [DIAG_NO=" + DIAG_NO + ", VISIT_ID=" + VISIT_ID + ", PATIENT_ID=" + PATIENT_ID
				+ ", DIAG_TYPE_ID=" + DIAG_TYPE_ID + ", DIAG_SQNO=" + DIAG_SQNO + ", INPUT_TIME=" + INPUT_TIME
				+ ", USER_ID=" + USER_ID + ", USER_NAME=" + USER_NAME + ", DIAG_CODE=" + DIAG_CODE + ", DIAG_NAME="
				+ DIAG_NAME + "]";
	}
	
}
