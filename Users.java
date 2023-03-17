
public class Users {

	private int userId ;
	private String userUsername ;
	private String userPassword;
	private String userName ;
	private String userGender ;
	private String userEmail;
	private String userPhone ;
	private String userSecurityQues ;
	private String userSecurityAns ;
	
	
	
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int userId, String userUsername, String userPassword, String userName, String userGender,
			String userEmail, String userPhone, String userSecurityQues, String userSecurityAns) {
		super();
		this.userId = userId;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userGender = userGender;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userSecurityQues = userSecurityQues;
		this.userSecurityAns = userSecurityAns;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserUsername() {
		return userUsername;
	}
	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserSecurityQues() {
		return userSecurityQues;
	}
	public void setUserSecurityQues(String userSecurityQues) {
		this.userSecurityQues = userSecurityQues;
	}
	public String getUserSecurityAns() {
		return userSecurityAns;
	}
	public void setUserSecurityAns(String userSecurityAns) {
		this.userSecurityAns = userSecurityAns;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userUsername=" + userUsername + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", userGender=" + userGender + ", userEmail=" + userEmail + ", userPhone="
				+ userPhone + ", userSecurityQues=" + userSecurityQues + ", userSecurityAns=" + userSecurityAns + "]";
	}
	
	
	
	
	
}
