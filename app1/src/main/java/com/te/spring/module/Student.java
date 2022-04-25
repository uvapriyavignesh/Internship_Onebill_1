package com.te.spring.module;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("1")
	private int sId;
	@Value("abu")
	private String sName;
	@Value("18")
	private int sAge;
	
	private Address adress;
	
	public Student(Address adress) {
		super();
		this.adress = adress;
	}
	private List<String> friends;
	private Set<Integer> someThing;
	public Set<Integer> getSomeThing() {
		return someThing;
	}
	public void setSomeThing(Set<Integer> someThing) {
		this.someThing = someThing;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Address getAdress() {
		return adress;
	}
	@Autowired
	public void setAdress(Address adress) {
		this.adress = adress;
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
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
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
	@Override
	public String toString() {
		return "Student [sId=" + this.sId + ", sName=" + sName + ", sAge=" + sAge + ", adress=" + adress + ", friends="
				+ friends + ", someThing=" + someThing + "]";
	}
	

}
