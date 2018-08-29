package com.javafee.jpa.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "com_word_type")
@SequenceGenerator(name = "seq_com_word_type", sequenceName = "seq_com_word_type", allocationSize = 1)
public class WordType {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_com_word_type")
	@Column(name = "id_word_type", unique = false, nullable = false, insertable = true, updatable = true)
	private Integer idWordType;
	
	@Column(name = "code", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
	private String code;
}
