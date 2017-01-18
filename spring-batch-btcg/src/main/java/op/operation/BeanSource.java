package op.operation;

public class BeanSource {
	String EVENT_ID,PROCEDURE_ID,OPERATE_NAME,OP_CLASS_CODE,OPERATE_POSITON,EVENT_START_TIME,EVENT_END_TIME,INPUT_DATE;

	public String getEVENT_ID() {
		return EVENT_ID;
	}

	public void setEVENT_ID(String eVENT_ID) {
		EVENT_ID = eVENT_ID;
	}

	public String getPROCEDURE_ID() {
		return PROCEDURE_ID;
	}

	public void setPROCEDURE_ID(String pROCEDURE_ID) {
		PROCEDURE_ID = pROCEDURE_ID;
	}

	public String getOPERATE_NAME() {
		return OPERATE_NAME;
	}

	public void setOPERATE_NAME(String oPERATE_NAME) {
		OPERATE_NAME = oPERATE_NAME;
	}

	public String getOP_CLASS_CODE() {
		return OP_CLASS_CODE;
	}

	public void setOP_CLASS_CODE(String oP_CLASS_CODE) {
		OP_CLASS_CODE = oP_CLASS_CODE;
	}

	public String getOPERATE_POSITON() {
		return OPERATE_POSITON;
	}

	public void setOPERATE_POSITON(String oPERATE_POSITON) {
		OPERATE_POSITON = oPERATE_POSITON;
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
		return "BeanSource [EVENT_ID=" + EVENT_ID + ", PROCEDURE_ID=" + PROCEDURE_ID + ", OPERATE_NAME=" + OPERATE_NAME
				+ ", OP_CLASS_CODE=" + OP_CLASS_CODE + ", OPERATE_POSITON=" + OPERATE_POSITON + ", EVENT_START_TIME="
				+ EVENT_START_TIME + ", EVENT_END_TIME=" + EVENT_END_TIME + ", INPUT_DATE=" + INPUT_DATE + "]";
	}
	
}
