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
@Table(name = "com_word_language")
@SequenceGenerator(name = "seq_com_word_language", sequenceName = "seq_com_word_language", allocationSize = 1)
public class WordLanguage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_com_word_language")
	@Column(name = "id_word_language", unique = false, nullable = false, insertable = true, updatable = true)
	private Integer idWordList;
	
	@Column(name = "code", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
	private String code;
	
}
