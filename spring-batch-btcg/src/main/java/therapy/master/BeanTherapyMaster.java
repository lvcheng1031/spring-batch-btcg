package therapy.master;

public class BeanTherapyMaster {
	String THERAPY_ID,THERAPY_CLASS,THERAPY_SUBCLASS,PATIENT_ID,PATIENT_NAME,SEX,DATE_OF_BIRTH,VISIT_TYPE,VISIT_ID,VISIT_DEPT,NURSE_STATION,BED_NO,DIAGNOSIS,DEPT_PHONE_NO,ORDER_DOCTOR_ID,ORDER_DOCTOR_NAME,ORDER_TIME,FORM_STATUS,DEAL_EMP_ID,DEAL_EMP_NAME,DEAL_TIME,THERAPY_DEPT_ID,PRINT_TIME;

	public String getTHERAPY_ID() {
		return THERAPY_ID;
	}

	public void setTHERAPY_ID(String tHERAPY_ID) {
		THERAPY_ID = tHERAPY_ID;
	}

	public String getTHERAPY_CLASS() {
		return THERAPY_CLASS;
	}

	public void setTHERAPY_CLASS(String tHERAPY_CLASS) {
		THERAPY_CLASS = tHERAPY_CLASS;
	}

	public String getTHERAPY_SUBCLASS() {
		return THERAPY_SUBCLASS;
	}

	public void setTHERAPY_SUBCLASS(String tHERAPY_SUBCLASS) {
		THERAPY_SUBCLASS = tHERAPY_SUBCLASS;
	}

	public String getPATIENT_ID() {
		return PATIENT_ID;
	}

	public void setPATIENT_ID(String pATIENT_ID) {
		PATIENT_ID = pATIENT_ID;
	}

	public String getPATIENT_NAME() {
		return PATIENT_NAME;
	}

	public void setPATIENT_NAME(String pATIENT_NAME) {
		PATIENT_NAME = pATIENT_NAME;
	}

	public String getSEX() {
		return SEX;
	}

	public void setSEX(String sEX) {
		SEX = sEX;
	}

	public String getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}

	public void setDATE_OF_BIRTH(String dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}

	public String getVISIT_TYPE() {
		return VISIT_TYPE;
	}

	public void setVISIT_TYPE(String vISIT_TYPE) {
		VISIT_TYPE = vISIT_TYPE;
	}

	public String getVISIT_ID() {
		return VISIT_ID;
	}

	public void setVISIT_ID(String vISIT_ID) {
		VISIT_ID = vISIT_ID;
	}

	public String getVISIT_DEPT() {
		return VISIT_DEPT;
	}

	public void setVISIT_DEPT(String vISIT_DEPT) {
		VISIT_DEPT = vISIT_DEPT;
	}

	public String getNURSE_STATION() {
		return NURSE_STATION;
	}

	public void setNURSE_STATION(String nURSE_STATION) {
		NURSE_STATION = nURSE_STATION;
	}

	public String getBED_NO() {
		return BED_NO;
	}

	public void setBED_NO(String bED_NO) {
		BED_NO = bED_NO;
	}

	public String getDIAGNOSIS() {
		return DIAGNOSIS;
	}

	public void setDIAGNOSIS(String dIAGNOSIS) {
		DIAGNOSIS = dIAGNOSIS;
	}

	public String getDEPT_PHONE_NO() {
		return DEPT_PHONE_NO;
	}

	public void setDEPT_PHONE_NO(String dEPT_PHONE_NO) {
		DEPT_PHONE_NO = dEPT_PHONE_NO;
	}

	public String getORDER_DOCTOR_ID() {
		return ORDER_DOCTOR_ID;
	}

	public void setORDER_DOCTOR_ID(String oRDER_DOCTOR_ID) {
		ORDER_DOCTOR_ID = oRDER_DOCTOR_ID;
	}

	public String getORDER_DOCTOR_NAME() {
		return ORDER_DOCTOR_NAME;
	}

	public void setORDER_DOCTOR_NAME(String oRDER_DOCTOR_NAME) {
		ORDER_DOCTOR_NAME = oRDER_DOCTOR_NAME;
	}

	public String getORDER_TIME() {
		return ORDER_TIME;
	}

	public void setORDER_TIME(String oRDER_TIME) {
		ORDER_TIME = oRDER_TIME;
	}

	public String getFORM_STATUS() {
		return FORM_STATUS;
	}

	public void setFORM_STATUS(String fORM_STATUS) {
		FORM_STATUS = fORM_STATUS;
	}

	public String getDEAL_EMP_ID() {
		return DEAL_EMP_ID;
	}

	public void setDEAL_EMP_ID(String dEAL_EMP_ID) {
		DEAL_EMP_ID = dEAL_EMP_ID;
	}

	public String getDEAL_EMP_NAME() {
		return DEAL_EMP_NAME;
	}

	public void setDEAL_EMP_NAME(String dEAL_EMP_NAME) {
		DEAL_EMP_NAME = dEAL_EMP_NAME;
	}

	public String getDEAL_TIME() {
		return DEAL_TIME;
	}

	public void setDEAL_TIME(String dEAL_TIME) {
		DEAL_TIME = dEAL_TIME;
	}

	public String getTHERAPY_DEPT_ID() {
		return THERAPY_DEPT_ID;
	}

	public void setTHERAPY_DEPT_ID(String tHERAPY_DEPT_ID) {
		THERAPY_DEPT_ID = tHERAPY_DEPT_ID;
	}

	public String getPRINT_TIME() {
		return PRINT_TIME;
	}

	public void setPRINT_TIME(String pRINT_TIME) {
		PRINT_TIME = pRINT_TIME;
	}

	@Override
	public String toString() {
		return "BeanTherapyMaster [THERAPY_ID=" + THERAPY_ID + ", THERAPY_CLASS=" + THERAPY_CLASS
				+ ", THERAPY_SUBCLASS=" + THERAPY_SUBCLASS + ", PATIENT_ID=" + PATIENT_ID + ", PATIENT_NAME="
				+ PATIENT_NAME + ", SEX=" + SEX + ", DATE_OF_BIRTH=" + DATE_OF_BIRTH + ", VISIT_TYPE=" + VISIT_TYPE
				+ ", VISIT_ID=" + VISIT_ID + ", VISIT_DEPT=" + VISIT_DEPT + ", NURSE_STATION=" + NURSE_STATION
				+ ", BED_NO=" + BED_NO + ", DIAGNOSIS=" + DIAGNOSIS + ", DEPT_PHONE_NO=" + DEPT_PHONE_NO
				+ ", ORDER_DOCTOR_ID=" + ORDER_DOCTOR_ID + ", ORDER_DOCTOR_NAME=" + ORDER_DOCTOR_NAME + ", ORDER_TIME="
				+ ORDER_TIME + ", FORM_STATUS=" + FORM_STATUS + ", DEAL_EMP_ID=" + DEAL_EMP_ID + ", DEAL_EMP_NAME="
				+ DEAL_EMP_NAME + ", DEAL_TIME=" + DEAL_TIME + ", THERAPY_DEPT_ID=" + THERAPY_DEPT_ID + ", PRINT_TIME="
				+ PRINT_TIME + "]";
	}
	
}
