package com.gaozhao.app_common.util;

import java.util.List;

/**
 * 分页封装的对象
 * @author Administrator
 *
 */

public class Page {
	private Long pageNo; //当前页面
	private Long pageSieze;// 单页大小
	private Long totalPage;//总页数
	private Long totalCount;// 总记录数
	private Boolean firstPage;//是否是第一页
	private Boolean lastPage; //是否是最后一页
	private List<?> records;//记录列表
	public Page(Long pageNo, Long pageSieze, Long totalPage, Long totalCount, Boolean firstPage, Boolean lastPage,
			List<?> records) {
		super();
		this.pageNo = pageNo;
		this.pageSieze = pageSieze;
		this.totalPage = totalPage;
		this.totalCount = totalCount;
		this.firstPage = firstPage;
		this.lastPage = lastPage;
		this.records = records;
	}
	
	public static Page PageUtil(Long count,Long pageNo,Long pageSize,List<?> records) {
		long tp=0;
		if(count%pageSize>0) {
			tp=count/pageSize+1;
		}else {
			tp=count/pageSize;
		}
		
		return new Page(pageNo,pageSize,tp,count,pageNo==1,pageNo==tp,records);
	}
	
	
	public Long getPageNo() {
		return pageNo;
	}
	public Long getPageSieze() {
		return pageSieze;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public Boolean getFirstPage() {
		return firstPage;
	}
	public Boolean getLastPage() {
		return lastPage;
	}
	public List<?> getRecords() {
		return records;
	}
	
	
	
	
}
