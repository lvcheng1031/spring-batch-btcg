package visitrecord;

public class BeanTargetVisitRecord {
	String visit_id;
	String case_object_id;
	String doctor_id;
	String doctor_name;
	String hospital_department_id;
	String hospital_department_name;
	String visit_date;
	String visit_type;
	String health_insurance_type;
	String rigistration_type;
	String appointments_type;
	String first_visit_flag;
	String IF_KEPT_OBSERVATION;
	@Override
	public String toString() {
		return "BeanTargetVisitRecord [visit_id=" + visit_id + ", case_object_id=" + case_object_id + ", doctor_id="
				+ doctor_id + ", doctor_name=" + doctor_name + ", hospital_department_id=" + hospital_department_id
				+ ", hospital_department_name=" + hospital_department_name + ", visit_date=" + visit_date
				+ ", visit_type=" + visit_type + ", health_insurance_type=" + health_insurance_type
				+ ", rigistration_type=" + rigistration_type + ", appointments_type=" + appointments_type
				+ ", first_visit_flag=" + first_visit_flag + "]";
	}
	
	public String getIF_KEPT_OBSERVATION() {
		return IF_KEPT_OBSERVATION;
	}

	public void setIF_KEPT_OBSERVATION(String iF_KEPT_OBSERVATION) {
		IF_KEPT_OBSERVATION = iF_KEPT_OBSERVATION;
	}

	public String getVisit_id() {
		return visit_id;
	}
	public void setVisit_id(String visit_id) {
		this.visit_id = visit_id;
	}
	public String getCase_object_id() {
		return case_object_id;
	}
	public void setCase_object_id(String case_object_id) {
		this.case_object_id = case_object_id;
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
	public String getHospital_department_id() {
		return hospital_department_id;
	}
	public void setHospital_department_id(String hospital_department_id) {
		this.hospital_department_id = hospital_department_id;
	}
	public String getHospital_department_name() {
		return hospital_department_name;
	}
	public void setHospital_department_name(String hospital_department_name) {
		this.hospital_department_name = hospital_department_name;
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
	public String getHealth_insurance_type() {
		return health_insurance_type;
	}
	public void setHealth_insurance_type(String health_insurance_type) {
		this.health_insurance_type = health_insurance_type;
	}
	public String getRigistration_type() {
		return rigistration_type;
	}
	public void setRigistration_type(String rigistration_type) {
		this.rigistration_type = rigistration_type;
	}
	public String getAppointments_type() {
		return appointments_type;
	}
	public void setAppointments_type(String appointments_type) {
		this.appointments_type = appointments_type;
	}
	public String getFirst_visit_flag() {
		return first_visit_flag;
	}
	public void setFirst_visit_flag(String first_visit_flag) {
		this.first_visit_flag = first_visit_flag;
	}
	
}
