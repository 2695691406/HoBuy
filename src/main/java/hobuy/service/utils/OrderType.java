package hobuy.service.utils;

public enum OrderType {
	// 通过括号赋值,而且必须带有一个参构造器和一个属性跟方法，否则编译出错
	// 赋值必须都赋值或都不赋值，不能一部分赋值一部分不赋值；如果不赋值则不能写构造器，赋值编译也出错
	WAIT_FOR_PAY(0), PAYED(1), USER_CANCLE(7), SOLER_CANCLE(9), USER_WANT_CANCLE(8), ORDER_ACCEPT(14), ORDER_PACKING(
			15), ORDER_PACKED(16), ORDER_WAIT_SEND(17), ORDER_SENDING(2), ORDER_SIGINED(3), ORDER_USER_EVALUATED(
					4), ORDER_SOLER_EVALUATED(5), ORDER_OVER(6), ORDER_WANT_RETURN(10), ORDER_SOLER_TALKING(
							11), ORDER_GOODS_RETURN(12), ORDER_MONY_RETURN(13);

	private final Integer value;

	// 构造器默认也只能是private, 从而保证构造函数只能在内部使用
	OrderType(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}
