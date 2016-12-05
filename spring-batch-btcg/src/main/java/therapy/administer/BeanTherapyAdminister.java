package therapy.administer;

public class BeanTherapyAdminister {
	String THERAPY_VISIT_ID,THERAPY_PERIOD_ID,ASSESS_NO,PATIENT_ID,PATIENT_NAME,CHECKIN_DATE,RECORD_STATE,SUBMIT_DATE,SUBMIT_EMP_ID,CANCEL_EMP_ID,CANCEL_DATE,NOTE;

	public String getTHERAPY_VISIT_ID() {
		return THERAPY_VISIT_ID;
	}

	public void setTHERAPY_VISIT_ID(String tHERAPY_VISIT_ID) {
		THERAPY_VISIT_ID = tHERAPY_VISIT_ID;
	}

	public String getTHERAPY_PERIOD_ID() {
		return THERAPY_PERIOD_ID;
	}

	public void setTHERAPY_PERIOD_ID(String tHERAPY_PERIOD_ID) {
		THERAPY_PERIOD_ID = tHERAPY_PERIOD_ID;
	}

	public String getASSESS_NO() {
		return ASSESS_NO;
	}

	public void setASSESS_NO(String aSSESS_NO) {
		ASSESS_NO = aSSESS_NO;
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

	public String getCHECKIN_DATE() {
		return CHECKIN_DATE;
	}

	public void setCHECKIN_DATE(String cHECKIN_DATE) {
		CHECKIN_DATE = cHECKIN_DATE;
	}

	public String getRECORD_STATE() {
		return RECORD_STATE;
	}

	public void setRECORD_STATE(String rECORD_STATE) {
		RECORD_STATE = rECORD_STATE;
	}

	public String getSUBMIT_DATE() {
		return SUBMIT_DATE;
	}

	public void setSUBMIT_DATE(String sUBMIT_DATE) {
		SUBMIT_DATE = sUBMIT_DATE;
	}

	public String getSUBMIT_EMP_ID() {
		return SUBMIT_EMP_ID;
	}

	public void setSUBMIT_EMP_ID(String sUBMIT_EMP_ID) {
		SUBMIT_EMP_ID = sUBMIT_EMP_ID;
	}

	public String getCANCEL_EMP_ID() {
		return CANCEL_EMP_ID;
	}

	public void setCANCEL_EMP_ID(String cANCEL_EMP_ID) {
		CANCEL_EMP_ID = cANCEL_EMP_ID;
	}

	public String getCANCEL_DATE() {
		return CANCEL_DATE;
	}

	public void setCANCEL_DATE(String cANCEL_DATE) {
		CANCEL_DATE = cANCEL_DATE;
	}

	public String getNOTE() {
		return NOTE;
	}

	public void setNOTE(String nOTE) {
		NOTE = nOTE;
	}

	@Override
	public String toString() {
		return "BeanTherapyAdminister [THERAPY_VISIT_ID=" + THERAPY_VISIT_ID + ", THERAPY_PERIOD_ID="
				+ THERAPY_PERIOD_ID + ", ASSESS_NO=" + ASSESS_NO + ", PATIENT_ID=" + PATIENT_ID + ", PATIENT_NAME="
				+ PATIENT_NAME + ", CHECKIN_DATE=" + CHECKIN_DATE + ", RECORD_STATE=" + RECORD_STATE + ", SUBMIT_DATE="
				+ SUBMIT_DATE + ", SUBMIT_EMP_ID=" + SUBMIT_EMP_ID + ", CANCEL_EMP_ID=" + CANCEL_EMP_ID
				+ ", CANCEL_DATE=" + CANCEL_DATE + ", NOTE=" + NOTE + "]";
	}
	
}
