
public class Admins {

	private int adminId;
	private String adminUsername ;
	private String adminPassword ;
	private String adminEmail ;
	private String adminPhone ;
	private String adminSecurityQues;
	private String adminSecurityAns;
	
	
	
	
	
	
	public Admins() {
		super();
		
	}
	public Admins(int adminId, String adminUsername, String adminPassword, String adminEmail, String adminPhone,
			String adminSecurityQues, String adminSecurityAns) {
		super();
		this.adminId = adminId;
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
		this.adminEmail = adminEmail;
		this.adminPhone = adminPhone;
		this.adminSecurityQues = adminSecurityQues;
		this.adminSecurityAns = adminSecurityAns;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}
	public String getAdminSecurityQues() {
		return adminSecurityQues;
	}
	public void setAdminSecurityQues(String adminSecurityQues) {
		this.adminSecurityQues = adminSecurityQues;
	}
	public String getAdminSecurityAns() {
		return adminSecurityAns;
	}
	public void setAdminSecurityAns(String adminSecurityAns) {
		this.adminSecurityAns = adminSecurityAns;
	}
	@Override
	public String toString() {
		return "Admins [adminId=" + adminId + ", adminUsername=" + adminUsername + ", adminPassword=" + adminPassword
				+ ", adminEmail=" + adminEmail + ", adminPhone=" + adminPhone + ", adminSecurityQues="
				+ adminSecurityQues + ", adminSecurityAns=" + adminSecurityAns + "]";
	}
	
	
}
