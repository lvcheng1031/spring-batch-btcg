package anesthesia.anaesthetic;

public class BeanTarget {
	String SEQ,ANESTHESIA_ID,ANAESTHETIC_ID,ANAESTHETIC_NAME,ANAESTHETIC_QUANTITY,START_TIME,END_DATE;

	public String getSEQ() {
		return SEQ;
	}

	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}

	public String getANESTHESIA_ID() {
		return ANESTHESIA_ID;
	}

	public void setANESTHESIA_ID(String aNESTHESIA_ID) {
		ANESTHESIA_ID = aNESTHESIA_ID;
	}

	public String getANAESTHETIC_ID() {
		return ANAESTHETIC_ID;
	}

	public void setANAESTHETIC_ID(String aNAESTHETIC_ID) {
		ANAESTHETIC_ID = aNAESTHETIC_ID;
	}

	public String getANAESTHETIC_NAME() {
		return ANAESTHETIC_NAME;
	}

	public void setANAESTHETIC_NAME(String aNAESTHETIC_NAME) {
		ANAESTHETIC_NAME = aNAESTHETIC_NAME;
	}

	public String getANAESTHETIC_QUANTITY() {
		return ANAESTHETIC_QUANTITY;
	}

	public void setANAESTHETIC_QUANTITY(String aNAESTHETIC_QUANTITY) {
		ANAESTHETIC_QUANTITY = aNAESTHETIC_QUANTITY;
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
		return "BeanTarget [SEQ=" + SEQ + ", ANESTHESIA_ID=" + ANESTHESIA_ID + ", ANAESTHETIC_ID=" + ANAESTHETIC_ID
				+ ", ANAESTHETIC_NAME=" + ANAESTHETIC_NAME + ", ANAESTHETIC_QUANTITY=" + ANAESTHETIC_QUANTITY
				+ ", START_TIME=" + START_TIME + ", END_DATE=" + END_DATE + "]";
	}

	
}
