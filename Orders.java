
public class Orders {

	private int orderId;
	private int userId ;
	private float orderPrice ;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderId, int userId, float orderPrice) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.orderPrice = orderPrice;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public float getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(float orderPrice) {
		this.orderPrice = orderPrice;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", userId=" + userId + ", orderPrice=" + orderPrice + "]";
	}
	
	

}
