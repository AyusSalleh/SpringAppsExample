package com.example.myapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "questions")
public class Question extends AuditModel {
    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String title;

    @Column(columnDefinition = "text")
    private String description;

    // Getters and Setters (Omitted for brevity)
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	public void setTitle(String getTitle) {
		// TODO Auto-generated method stub
		this.title = getTitle;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	public void setDescription(String getDesc) {
		// TODO Auto-generated method stub
		this.description = getDesc;
	}

}