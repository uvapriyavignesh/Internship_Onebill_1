package com.te.jaxp.dto;

import java.util.Map;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Student {
	
	private int sId;

	private String sName;
	
	private int sAge;
	private Address adress; 
	
	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	private Map<String,Integer> mark;
	

	public Student(Map<String, Integer> mark) {
		super();
		this.mark = mark;
	}
	
	public Student() {
		super();
	}
	public Student(int sId, String sName, int sAge) {
		super();
		//System.out.println();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		System.out.println("argumented cons "+this.sId);
	}
	@XmlAttribute
	public int getsId() {
		return sId;
	}
	
	public void setsId(int sId) {
		this.sId = sId;
	}
	@XmlElement(name="name")
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public Map<String, Integer> getMark() {
		return mark;
	}

	public void setMark(Map<String, Integer> mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", adress=" + adress + ", mark=" + mark
				+ "]";
	}

	

}
