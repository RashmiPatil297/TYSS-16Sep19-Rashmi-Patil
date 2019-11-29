package com.tyss.jpawithibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.engine.internal.Cascade;

import lombok.Data;
import lombok.ToString.Exclude;


@Data
@Entity
@Table(name="person")
public class Person {
	
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Exclude
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vid")
	private VoterId voterId;
	
}
