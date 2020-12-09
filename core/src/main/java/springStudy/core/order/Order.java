package springStudy.core.order;

public class Order
{
	private Long memberId;
	private String itemName;
	private int itemPrice;
	private int discountPrice;
	
	public Order(Long memberId, String itemName, int itemPrice, int discountPrice)
	{
		this.memberId = memberId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.discountPrice = discountPrice;
	}
	
	// 할인 적용된 가격
	public int calculatePrice()
	{
		return itemPrice - discountPrice;
	}
	
	public Long getMemberId()
	{
		return memberId;
	}
	
	public void setMemberId(Long memberId)
	{
		this.memberId = memberId;
	}
	
	public String getItemName()
	{
		return itemName;
	}
	
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	
	public int getItemPrice()
	{
		return itemPrice;
	}
	
	public void setItemPrice(int itemPrice)
	{
		this.itemPrice = itemPrice;
	}
	
	public int getDiscountPrice()
	{
		return discountPrice;
	}
	
	public void setDiscountPrice(int discountPrice)
	{
		this.discountPrice = discountPrice;
	}
	
	// 객체를 출력하면 호출된다.
	@Override
	public String toString()
	{
		return "Order{" +
					   "memberId=" + memberId +
					   ", itemName='" + itemName + '\'' +
					   ", itemPrice=" + itemPrice +
					   ", discountPrice=" + discountPrice +
					   '}';
	}
}
