package cn.kgc.entity;

import java.util.Date;

public class SellCar {

	private Integer id;
	private String title;
	private String carTime;
	private String mile;
	private String out;
	private String standard;
	private String detail;
	private Date time;
	private User user;
	private Double price;
	private String picpath;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCarTime() {
		return carTime;
	}
	public void setCarTime(String carTime) {
		this.carTime = carTime;
	}
	public String getMile() {
		return mile;
	}
	public void setMile(String mile) {
		this.mile = mile;
	}
	public String getOut() {
		return out;
	}
	public void setOut(String out) {
		this.out = out;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPicpath() {
		return picpath;
	}
	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}
	public SellCar(Integer id, String title, String carTime, String mile,
			String out, String standard, String detail, Date time, User user,
			Double price, String picpath) {
		super();
		this.id = id;
		this.title = title;
		this.carTime = carTime;
		this.mile = mile;
		this.out = out;
		this.standard = standard;
		this.detail = detail;
		this.time = time;
		this.user = user;
		this.price = price;
		this.picpath = picpath;
	}
	public SellCar() {
		super();
	}
	@Override
	public String toString() {
		return "SellCar [id=" + id + ", title=" + title + ", carTime="
				+ carTime + ", mile=" + mile + ", out=" + out + ", standard="
				+ standard + ", detail=" + detail + ", time=" + time
				+ ", user=" + user + ", price=" + price + ", picpath="
				+ picpath + "]";
	}
	
	
	
	
	
	
	
	
}
