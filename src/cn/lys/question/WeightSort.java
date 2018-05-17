package cn.lys.question;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 作者 louys:
 * @version 创建时间：2018年5月15日 下午6:40:41 类说明
 */
public class WeightSort {
	public static void main(String[] args) {
		System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
	}

	public static String orderWeight(String strng) {
		if(null == strng || "".equals(strng)){
			return strng;
		}
		String[] arr = strng.split("\\s+");
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int sum1 = o1.chars().map(e -> Character.getNumericValue(e)).sum();
				int sum2 = o2.chars().map(e -> Character.getNumericValue(e)).sum();
				return sum1 - sum2 != 0 ? sum1 - sum2 : o1.compareTo(o2);
			}
		});
		return String.join(" ", arr);
	}
}