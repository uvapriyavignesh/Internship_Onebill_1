package com.te.web.module;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
@Entity
@Table(name="smartphone")
public class SmartPhone {
	@Id
	@Column(name="phone_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phoneId;
	@Column(name="phone_name")
	private String phoneName;
	 @OneToOne (mappedBy = "phone",cascade = CascadeType.ALL)
	private Person person;
   @OneToMany(mappedBy = "phone",cascade = CascadeType.ALL)
	 private List<Call> call;
}
