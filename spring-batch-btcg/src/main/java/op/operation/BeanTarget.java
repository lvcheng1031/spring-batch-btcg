package op.operation;

public class BeanTarget {
	String SEQ,OPERATION_ID,OPERATE_NAME,OPERATE_CD,TARGET_POSITION,POSITION_CODE_SYSTEM,POSITION_CD,PROCEDURE_METHOD,PROCEDURE_TIME,PROCEDURE_CODE_SYSTEM,EVENT_START_TIME,EVENT_END_TIME,INPUT_DATE;

	public String getSEQ() {
		return SEQ;
	}

	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}

	public String getOPERATION_ID() {
		return OPERATION_ID;
	}

	public void setOPERATION_ID(String oPERATION_ID) {
		OPERATION_ID = oPERATION_ID;
	}

	public String getOPERATE_NAME() {
		return OPERATE_NAME;
	}

	public void setOPERATE_NAME(String oPERATE_NAME) {
		OPERATE_NAME = oPERATE_NAME;
	}

	public String getOPERATE_CD() {
		return OPERATE_CD;
	}

	public void setOPERATE_CD(String oPERATE_CD) {
		OPERATE_CD = oPERATE_CD;
	}

	public String getTARGET_POSITION() {
		return TARGET_POSITION;
	}

	public void setTARGET_POSITION(String tARGET_POSITION) {
		TARGET_POSITION = tARGET_POSITION;
	}

	public String getPOSITION_CODE_SYSTEM() {
		return POSITION_CODE_SYSTEM;
	}

	public void setPOSITION_CODE_SYSTEM(String pOSITION_CODE_SYSTEM) {
		POSITION_CODE_SYSTEM = pOSITION_CODE_SYSTEM;
	}

	public String getPOSITION_CD() {
		return POSITION_CD;
	}

	public void setPOSITION_CD(String pOSITION_CD) {
		POSITION_CD = pOSITION_CD;
	}

	public String getPROCEDURE_METHOD() {
		return PROCEDURE_METHOD;
	}

	public void setPROCEDURE_METHOD(String pROCEDURE_METHOD) {
		PROCEDURE_METHOD = pROCEDURE_METHOD;
	}

	public String getPROCEDURE_TIME() {
		return PROCEDURE_TIME;
	}

	public void setPROCEDURE_TIME(String pROCEDURE_TIME) {
		PROCEDURE_TIME = pROCEDURE_TIME;
	}

	public String getPROCEDURE_CODE_SYSTEM() {
		return PROCEDURE_CODE_SYSTEM;
	}

	public void setPROCEDURE_CODE_SYSTEM(String pROCEDURE_CODE_SYSTEM) {
		PROCEDURE_CODE_SYSTEM = pROCEDURE_CODE_SYSTEM;
	}

	public String getEVENT_START_TIME() {
		return EVENT_START_TIME;
	}

	public void setEVENT_START_TIME(String eVENT_START_TIME) {
		EVENT_START_TIME = eVENT_START_TIME;
	}

	public String getEVENT_END_TIME() {
		return EVENT_END_TIME;
	}

	public void setEVENT_END_TIME(String eVENT_END_TIME) {
		EVENT_END_TIME = eVENT_END_TIME;
	}

	public String getINPUT_DATE() {
		return INPUT_DATE;
	}

	public void setINPUT_DATE(String iNPUT_DATE) {
		INPUT_DATE = iNPUT_DATE;
	}

	@Override
	public String toString() {
		return "BeanTarget [SEQ=" + SEQ + ", OPERATION_ID=" + OPERATION_ID + ", OPERATE_NAME=" + OPERATE_NAME
				+ ", OPERATE_CD=" + OPERATE_CD + ", TARGET_POSITION=" + TARGET_POSITION + ", POSITION_CODE_SYSTEM="
				+ POSITION_CODE_SYSTEM + ", POSITION_CD=" + POSITION_CD + ", PROCEDURE_METHOD=" + PROCEDURE_METHOD
				+ ", PROCEDURE_TIME=" + PROCEDURE_TIME + ", PROCEDURE_CODE_SYSTEM=" + PROCEDURE_CODE_SYSTEM
				+ ", EVENT_START_TIME=" + EVENT_START_TIME + ", EVENT_END_TIME=" + EVENT_END_TIME + ", INPUT_DATE="
				+ INPUT_DATE + "]";
	}
	
}
