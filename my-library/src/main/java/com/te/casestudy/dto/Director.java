package com.te.casestudy.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "director")
public class Director {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "director_id")
	private int directorId;
	@Column(name = "director_name")
	private String directorName;
	@Column(name = "director_phone")
	private long directorPhoneno;
	@Autowired
	@OneToMany(mappedBy = "director", cascade = CascadeType.ALL)
	private List<Movie> movie;

	@Override
	public String toString() {
		return "Director [directorId=" + directorId + ", directorName=" + directorName + ", directorPhoneno="
				+ directorPhoneno + "]";
	}

}
