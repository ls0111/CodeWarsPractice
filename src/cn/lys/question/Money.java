package cn.lys.question;
/**
* @author 作者 louys:
* @version 创建时间：2018年5月15日 下午6:40:41
* 类说明
*/
public class Money {
	public static void main(String[] args) {
		System.out.println(calculateYears(1000, 0.05, 0.18, 1100));
	}

	public static int calculateYears(double principal, double interest, double tax, double desired) {
		if (principal >= desired) {
			return 0;
		} else {
			principal = principal * interest * (1 - tax) + principal;
			return calculateYears(principal, interest, tax, desired) + 1;
		}
	}
}
