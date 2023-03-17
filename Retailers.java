
public class Retailers {

	private int retailerId;
	private String retailerUsername ;
	private String retailerPassword ;
	private String retailerEmail;
	private String retailerPhone ;
	private String  retailerSecurityQues ;
	private String retailerSecurityAns;
	private String retailerStatus;
	private String retailerAadharNo;
	private String retailerName;
	private String retailerGender ;
	
	
	
	
	public Retailers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Retailers(int retailerId, String retailerUsername, String retailerPassword, String retailerEmail,
			String retailerPhone, String retailerSecurityQues, String retailerSecurityAns, String retailerStatus,
			String retailerAadharNo, String retailerName, String retailerGender) {
		super();
		this.retailerId = retailerId;
		this.retailerUsername = retailerUsername;
		this.retailerPassword = retailerPassword;
		this.retailerEmail = retailerEmail;
		this.retailerPhone = retailerPhone;
		this.retailerSecurityQues = retailerSecurityQues;
		this.retailerSecurityAns = retailerSecurityAns;
		this.retailerStatus = retailerStatus;
		this.retailerAadharNo = retailerAadharNo;
		this.retailerName = retailerName;
		this.retailerGender = retailerGender;
	}
	public int getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	public String getRetailerUsername() {
		return retailerUsername;
	}
	public void setRetailerUsername(String retailerUsername) {
		this.retailerUsername = retailerUsername;
	}
	public String getRetailerPassword() {
		return retailerPassword;
	}
	public void setRetailerPassword(String retailerPassword) {
		this.retailerPassword = retailerPassword;
	}
	public String getRetailerEmail() {
		return retailerEmail;
	}
	public void setRetailerEmail(String retailerEmail) {
		this.retailerEmail = retailerEmail;
	}
	public String getRetailerPhone() {
		return retailerPhone;
	}
	public void setRetailerPhone(String retailerPhone) {
		this.retailerPhone = retailerPhone;
	}
	public String getRetailerSecurityQues() {
		return retailerSecurityQues;
	}
	public void setRetailerSecurityQues(String retailerSecurityQues) {
		this.retailerSecurityQues = retailerSecurityQues;
	}
	public String getRetailerSecurityAns() {
		return retailerSecurityAns;
	}
	public void setRetailerSecurityAns(String retailerSecurityAns) {
		this.retailerSecurityAns = retailerSecurityAns;
	}
	public String getRetailerStatus() {
		return retailerStatus;
	}
	public void setRetailerStatus(String retailerStatus) {
		this.retailerStatus = retailerStatus;
	}
	public String getRetailerAadharNo() {
		return retailerAadharNo;
	}
	public void setRetailerAadharNo(String retailerAadharNo) {
		this.retailerAadharNo = retailerAadharNo;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	public String getRetailerGender() {
		return retailerGender;
	}
	public void setRetailerGender(String retailerGender) {
		this.retailerGender = retailerGender;
	}
	@Override
	public String toString() {
		return "Retailers [retailerId=" + retailerId + ", retailerUsername=" + retailerUsername + ", retailerPassword="
				+ retailerPassword + ", retailerEmail=" + retailerEmail + ", retailerPhone=" + retailerPhone
				+ ", retailerSecurityQues=" + retailerSecurityQues + ", retailerSecurityAns=" + retailerSecurityAns
				+ ", retailerStatus=" + retailerStatus + ", retailerAadharNo=" + retailerAadharNo + ", retailerName="
				+ retailerName + ", retailerGender=" + retailerGender + "]";
	}
	
	
	
	
}
