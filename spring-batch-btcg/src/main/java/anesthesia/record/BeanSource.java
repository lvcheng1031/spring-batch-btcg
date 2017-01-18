package anesthesia.record;

public class BeanSource {
	String PATIENT_ID,VISIT_ID,OPER_ID,RESERVED5, ANESTHESIA_METHOD,ANESTHESIA_DOCTOR,ANES_START_TIME,ANES_END_TIME,ASA_GRADE,ITEM_VALUE,OPERATION_POSITION,PRE_ANES_PHAM,WEIGHT,ENTER_DATE_TIME,IN_DATE_TIME,OUT_DATE_TIME,SCHEDULED_DATE_TIME;

	
	
	public String getSCHEDULED_DATE_TIME() {
		return SCHEDULED_DATE_TIME;
	}

	public void setSCHEDULED_DATE_TIME(String sCHEDULED_DATE_TIME) {
		SCHEDULED_DATE_TIME = sCHEDULED_DATE_TIME;
	}

	public String getIN_DATE_TIME() {
		return IN_DATE_TIME;
	}

	public void setIN_DATE_TIME(String iN_DATE_TIME) {
		IN_DATE_TIME = iN_DATE_TIME;
	}

	public String getOUT_DATE_TIME() {
		return OUT_DATE_TIME;
	}

	public void setOUT_DATE_TIME(String oUT_DATE_TIME) {
		OUT_DATE_TIME = oUT_DATE_TIME;
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

	public String getRESERVED5() {
		return RESERVED5;
	}

	public void setRESERVED5(String rESERVED5) {
		RESERVED5 = rESERVED5;
	}

	public String getANESTHESIA_METHOD() {
		return ANESTHESIA_METHOD;
	}

	public void setANESTHESIA_METHOD(String aNESTHESIA_METHOD) {
		ANESTHESIA_METHOD = aNESTHESIA_METHOD;
	}

	public String getANESTHESIA_DOCTOR() {
		return ANESTHESIA_DOCTOR;
	}

	public void setANESTHESIA_DOCTOR(String aNESTHESIA_DOCTOR) {
		ANESTHESIA_DOCTOR = aNESTHESIA_DOCTOR;
	}

	public String getANES_START_TIME() {
		return ANES_START_TIME;
	}

	public void setANES_START_TIME(String aNES_START_TIME) {
		ANES_START_TIME = aNES_START_TIME;
	}

	public String getANES_END_TIME() {
		return ANES_END_TIME;
	}

	public void setANES_END_TIME(String aNES_END_TIME) {
		ANES_END_TIME = aNES_END_TIME;
	}

	public String getASA_GRADE() {
		return ASA_GRADE;
	}

	public void setASA_GRADE(String aSA_GRADE) {
		ASA_GRADE = aSA_GRADE;
	}

	public String getITEM_VALUE() {
		return ITEM_VALUE;
	}

	public void setITEM_VALUE(String iTEM_VALUE) {
		ITEM_VALUE = iTEM_VALUE;
	}

	public String getOPERATION_POSITION() {
		return OPERATION_POSITION;
	}

	public void setOPERATION_POSITION(String oPERATION_POSITION) {
		OPERATION_POSITION = oPERATION_POSITION;
	}

	public String getPRE_ANES_PHAM() {
		return PRE_ANES_PHAM;
	}

	public void setPRE_ANES_PHAM(String pRE_ANES_PHAM) {
		PRE_ANES_PHAM = pRE_ANES_PHAM;
	}

	public String getWEIGHT() {
		return WEIGHT;
	}

	public void setWEIGHT(String wEIGHT) {
		WEIGHT = wEIGHT;
	}
	
	
	public String getENTER_DATE_TIME() {
		return ENTER_DATE_TIME;
	}

	public void setENTER_DATE_TIME(String eNTER_DATE_TIME) {
		ENTER_DATE_TIME = eNTER_DATE_TIME;
	}

	@Override
	public String toString() {
		return "BeanSource [PATIENT_ID=" + PATIENT_ID + ", VISIT_ID=" + VISIT_ID + ", OPER_ID=" + OPER_ID
				+ ", RESERVED5=" + RESERVED5 + ", ANESTHESIA_METHOD=" + ANESTHESIA_METHOD + ", ANESTHESIA_DOCTOR="
				+ ANESTHESIA_DOCTOR + ", ANES_START_TIME=" + ANES_START_TIME + ", ANES_END_TIME=" + ANES_END_TIME
				+ ", ASA_GRADE=" + ASA_GRADE + ", ITEM_VALUE=" + ITEM_VALUE + ", OPERATION_POSITION="
				+ OPERATION_POSITION + ", PRE_ANES_PHAM=" + PRE_ANES_PHAM + ", WEIGHT=" + WEIGHT + ", ENTER_DATE_TIME="
				+ ENTER_DATE_TIME + ", IN_DATE_TIME=" + IN_DATE_TIME + ", OUT_DATE_TIME=" + OUT_DATE_TIME
				+ ", SCHEDULED_DATE_TIME=" + SCHEDULED_DATE_TIME + "]";
	}

	
	
}
