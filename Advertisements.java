import java.util.Date;

public class Advertisements {

	private int addId ;
    private String	addBrandName ;
	private String addDiscount;
	private String addImageUrl ;
	private Date addStartDate ;
	private Date addEndDate ;
	
	
	
	
	public Advertisements() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Advertisements(int addId, String addBrandName, String addDiscount, String addImageUrl, Date addStartDate,
			Date addEndDate) {
		super();
		this.addId = addId;
		this.addBrandName = addBrandName;
		this.addDiscount = addDiscount;
		this.addImageUrl = addImageUrl;
		this.addStartDate = addStartDate;
		this.addEndDate = addEndDate;
	}

	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getAddBrandName() {
		return addBrandName;
	}
	public void setAddBrandName(String addBrandName) {
		this.addBrandName = addBrandName;
	}
	public String getAddDiscount() {
		return addDiscount;
	}
	public void setAddDiscount(String addDiscount) {
		this.addDiscount = addDiscount;
	}
	public String getAddImageUrl() {
		return addImageUrl;
	}
	public void setAddImageUrl(String addImageUrl) {
		this.addImageUrl = addImageUrl;
	}
	public Date getAddStartDate() {
		return addStartDate;
	}
	public void setAddStartDate(Date addStartDate) {
		this.addStartDate = addStartDate;
	}
	public Date getAddEndDate() {
		return addEndDate;
	}
	public void setAddEndDate(Date addEndDate) {
		this.addEndDate = addEndDate;
	}
	@Override
	public String toString() {
		return "Advertisements [addId=" + addId + ", addBrandName=" + addBrandName + ", addDiscount=" + addDiscount
				+ ", addImageUrl=" + addImageUrl + ", addStartDate=" + addStartDate + ", addEndDate=" + addEndDate
				+ "]";
	}

	
	
}
