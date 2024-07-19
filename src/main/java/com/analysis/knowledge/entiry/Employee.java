package com.analysis.knowledge.entiry;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {

	@Id
	@Column(name = "id")
	@JsonProperty(value = "id")
	private int id;

	@Column(name = "name")  
	@JsonProperty(value = "name")
	private String name;

	@Column(name = "department")  
	@JsonProperty(value = "department")
	private String department;

	@Column(name = "salary") 
	@JsonProperty(value = "salary")
	private Double salary;
	
	// Explicit getter and setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
