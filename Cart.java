
public class Cart {

	private int productId ;
	private int userId ;
	private int quantity;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int productId, int userId, int quantity) {
		super();
		this.productId = productId;
		this.userId = userId;
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [productId=" + productId + ", userId=" + userId + ", quantity=" + quantity + "]";
	}

	 
}
