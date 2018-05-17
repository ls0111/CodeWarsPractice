package cn.lys.question;

/**
 * @author 作者 louys:
 * @version 创建时间：2018年5月15日 下午6:40:41 类说明
 */
public class Dubstep {
	public static void main(String[] args) {
		System.out.println(SongDecoder("WUBWUBABCWUB"));
	}

	public static String SongDecoder(String song) {
		if(!song.contains("WUB")){
			return song;
		}
		song = song.replace("WUB", " ").replaceAll("\\s+", " ");
		return song.trim();
	}
}