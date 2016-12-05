package prescription;

public class BeanSourcePrescriptionDetails {
	String PRESC_ID;
	String SERIAL_NO;
	String DRUG_CODE;
	String DRUG_NAME;
	String FREQ_CODE;
	String DOSAGE_UNIT;
	String DOSAGE;
	String TOTAL_AMOUNT;
	String ADMINISTRATION;
	
	public String getDRUG_CODE() {
		return DRUG_CODE;
	}
	public void setDRUG_CODE(String dRUG_CODE) {
		DRUG_CODE = dRUG_CODE;
	}
	public String getPRESC_ID() {
		return PRESC_ID;
	}
	public void setPRESC_ID(String pRESC_ID) {
		PRESC_ID = pRESC_ID;
	}
	public String getDRUG_NAME() {
		return DRUG_NAME;
	}
	public void setDRUG_NAME(String dRUG_NAME) {
		DRUG_NAME = dRUG_NAME;
	}
	public String getFREQ_CODE() {
		return FREQ_CODE;
	}
	public void setFREQ_CODE(String fREQ_CODE) {
		FREQ_CODE = fREQ_CODE;
	}
	public String getDOSAGE_UNIT() {
		return DOSAGE_UNIT;
	}
	public void setDOSAGE_UNIT(String dOSAGE_UNIT) {
		DOSAGE_UNIT = dOSAGE_UNIT;
	}
	public String getDOSAGE() {
		return DOSAGE;
	}
	public void setDOSAGE(String dOSAGE) {
		DOSAGE = dOSAGE;
	}
	public String getTOTAL_AMOUNT() {
		return TOTAL_AMOUNT;
	}
	public void setTOTAL_AMOUNT(String tOTAL_AMOUNT) {
		TOTAL_AMOUNT = tOTAL_AMOUNT;
	}
	public String getADMINISTRATION() {
		return ADMINISTRATION;
	}
	public void setADMINISTRATION(String aDMINISTRATION) {
		ADMINISTRATION = aDMINISTRATION;
	}
	public String getSERIAL_NO() {
		return SERIAL_NO;
	}
	public void setSERIAL_NO(String sERIAL_NO) {
		SERIAL_NO = sERIAL_NO;
	}
	@Override
	public String toString() {
		return "BeanSourcePrescriptionDetails [PRESC_ID=" + PRESC_ID + ", SERIAL_NO=" + SERIAL_NO + ", DRUG_CODE="
				+ DRUG_CODE + ", DRUG_NAME=" + DRUG_NAME + ", FREQ_CODE=" + FREQ_CODE + ", DOSAGE_UNIT=" + DOSAGE_UNIT
				+ ", DOSAGE=" + DOSAGE + ", TOTAL_AMOUNT=" + TOTAL_AMOUNT + ", ADMINISTRATION=" + ADMINISTRATION + "]";
	}
	
}
