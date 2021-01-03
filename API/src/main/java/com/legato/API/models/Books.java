package com.legato.API.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Books {
    @Id
    @Column
    int id;
    @Column
    private String name;
    @Column
    private String author;
    @Column
    private String color;
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", color=" + color + "]";
	}
	
    
}
