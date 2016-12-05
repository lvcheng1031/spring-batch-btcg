package visitrecord;

public class BeanSourceRegVisitMaster {
	String visit_id;
	String patient_id;
	String doctor_id;
	String doctor_name;
	String dept_id;
	String dept_name;
	String visit_date;
	String visit_type;
	String payer_type;
	String reg_class;
	String appoint_code;
	String first_visit;
	public BeanSourceRegVisitMaster(){}
	@Override
	public String toString() {
		return "BeanSourceRegVisitMaster [visit_id=" + visit_id + ", patient_id=" + patient_id + ", doctor_id="
				+ doctor_id + ", doctor_name=" + doctor_name + ", dept_id=" + dept_id + ", dept_name=" + dept_name
				+ ", visit_date=" + visit_date + ", visit_type=" + visit_type + ", payer_type=" + payer_type
				+ ", reg_class=" + reg_class + ", appoint_code=" + appoint_code + ", first_visit=" + first_visit + "]";
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
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
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
	public String getVisit_date() {
		return visit_date;
	}
	public void setVisit_date(String visit_date) {
		this.visit_date = visit_date;
	}
	public String getVisit_type() {
		return visit_type;
	}
	public void setVisit_type(String visit_type) {
		this.visit_type = visit_type;
	}
	public String getPayer_type() {
		return payer_type;
	}
	public void setPayer_type(String payer_type) {
		this.payer_type = payer_type;
	}
	public String getReg_class() {
		return reg_class;
	}
	public void setReg_class(String reg_class) {
		this.reg_class = reg_class;
	}
	public String getAppoint_code() {
		return appoint_code;
	}
	public void setAppoint_code(String appoint_code) {
		this.appoint_code = appoint_code;
	}
	public String getFirst_visit() {
		return first_visit;
	}
	public void setFirst_visit(String first_visit) {
		this.first_visit = first_visit;
	}
	
}
