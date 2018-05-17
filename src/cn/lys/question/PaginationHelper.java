package cn.lys.question;

import java.util.List;

/**
 * @author 作者 louys:
 * @version 创建时间：2018年5月15日 下午6:40:41 类说明
 */
public class PaginationHelper<I> {
	private List<I> collection;
	private int itemsPerPage;
	private int total;
	private int pageCount;
	private int lastPageItemSize;
	
	/**
	 * The constructor takes in an array of items and a integer indicating how many items fit within a single page
	 */
	public PaginationHelper(List<I> collection, int itemsPerPage) {
		this.collection = collection;
		this.itemsPerPage = itemsPerPage;
		this.total = collection.size();
		this.lastPageItemSize = this.total%this.itemsPerPage;
		this.pageCount = this.total/this.itemsPerPage + (lastPageItemSize > 0 ? 1 : 0);
	}

	/**
	 * returns the number of items within the entire collection
	 */
	public int itemCount() {
		return total;
	}

	/**
	 * returns the number of pages
	 */
	public int pageCount() {
		return pageCount;
	}

	/**
	 * returns the number of items on the current page. page_index is zero based. this method should return -1 for pageIndex values that are out of range
	 */
	public int pageItemCount(int pageIndex) {
		if(pageIndex >= pageCount){
			return -1;
		} else if ((pageIndex + 1) == pageCount){
			return lastPageItemSize;
		} else {
			return itemsPerPage;
		}
	}

	/**
	 * determines what page an item is on. Zero based indexes this method should return -1 for itemIndex values that are out of range
	 */
	public int pageIndex(int itemIndex) {
		if(itemIndex < 0 || (itemIndex + 1) > total){
			return -1;
		} else {
			return (itemIndex + 1) / itemsPerPage;
		}
	}
}