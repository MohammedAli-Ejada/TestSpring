package com.example.demoJavaSpring.SpringWithHibernate.Models;

import jakarta.persistence.*;

@Entity(name = "StudentDB")
@Table(
        name = "Student"
)
public class StudentDB {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "FirstName",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String firstName;

    @Column(
            name = "LastName",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String lastName;

    @Column(
            name = "Email",
            columnDefinition = "TEXT",
            nullable = false,
            unique = true
    )
    private String email;

    @Column(
            name = "Age",
            nullable = false
    )
    private int age;

    public StudentDB(String firstName, String lastName, String email , int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public StudentDB() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
