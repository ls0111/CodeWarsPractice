package cn.lys.question;

/**
 * @author 作者 louys:
 * @version 创建时间：2018年5月15日 下午6:40:41 类说明
 */
public class Groups {
	public static void main(String[] args) {
		System.out.println(groupCheck("[[]()]"));
	}

	public static boolean groupCheck(String s) {
		if(null == s || "".equals(s)){
			return true;
		}
		while(s.contains("{}") || s.contains("[]") || s.contains("()")){
			s = s.replaceAll("\\{\\}", "");
			s = s.replaceAll("\\[\\]", "");
			s = s.replaceAll("\\(\\)", "");
		}
		if(s.length() != 0){
			return false;
		}
		return true;
	}
}