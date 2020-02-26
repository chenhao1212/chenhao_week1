package com.chenhao.seniorl.week1.entity;

public class Condition{
	private Integer pageNum;
	private Double price1;
	private Double price2;
	private String gname;
	private String gEnglishName;
	private String lable;
	private Integer tid;
	private Integer bid;
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Double getPrice1() {
		return price1;
	}
	public void setPrice1(Double price1) {
		this.price1 = price1;
	}
	public Double getPrice2() {
		return price2;
	}
	public void setPrice2(Double price2) {
		this.price2 = price2;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getgEnglishName() {
		return gEnglishName;
	}
	public void setgEnglishName(String gEnglishName) {
		this.gEnglishName = gEnglishName;
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Condition [pageNum=" + pageNum + ", price1=" + price1 + ", price2=" + price2 + ", gname=" + gname
				+ ", gEnglishName=" + gEnglishName + ", lable=" + lable + ", tid=" + tid + ", bid=" + bid + "]";
	}
	public Condition(Integer pageNum, Double price1, Double price2, String gname, String gEnglishName, String lable,
			Integer tid, Integer bid) {
		super();
		this.pageNum = pageNum;
		this.price1 = price1;
		this.price2 = price2;
		this.gname = gname;
		this.gEnglishName = gEnglishName;
		this.lable = lable;
		this.tid = tid;
		this.bid = bid;
	}
	public Condition() {
		super();
	}
	
	
}
