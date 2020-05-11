package Normal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Register")

public class Register_values {
	@javax.persistence.Id
	private int id;
	private String name;
	private String password;
	private String mobile;
	private String email;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private String doj;
	private String gender;
	private String course[];
	private String files[];
	
	
	public Register_values() {
		super();
	}

	public Register_values(int id, String name, String password,String mobile,String email,String doj,String gender,
			String course[],String files[]) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mobile=mobile;
		this.email=email;
		this.doj=doj;
		this.gender=gender;
		this.course=course;
		this.files=files;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getFiles() {
		return files;
	}

	public void setFiles(String[] files) {
		this.files = files;
	}
		
}
