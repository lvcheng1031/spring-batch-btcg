package op.material;

public class BeanTargetOperationMaterialRecord {
	String SEQ,OPERATION_ID,INTERVENTION_NAME,INTERVENTION_NUM,UNIT,EVENT_START_TIME,EVENT_END_TIME,INPUT_DATE;

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

	public String getINTERVENTION_NAME() {
		return INTERVENTION_NAME;
	}

	public void setINTERVENTION_NAME(String iNTERVENTION_NAME) {
		INTERVENTION_NAME = iNTERVENTION_NAME;
	}

	public String getINTERVENTION_NUM() {
		return INTERVENTION_NUM;
	}

	public void setINTERVENTION_NUM(String iNTERVENTION_NUM) {
		INTERVENTION_NUM = iNTERVENTION_NUM;
	}

	public String getUNIT() {
		return UNIT;
	}

	public void setUNIT(String uNIT) {
		UNIT = uNIT;
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
		return "BeanTargetOperationMaterialRecord [SEQ=" + SEQ + ", OPERATION_ID=" + OPERATION_ID
				+ ", INTERVENTION_NAME=" + INTERVENTION_NAME + ", INTERVENTION_NUM=" + INTERVENTION_NUM + ", UNIT="
				+ UNIT + ", EVENT_START_TIME=" + EVENT_START_TIME + ", EVENT_END_TIME=" + EVENT_END_TIME
				+ ", INPUT_DATE=" + INPUT_DATE + "]";
	}
	
}
