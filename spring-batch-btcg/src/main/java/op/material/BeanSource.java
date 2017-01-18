package op.material;

public class BeanSource {
	String EVENT_ID,PROCEDURE_ID,ITEM_NAME,AMOUNT,UNIT,EVENT_START_TIME,EVENT_END_TIME,INPUT_DATE;

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

	public String getITEM_NAME() {
		return ITEM_NAME;
	}

	public void setITEM_NAME(String iTEM_NAME) {
		ITEM_NAME = iTEM_NAME;
	}

	public String getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
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
		return "BeanSource [EVENT_ID=" + EVENT_ID + ", PROCEDURE_ID=" + PROCEDURE_ID + ", ITEM_NAME=" + ITEM_NAME
				+ ", AMOUNT=" + AMOUNT + ", UNIT=" + UNIT + ", EVENT_START_TIME=" + EVENT_START_TIME
				+ ", EVENT_END_TIME=" + EVENT_END_TIME + ", INPUT_DATE=" + INPUT_DATE + "]";
	}
	
}
