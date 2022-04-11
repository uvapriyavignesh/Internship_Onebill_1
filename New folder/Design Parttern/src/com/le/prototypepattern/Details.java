package com.le.prototypepattern;

public class Details implements Cloneable{
	private int eId;
	private String eName;
	private int eAge;

	@Override
	public String toString() {

		return "Details [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + ", esalary=" + esalary + "]";
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	private int esalary;

	public Details() {
		super();
	}

	public Details(int eId, String eName, int eAge, int esalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
		this.esalary = esalary;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}
