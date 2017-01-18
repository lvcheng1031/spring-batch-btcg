package anesthesia.anaesthetic;

public class BeanSource {
	String PATIENT_ID,VISIT_ID,OPER_ID,ITEM_NO,ITEM_CLASS,ITEM_CODE,ITEM_NAME,DOSAGE,START_TIME,END_DATE,EVENT_NO;

	public String getEVENT_NO() {
		return EVENT_NO;
	}

	public void setEVENT_NO(String eVENT_NO) {
		EVENT_NO = eVENT_NO;
	}

	public String getPATIENT_ID() {
		return PATIENT_ID;
	}

	public void setPATIENT_ID(String pATIENT_ID) {
		PATIENT_ID = pATIENT_ID;
	}

	public String getVISIT_ID() {
		return VISIT_ID;
	}

	public void setVISIT_ID(String vISIT_ID) {
		VISIT_ID = vISIT_ID;
	}

	public String getOPER_ID() {
		return OPER_ID;
	}

	public void setOPER_ID(String oPER_ID) {
		OPER_ID = oPER_ID;
	}

	public String getITEM_NO() {
		return ITEM_NO;
	}

	public void setITEM_NO(String iTEM_NO) {
		ITEM_NO = iTEM_NO;
	}

	public String getITEM_CLASS() {
		return ITEM_CLASS;
	}

	public void setITEM_CLASS(String iTEM_CLASS) {
		ITEM_CLASS = iTEM_CLASS;
	}

	public String getITEM_CODE() {
		return ITEM_CODE;
	}

	public void setITEM_CODE(String iTEM_CODE) {
		ITEM_CODE = iTEM_CODE;
	}

	public String getITEM_NAME() {
		return ITEM_NAME;
	}

	public void setITEM_NAME(String iTEM_NAME) {
		ITEM_NAME = iTEM_NAME;
	}

	public String getDOSAGE() {
		return DOSAGE;
	}

	public void setDOSAGE(String dOSAGE) {
		DOSAGE = dOSAGE;
	}
	
	public String getSTART_TIME() {
		return START_TIME;
	}

	public void setSTART_TIME(String sTART_TIME) {
		START_TIME = sTART_TIME;
	}

	public String getEND_DATE() {
		return END_DATE;
	}

	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}

	@Override
	public String toString() {
		return "BeanSource [PATIENT_ID=" + PATIENT_ID + ", VISIT_ID=" + VISIT_ID + ", OPER_ID=" + OPER_ID + ", ITEM_NO="
				+ ITEM_NO + ", ITEM_CLASS=" + ITEM_CLASS + ", ITEM_CODE=" + ITEM_CODE + ", ITEM_NAME=" + ITEM_NAME
				+ ", DOSAGE=" + DOSAGE + ", START_TIME=" + START_TIME + ", END_DATE=" + END_DATE + "]";
	}
	
}
