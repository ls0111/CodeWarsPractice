package cn.lys.question;

/**
 * @author 作者 louys:
 * @version 创建时间：2018年5月15日 下午6:40:41 类说明
 */
public class HumanReadableTime {
	public static void main(String[] args) {
		System.out.println(makeReadable(359999));
	}

	public static String makeReadable(int seconds) {
		int minuts = seconds/60;
		seconds = seconds%60;
		int hours = minuts/60;
		minuts = minuts%60;
		String[] ret = new String[3];
		ret[0] = String.format("%02d", hours);
		ret[1] = String.format("%02d", minuts);
		ret[2] = String.format("%02d", seconds);
		return String.join(":", ret);
	}
}