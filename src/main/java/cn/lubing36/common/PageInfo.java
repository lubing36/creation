package cn.lubing36.common;

import java.io.Serializable;
import java.util.List;

/**
 * 
* <span>Title: PageInfo.java</span><br/>  
* <span>Description: </span> <br/>  
* <span>Copyright: Copyright (c) 2018</span><br/> 
* @author cn.lubing36  
* @date 2018年8月1日  
* @version 1.0
 */
public class PageInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int count; // 总条数
	private int numsPerPage; // 每页条数
	private int totalPage; // 总页数
	private int currentPage; // 当前页数
	private List<?> data; // 数据

	public PageInfo(int count, int numsPerPage, int currentPage, List<?> data) {
		this.count = count;
		this.numsPerPage = numsPerPage;
		this.currentPage = currentPage;
		this.data = data;
		this.totalPage = (int) Math.ceil((double) count / numsPerPage);
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getNumsPerPage() {
		return this.numsPerPage;
	}

	public void setNumsPerPage(int numsPerPage) {
		this.numsPerPage = numsPerPage;
	}

	public int getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<?> getData() {
		return this.data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

}
