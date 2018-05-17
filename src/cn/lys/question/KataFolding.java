package cn.lys.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 作者 louys:
 * @version 创建时间：2018年5月15日 下午6:40:41 类说明
 */
public class KataFolding {
	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(foldArray(input, 2));
	}

	public static int[] foldArray(int[] array, int runs) {
		if(array.length == 1){
			return array;
		}
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		for(int i=0;i<runs;i++){
			for(int j=0;j<list.size()/2;j++){
				list.set(j, list.get(j) + list.get(list.size()-j-1));
			}
			list = list.subList(0, list.size() - list.size()/2);
		}
		return list.stream().mapToInt(i -> i).toArray();
	}
}