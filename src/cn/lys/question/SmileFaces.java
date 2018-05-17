package cn.lys.question;

import java.util.Arrays;
import java.util.List;

/**
 * @author 作者 louys:
 * @version 创建时间：2018年5月15日 下午6:40:41 类说明
 */
public class SmileFaces {
	public static void main(String[] args) {
		String t = ";-xd, p8x, :-), :~), ~:8p, 5~), 'X, (D, ;-x, :XD, :), o), (), o), pD), ;-d, ;D, pD, ;D, ;~D, 5P, ;xD, (X, :D, :), pD, ;D, ;dP, 5dD, '), 5od, 8), :D, 5X, (~P, p4x, 'D, p~X";
		List<String> a = Arrays.asList(t.split(", "));
		for (String e : a) {
			System.out.println(e + "====" + e.matches("[:;][-~]?[)D]"));
		}
	}

	public static int countSmileys(List<String> arr) {
		return (int) arr.stream().filter(e -> e.matches("[:;][-~]?[)D]")).count();
	}
}