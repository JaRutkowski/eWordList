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
@Table(name = "com_word")
@SequenceGenerator(name = "seq_com_word", sequenceName = "seq_com_word", allocationSize = 1)
public class Word {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_com_word")
	@Column(name = "id_word", unique = false, nullable = false, insertable = true, updatable = true)
	private Integer idWordList;
	
	@Column(name = "text", unique = false, nullable = true, insertable = true, updatable = true, length = 150)
	private String text;
	
	@Column(name = "translation", unique = false, nullable = true, insertable = true, updatable = true, length = 150)
	private String translation;
	
	@ManyToOne
	@JoinColumn(name = "id_word_type", unique = false, nullable = true, insertable = true, updatable = true)
	private WordType wordType;
	
	@ManyToOne
	@JoinColumn(name = "id_word_list_data", unique = false, nullable = true, insertable = true, updatable = true)
	private WordListData wordListData;
	
}
