package therapy.assess;

public class BeanTherapyAssess {
	String ASSESS_NO,ITEM_SQNO,ASSESS_TYPE,PATIENT_ID,REP_SECTION_CODE,ITEM_CODE,ITEM_NAME,ASSESS_VALUE,RECORD_DATE,RECORD_EMP_ID,RECORD_EMP,VALID_MARK,NOTE,THERAPY_ID;

	public String getASSESS_NO() {
		return ASSESS_NO;
	}

	public void setASSESS_NO(String aSSESS_NO) {
		ASSESS_NO = aSSESS_NO;
	}

	public String getITEM_SQNO() {
		return ITEM_SQNO;
	}

	public void setITEM_SQNO(String iTEM_SQNO) {
		ITEM_SQNO = iTEM_SQNO;
	}

	public String getASSESS_TYPE() {
		return ASSESS_TYPE;
	}

	public void setASSESS_TYPE(String aSSESS_TYPE) {
		ASSESS_TYPE = aSSESS_TYPE;
	}

	public String getPATIENT_ID() {
		return PATIENT_ID;
	}

	public void setPATIENT_ID(String pATIENT_ID) {
		PATIENT_ID = pATIENT_ID;
	}

	public String getREP_SECTION_CODE() {
		return REP_SECTION_CODE;
	}

	public void setREP_SECTION_CODE(String rEP_SECTION_CODE) {
		REP_SECTION_CODE = rEP_SECTION_CODE;
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

	public String getASSESS_VALUE() {
		return ASSESS_VALUE;
	}

	public void setASSESS_VALUE(String aSSESS_VALUE) {
		ASSESS_VALUE = aSSESS_VALUE;
	}

	public String getRECORD_DATE() {
		return RECORD_DATE;
	}

	public void setRECORD_DATE(String rECORD_DATE) {
		RECORD_DATE = rECORD_DATE;
	}

	public String getRECORD_EMP_ID() {
		return RECORD_EMP_ID;
	}

	public void setRECORD_EMP_ID(String rECORD_EMP_ID) {
		RECORD_EMP_ID = rECORD_EMP_ID;
	}

	public String getRECORD_EMP() {
		return RECORD_EMP;
	}

	public void setRECORD_EMP(String rECORD_EMP) {
		RECORD_EMP = rECORD_EMP;
	}

	public String getVALID_MARK() {
		return VALID_MARK;
	}

	public void setVALID_MARK(String vALID_MARK) {
		VALID_MARK = vALID_MARK;
	}

	public String getNOTE() {
		return NOTE;
	}

	public void setNOTE(String nOTE) {
		NOTE = nOTE;
	}

	public String getTHERAPY_ID() {
		return THERAPY_ID;
	}

	public void setTHERAPY_ID(String tHERAPY_ID) {
		THERAPY_ID = tHERAPY_ID;
	}

	@Override
	public String toString() {
		return "BeanTherapyAssess [ASSESS_NO=" + ASSESS_NO + ", ITEM_SQNO=" + ITEM_SQNO + ", ASSESS_TYPE=" + ASSESS_TYPE
				+ ", PATIENT_ID=" + PATIENT_ID + ", REP_SECTION_CODE=" + REP_SECTION_CODE + ", ITEM_CODE=" + ITEM_CODE
				+ ", ITEM_NAME=" + ITEM_NAME + ", ASSESS_VALUE=" + ASSESS_VALUE + ", RECORD_DATE=" + RECORD_DATE
				+ ", RECORD_EMP_ID=" + RECORD_EMP_ID + ", RECORD_EMP=" + RECORD_EMP + ", VALID_MARK=" + VALID_MARK
				+ ", NOTE=" + NOTE + ", THERAPY_ID=" + THERAPY_ID + "]";
	}
	
}
