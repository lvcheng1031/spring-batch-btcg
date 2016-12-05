package diagnosis;

public class BeanTargetDiagnosisRecord {
	String DIAGNOSIS_ID;
	String VISIT_ID;
	String CASE_OBJECT_ID;
	String DIAG_TYPE;
	String DIAG_NO;
	String DIAG_DATE;
	String DOCTOR_ID;
	String USER_NAME;
	String DIAG_CODE;
	String DIAG_NAME;
	public String getDIAGNOSIS_ID() {
		return DIAGNOSIS_ID;
	}
	public void setDIAGNOSIS_ID(String dIAGNOSIS_ID) {
		DIAGNOSIS_ID = dIAGNOSIS_ID;
	}
	public String getVISIT_ID() {
		return VISIT_ID;
	}
	public void setVISIT_ID(String vISIT_ID) {
		VISIT_ID = vISIT_ID;
	}
	public String getCASE_OBJECT_ID() {
		return CASE_OBJECT_ID;
	}
	public void setCASE_OBJECT_ID(String cASE_OBJECT_ID) {
		CASE_OBJECT_ID = cASE_OBJECT_ID;
	}
	public String getDIAG_TYPE() {
		return DIAG_TYPE;
	}
	public void setDIAG_TYPE(String dIAG_TYPE) {
		DIAG_TYPE = dIAG_TYPE;
	}
	public String getDIAG_NO() {
		return DIAG_NO;
	}
	public void setDIAG_NO(String dIAG_NO) {
		DIAG_NO = dIAG_NO;
	}
	public String getDIAG_DATE() {
		return DIAG_DATE;
	}
	public void setDIAG_DATE(String dIAG_DATE) {
		DIAG_DATE = dIAG_DATE;
	}
	public String getDOCTOR_ID() {
		return DOCTOR_ID;
	}
	public void setDOCTOR_ID(String dOCTOR_ID) {
		DOCTOR_ID = dOCTOR_ID;
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
		return "BeanTargetDiagnosisRecord [DIAGNOSIS_ID=" + DIAGNOSIS_ID + ", VISIT_ID=" + VISIT_ID
				+ ", CASE_OBJECT_ID=" + CASE_OBJECT_ID + ", DIAG_TYPE=" + DIAG_TYPE + ", DIAG_NO=" + DIAG_NO
				+ ", DIAG_DATE=" + DIAG_DATE + ", DOCTOR_ID=" + DOCTOR_ID + ", USER_NAME=" + USER_NAME + ", DIAG_CODE="
				+ DIAG_CODE + ", DIAG_NAME=" + DIAG_NAME + "]";
	}
	
}
