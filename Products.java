
public class Products {

	private int productId ;
	private int retailerId ;
	private String productName;
	private float  productPrice ;
	private String productDesc;
	private String productCategory;
	private String productImageUrl ;
	public Products(int productId, int retailerId, String productName, float productPrice, String productDesc,
			String productCategory, String productImageUrl) {
		super();
		this.productId = productId;
		this.retailerId = retailerId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDesc = productDesc;
		this.productCategory = productCategory;
		this.productImageUrl = productImageUrl;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", retailerId=" + retailerId + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", productDesc=" + productDesc + ", productCategory="
				+ productCategory + ", productImageUrl=" + productImageUrl + "]";
	}
	
	


}
