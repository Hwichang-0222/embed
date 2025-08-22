package embed.member.entity;

public class MemberDTO {
	
	String id;
	String idchk;
	String password1;
	String password2;
	String name;
	String tel;
	String email;
	String birthday;
	String homepage;
	String gender;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberDTO(String id, String idchk, String password1, String password2, String name, String tel, String email,
			String birthday, String homepage, String gender) {
		this.id = id;
		this.idchk = idchk;
		this.password1 = password1;
		this.password2 = password2;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.birthday = birthday;
		this.homepage = homepage;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdchk() {
		return idchk;
	}

	public void setIdchk(String idchk) {
		this.idchk = idchk;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
