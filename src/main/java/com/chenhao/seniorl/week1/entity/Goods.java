package com.chenhao.seniorl.week1.entity;

import java.io.Serializable;

public class Goods implements Serializable{
	private Integer gid;
	private String gname;
	private String gEnglishName;
	private Double size;
	private Double price;
	private Integer count;
	private String lable;
	private Integer tid;
	private String tname;
	private Integer bid;
	private String bname;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
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
	public Double getSize() {
		return size;
	}
	public void setSize(Double size) {
		this.size = size;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
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
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gEnglishName=" + gEnglishName + ", size=" + size
				+ ", price=" + price + ", count=" + count + ", lable=" + lable + ", tid=" + tid + ", tname=" + tname
				+ ", bid=" + bid + ", bname=" + bname + "]";
	}
	public Goods(Integer gid, String gname, String gEnglishName, Double size, Double price, Integer count, String lable,
			Integer tid, String tname, Integer bid, String bname) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gEnglishName = gEnglishName;
		this.size = size;
		this.price = price;
		this.count = count;
		this.lable = lable;
		this.tid = tid;
		this.tname = tname;
		this.bid = bid;
		this.bname = bname;
	}
	public Goods() {
		super();
	}
	
}
