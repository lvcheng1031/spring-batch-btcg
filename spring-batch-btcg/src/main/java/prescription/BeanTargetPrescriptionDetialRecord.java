package prescription;

public class BeanTargetPrescriptionDetialRecord {
	String SEQ;
	String PRESCRIPTION_ID;
	String DRAG_CODE;
	String DRAG_NAME;
	String FREQUENCY;
	String DOSAGE_UNIT;
	String DOSAGE_ONCE;
	String DOSAGE_ACCUMULATE;
	String ROUTE_CODE;
	
	public String getDRAG_CODE() {
		return DRAG_CODE;
	}
	public void setDRAG_CODE(String dRAG_CODE) {
		DRAG_CODE = dRAG_CODE;
	}
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}
	public String getPRESCRIPTION_ID() {
		return PRESCRIPTION_ID;
	}
	public void setPRESCRIPTION_ID(String pRESCRIPTION_ID) {
		PRESCRIPTION_ID = pRESCRIPTION_ID;
	}
	public String getDRAG_NAME() {
		return DRAG_NAME;
	}
	public void setDRAG_NAME(String dRAG_NAME) {
		DRAG_NAME = dRAG_NAME;
	}
	public String getFREQUENCY() {
		return FREQUENCY;
	}
	public void setFREQUENCY(String fREQUENCY) {
		FREQUENCY = fREQUENCY;
	}
	public String getDOSAGE_UNIT() {
		return DOSAGE_UNIT;
	}
	public void setDOSAGE_UNIT(String dOSAGE_UNIT) {
		DOSAGE_UNIT = dOSAGE_UNIT;
	}
	public String getDOSAGE_ONCE() {
		return DOSAGE_ONCE;
	}
	public void setDOSAGE_ONCE(String dOSAGE_ONCE) {
		DOSAGE_ONCE = dOSAGE_ONCE;
	}
	public String getDOSAGE_ACCUMULATE() {
		return DOSAGE_ACCUMULATE;
	}
	public void setDOSAGE_ACCUMULATE(String dOSAGE_ACCUMULATE) {
		DOSAGE_ACCUMULATE = dOSAGE_ACCUMULATE;
	}
	public String getROUTE_CODE() {
		return ROUTE_CODE;
	}
	public void setROUTE_CODE(String rOUTE_CODE) {
		ROUTE_CODE = rOUTE_CODE;
	}
	@Override
	public String toString() {
		return "BeanTargetPrescriptionDetialRecord [SEQ=" + SEQ + ", PRESCRIPTION_ID=" + PRESCRIPTION_ID
				+ ", DRAG_CODE=" + DRAG_CODE + ", DRAG_NAME=" + DRAG_NAME + ", FREQUENCY=" + FREQUENCY
				+ ", DOSAGE_UNIT=" + DOSAGE_UNIT + ", DOSAGE_ONCE=" + DOSAGE_ONCE + ", DOSAGE_ACCUMULATE="
				+ DOSAGE_ACCUMULATE + ", ROUTE_CODE=" + ROUTE_CODE + "]";
	}
	
	
}
