package prescription;

public class BeanSourcePrescriptionMaster {
	String presc_id;
	String visit_id;
	String patient_id;
	String ordering_doctor_id;
	String ordering_doctor_name;
	String dept_id;
	String dept_name;
	String presc_time;
	
	String drug_name;
	String freq_code;
	String dosage_unit;
	String dosage;
	String total_amout;
	String administration;
	public String getPresc_id() {
		return presc_id;
	}
	public void setPresc_id(String presc_id) {
		this.presc_id = presc_id;
	}
	public String getVisit_id() {
		return visit_id;
	}
	public void setVisit_id(String visit_id) {
		this.visit_id = visit_id;
	}
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public String getOrdering_doctor_id() {
		return ordering_doctor_id;
	}
	public void setOrdering_doctor_id(String ordering_doctor_id) {
		this.ordering_doctor_id = ordering_doctor_id;
	}
	public String getOrdering_doctor_name() {
		return ordering_doctor_name;
	}
	public void setOrdering_doctor_name(String ordering_doctor_name) {
		this.ordering_doctor_name = ordering_doctor_name;
	}
	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getPresc_time() {
		return presc_time;
	}
	public void setPresc_time(String presc_time) {
		this.presc_time = presc_time;
	}
	public String getDrug_name() {
		return drug_name;
	}
	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}
	public String getFreq_code() {
		return freq_code;
	}
	public void setFreq_code(String freq_code) {
		this.freq_code = freq_code;
	}
	public String getDosage_unit() {
		return dosage_unit;
	}
	public void setDosage_unit(String dosage_unit) {
		this.dosage_unit = dosage_unit;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getTotal_amout() {
		return total_amout;
	}
	public void setTotal_amout(String total_amout) {
		this.total_amout = total_amout;
	}
	public String getAdministration() {
		return administration;
	}
	public void setAdministration(String administration) {
		this.administration = administration;
	}
	@Override
	public String toString() {
		return "BeanSourcePerscriptionMaster [presc_id=" + presc_id + ", visit_id=" + visit_id + ", patient_id="
				+ patient_id + ", ordering_doctor_id=" + ordering_doctor_id + ", ordering_doctor_name="
				+ ordering_doctor_name + ", dept_id=" + dept_id + ", dept_name=" + dept_name + ", presc_time="
				+ presc_time + ", drug_name=" + drug_name + ", freq_code=" + freq_code + ", dosage_unit=" + dosage_unit
				+ ", dosage=" + dosage + ", total_amout=" + total_amout + ", administration=" + administration + "]";
	}
	
}
