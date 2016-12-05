package prescription;

public class BeanTargetPrescriptionRecord {
	String PRESCRIPTION_ID;
	String VISIT_ID;
	String CASE_OBJECT_ID;
	String DOCTOR_ID;
	String DOCTOR_NAME;
	String HOSPITAL_DEPARTMENT_ID;
	String HOSPITAL_DEPARTMENT_NAME;
	String OPEN_ORDERS_TIME;
	public String getPRESCRIPTION_ID() {
		return PRESCRIPTION_ID;
	}
	public void setPRESCRIPTION_ID(String pRESCRIPTION_ID) {
		PRESCRIPTION_ID = pRESCRIPTION_ID;
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
	public String getHOSPITAL_DEPARTMENT_ID() {
		return HOSPITAL_DEPARTMENT_ID;
	}
	public void setHOSPITAL_DEPARTMENT_ID(String hOSPITAL_DEPARTMENT_ID) {
		HOSPITAL_DEPARTMENT_ID = hOSPITAL_DEPARTMENT_ID;
	}
	public String getHOSPITAL_DEPARTMENT_NAME() {
		return HOSPITAL_DEPARTMENT_NAME;
	}
	public void setHOSPITAL_DEPARTMENT_NAME(String hOSPITAL_DEPARTMENT_NAME) {
		HOSPITAL_DEPARTMENT_NAME = hOSPITAL_DEPARTMENT_NAME;
	}
	public String getOPEN_ORDERS_TIME() {
		return OPEN_ORDERS_TIME;
	}
	public void setOPEN_ORDERS_TIME(String oPEN_ORDERS_TIME) {
		OPEN_ORDERS_TIME = oPEN_ORDERS_TIME;
	}
	@Override
	public String toString() {
		return "BeanTargetPrescriptionRecord [PRESCRIPTION_ID=" + PRESCRIPTION_ID + ", VISIT_ID=" + VISIT_ID
				+ ", CASE_OBJECT_ID=" + CASE_OBJECT_ID + ", DOCTOR_ID=" + DOCTOR_ID + ", DOCTOR_NAME=" + DOCTOR_NAME
				+ ", HOSPITAL_DEPARTMENT_ID=" + HOSPITAL_DEPARTMENT_ID + ", HOSPITAL_DEPARTMENT_NAME="
				+ HOSPITAL_DEPARTMENT_NAME + ", OPEN_ORDERS_TIME=" + OPEN_ORDERS_TIME + "]";
	}
	
}
