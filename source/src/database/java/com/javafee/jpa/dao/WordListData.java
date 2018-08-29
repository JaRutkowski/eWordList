package com.javafee.jpa.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "com_word_list")
@SequenceGenerator(name = "seq_com_word_list", sequenceName = "seq_com_word_list", allocationSize = 1)
public class WordListData {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_com_word_list")
	@Column(name = "id_word_list", unique = false, nullable = false, insertable = true, updatable = true)
	private Integer idWordList;
	
	@Column(name = "name", unique = false, nullable = true, insertable = true, updatable = true, length = 13)
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "id_word_language", unique = false, nullable = true, insertable = true, updatable = true)
	private WordLanguage wordLanguage;
	
}
