
public class OrderProducts {

	private int orderId ;
    private int 	productId;
	public OrderProducts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderProducts(int orderId, int productId) {
		super();
		this.orderId = orderId;
		this.productId = productId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "OrderProducts [orderId=" + orderId + ", productId=" + productId + "]";
	}
    
    
}
