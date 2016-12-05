package visitrecord.adm;

public class BeanSourceAdmVisitMaster {
	String VISIT_ID,PATIENT_ID,DOCTOR_ID,DOCTOR_NAME,LAST_DEPT_ID,VISIT_DATE,SOURCE,PAYER_TYPE,VISIT_TYPE;

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

	public String getDOCTOR_ID() {
		return DOCTOR_ID;
	}

	public void setDOCTOR_ID(String dOCTOR_ID) {
		DOCTOR_ID = dOCTOR_ID;
	}

	public String getDOCTOR_NAME() {
		return DOCTOR_NAME;
	}

	public void setDOCTOR_NAME(String dOCTOR_NAME) {
		DOCTOR_NAME = dOCTOR_NAME;
	}

	public String getLAST_DEPT_ID() {
		return LAST_DEPT_ID;
	}

	public void setLAST_DEPT_ID(String lAST_DEPT_ID) {
		LAST_DEPT_ID = lAST_DEPT_ID;
	}

	public String getVISIT_DATE() {
		return VISIT_DATE;
	}

	public void setVISIT_DATE(String vISIT_DATE) {
		VISIT_DATE = vISIT_DATE;
	}

	public String getSOURCE() {
		return SOURCE;
	}

	public void setSOURCE(String sOURCE) {
		SOURCE = sOURCE;
	}

	public String getPAYER_TYPE() {
		return PAYER_TYPE;
	}

	public void setPAYER_TYPE(String pAYER_TYPE) {
		PAYER_TYPE = pAYER_TYPE;
	}

	public String getVISIT_TYPE() {
		return VISIT_TYPE;
	}

	public void setVISIT_TYPE(String vISIT_TYPE) {
		VISIT_TYPE = vISIT_TYPE;
	}

	@Override
	public String toString() {
		return "BeanSourceAdmVisitMaster [VISIT_ID=" + VISIT_ID + ", PATIENT_ID=" + PATIENT_ID + ", DOCTOR_ID="
				+ DOCTOR_ID + ", DOCTOR_NAME=" + DOCTOR_NAME + ", LAST_DEPT_ID=" + LAST_DEPT_ID + ", VISIT_DATE="
				+ VISIT_DATE + ", SOURCE=" + SOURCE + ", PAYER_TYPE=" + PAYER_TYPE + ", VISIT_TYPE=" + VISIT_TYPE + "]";
	}
	
}
