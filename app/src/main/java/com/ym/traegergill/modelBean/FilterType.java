package com.ym.traegergill.modelBean;
// Generated 2017-10-23 17:20:01 by Hibernate Tools 5.2.5.Final

/**
 * FilterType generated by hbm2java
 */
public class FilterType implements java.io.Serializable {

	private Integer filterTypeid;
	private String filterTypeName;
	private String describe;

	public FilterType() {
	}

	public FilterType(String filterTypeName, String describe) {
		this.filterTypeName = filterTypeName;
		this.describe = describe;
	}

	public Integer getFilterTypeid() {
		return this.filterTypeid;
	}

	public void setFilterTypeid(Integer filterTypeid) {
		this.filterTypeid = filterTypeid;
	}

	public String getFilterTypeName() {
		return this.filterTypeName;
	}

	public void setFilterTypeName(String filterTypeName) {
		this.filterTypeName = filterTypeName;
	}

	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

}