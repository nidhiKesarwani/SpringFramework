package org.springproject.springjdbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="STUDENT")
public class Student {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name ;
    @Column(name="age")
    private int age;
    @Column(name="gender")
    private String gender;

}
