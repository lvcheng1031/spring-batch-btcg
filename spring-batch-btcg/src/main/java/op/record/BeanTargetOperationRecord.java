package op.record;

public class BeanTargetOperationRecord {
	String OPERATION_ID,VISIT_ID,CASE_OBJECT_ID,OPERATOR_ID,OPERATOR_NAME,DEPARTMENT_NAME,DEPARTMENT_ID,HOSPITAL_DEPARTMENT_ID,HOSPITAL_DEPARTMENT_NAME,OPERATION_BEGIN_DT,OPERATION_END_DT,INPUT_DATE;

	public String getOPERATION_ID() {
		return OPERATION_ID;
	}

	public void setOPERATION_ID(String oPERATION_ID) {
		OPERATION_ID = oPERATION_ID;
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

	public String getOPERATOR_ID() {
		return OPERATOR_ID;
	}

	public void setOPERATOR_ID(String oPERATOR_ID) {
		OPERATOR_ID = oPERATOR_ID;
	}

	public String getOPERATOR_NAME() {
		return OPERATOR_NAME;
	}

	public void setOPERATOR_NAME(String oPERATOR_NAME) {
		OPERATOR_NAME = oPERATOR_NAME;
	}

	public String getDEPARTMENT_NAME() {
		return DEPARTMENT_NAME;
	}

	public void setDEPARTMENT_NAME(String dEPARTMENT_NAME) {
		DEPARTMENT_NAME = dEPARTMENT_NAME;
	}

	public String getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}

	public void setDEPARTMENT_ID(String dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
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

	public String getOPERATION_BEGIN_DT() {
		return OPERATION_BEGIN_DT;
	}

	public void setOPERATION_BEGIN_DT(String oPERATION_BEGIN_DT) {
		OPERATION_BEGIN_DT = oPERATION_BEGIN_DT;
	}

	public String getOPERATION_END_DT() {
		return OPERATION_END_DT;
	}

	public void setOPERATION_END_DT(String oPERATION_END_DT) {
		OPERATION_END_DT = oPERATION_END_DT;
	}

	public String getINPUT_DATE() {
		return INPUT_DATE;
	}

	public void setINPUT_DATE(String iNPUT_DATE) {
		INPUT_DATE = iNPUT_DATE;
	}

	@Override
	public String toString() {
		return "BeanTargetOperationRecord [OPERATION_ID=" + OPERATION_ID + ", VISIT_ID=" + VISIT_ID
				+ ", CASE_OBJECT_ID=" + CASE_OBJECT_ID + ", OPERATOR_ID=" + OPERATOR_ID + ", OPERATOR_NAME="
				+ OPERATOR_NAME + ", DEPARTMENT_NAME=" + DEPARTMENT_NAME + ", DEPARTMENT_ID=" + DEPARTMENT_ID
				+ ", HOSPITAL_DEPARTMENT_ID=" + HOSPITAL_DEPARTMENT_ID + ", HOSPITAL_DEPARTMENT_NAME="
				+ HOSPITAL_DEPARTMENT_NAME + ", OPERATION_BEGIN_DT=" + OPERATION_BEGIN_DT + ", OPERATION_END_DT="
				+ OPERATION_END_DT + ", INPUT_DATE=" + INPUT_DATE + "]";
	}
	
}
