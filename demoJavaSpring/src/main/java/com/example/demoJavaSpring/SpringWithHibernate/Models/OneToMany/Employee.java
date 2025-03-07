package com.example.demoJavaSpring.SpringWithHibernate.Models.OneToMany;

import jakarta.persistence.*;
@Entity
public class Employee {
    @SequenceGenerator(
            name = "EmployeeSequence",
            allocationSize = 1,
            sequenceName = "EmployeeSequence"
    )
    @GeneratedValue(
            generator = "EmployeeSequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    private Long id;
    private String Name ;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departmentId")
    private Department department;

    public Employee(Long id, String name, Department department) {
        this.id = id;
        Name = name;
        this.department = department;
    }
    public Employee() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
}
