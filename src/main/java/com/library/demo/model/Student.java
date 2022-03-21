package com.library.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String sName;
	
	private int bid;
	@OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "borrowid")
	private List<Borrow> borrwedbooks;
	private String bName;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id,String name,int bid,String bname){
		this.id=id;
		this.sName=name;
		this.bid=bid;
		this.bName=bname;
	}
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public List<Borrow> getBorrwedbooks() {
		return borrwedbooks;
	}
	public void setBorrwedbooks(List<Borrow> borrwedbooks) {
		this.borrwedbooks = borrwedbooks;
	}
	
	

}
