package cn.lys.question;

import java.util.Arrays;

/**
 * @author 作者 louys:
 * @version 创建时间：2018年5月15日 下午6:40:41 类说明
 */
public class Accumul {
	public static void main(String[] args) {
		System.out.println(accum("ZpglnRxqenU"));
	}
	
	public static String accum(String s) {
		String[] strArr = s.toLowerCase().split("");
		for(int i=0;i<strArr.length;i++){
			strArr[i] = strArr[i].toUpperCase() + transform(strArr[i], i);
		}
		String ret = Arrays.toString(strArr).replaceAll(", ", "-");
		return ret.substring(1, ret.length() - 1);
	}
	
	public static String transform(String s, int num){
		String ret = "";
		while(num-- > 0){
			ret += s;
		}
		return ret;
	}
}
