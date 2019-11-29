package com.tyss.jpawithibernateapp.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table

public class PencilBox {
	
	@Id
	@Column
	
	private int bId;
	@Column
	private String bName;
	
	@OneToMany(mappedBy = "pencilBox")
	private List<Pencil> pencil;


}
