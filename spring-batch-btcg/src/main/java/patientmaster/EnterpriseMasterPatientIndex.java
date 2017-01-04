package patientmaster;

import java.io.Serializable;

public class EnterpriseMasterPatientIndex implements Serializable{
	private static final long serialVersionUID = -4940717436114184875L;
	private String patient_id;
	private String patient_name;
	private String sex;
	private String nationality;
	private String nation;
	private String marital_status;
	private String occupation;
	private String education_level;
	private String date_of_birth;
	private String id_type;
	private String id_no;
	private String company;
	private String address;
	private String zip;
	private String cell_phone;
	private String payer_type;
	private String create_date;
	private String contact_type;
	private String relation;
	private String modify_date;
	public EnterpriseMasterPatientIndex(EnterpriseMasterPatientIndex x){
		patient_id=x.getPatient_id();
		patient_name=x.getPatient_name();
		sex=x.getSex();
		nationality=x.getNationality();
		nation=x.getNation();
		marital_status=x.getMarital_status();
		occupation=x.getOccupation();
		education_level=x.getEducation_level();
		date_of_birth=x.getDate_of_birth();
		id_type=x.getId_type();
		id_no=x.getId_no();
		company=x.getCompany();
		address=x.getAddress();
		zip=x.getZip();
		cell_phone=x.getCell_phone();
		payer_type=x.getPayer_type();
		create_date=x.getCreate_date();
		contact_type=x.getContact_type();
		relation=x.getRelation();
		modify_date=x.getModify_date();
	}
	
	@Override
	public String toString() {
		return "EnterpriseMasterPatientIndex [patient_id=" + patient_id + ", patient_name=" + patient_name + ", sex="
				+ sex + ", nationality=" + nationality + ", nation=" + nation + ", marital_status=" + marital_status
				+ ", occupation=" + occupation + ", education_level=" + education_level + ", date_of_birth="
				+ date_of_birth + ", id_type=" + id_type + ", id_no=" + id_no + ", company=" + company + ", address="
				+ address + ", zip=" + zip + ", cell_phone=" + cell_phone + ", payer_type=" + payer_type
				+ ", create_date=" + create_date + ", contact_type=" + contact_type + ", relation=" + relation
				+ ", modify_date=" + modify_date + "]";
	}

	public EnterpriseMasterPatientIndex(){
		
	}
	
	public String getModify_date() {
		return modify_date;
	}
	public void setModify_date(String modify_date) {
		this.modify_date = modify_date;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEducation_level() {
		return education_level;
	}
	public void setEducation_level(String education_level) {
		this.education_level = education_level;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getId_type() {
		return id_type;
	}
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	public String getId_no() {
		return id_no;
	}
	public void setId_no(String id_no) {
		this.id_no = id_no;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCell_phone() {
		return cell_phone;
	}
	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}
	public String getPayer_type() {
		return payer_type;
	}
	public void setPayer_type(String payer_type) {
		this.payer_type = payer_type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public String getContact_type() {
		return contact_type;
	}
	public void setContact_type(String contact_type) {
		this.contact_type = contact_type;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
}

