package restaurant.utils;

import java.util.List;

public class PageModel<T> {
	public PageModel(int pageSize, int PageNO, int totalRecords, List list){
		this.pageNO = PageNO;
		this.pageSize = pageSize;
		this.totalRecords = totalRecords;
		this.list = list;
	}
	//记录数目
	private int totalRecords;
	//每页记录数
	private int pageSize;
	//当前页号
	private int pageNO;
	//结果集
	private List<T> list;
	/**
	 * 总页数
	 * @return
	 */
	public int getTotalPages(){
		//这样算防止了少页和多页的情况
		return (totalRecords +pageSize-1)/pageSize;
	}
	
	/**
	 * 第一页
	 * @return
	 */
	public int getTopPageNO(){
		return 1;
	}
	
	/**
	 * 上一页
	 * @return
	 */
	public int getPrevPageNO(){
		if(pageNO <= 1){
			return 1;
		}
		return pageNO-1;
	}
	
	/**
	 * 下一页
	 * @return
	 */
	public int getNextPageNO(){
		if(pageNO >= getTotalPages()){
			return getTotalPages();
		}
		return pageNO+1;
	}
	
	/**
	 * 最后一页
	 * @return
	 */
	public int getBottomPageNO(){
		return getTotalPages();
	}

	//get & set
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNO() {
		return pageNO;
	}
	public void setPageNO(int pageNO) {
		this.pageNO = pageNO;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}

}
