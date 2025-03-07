package com.example.demoJavaSpring.SpringWithHibernate.Models.OneToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Department {
    @SequenceGenerator(
            name = "DepartmentSequence",
            allocationSize = 1,
            sequenceName = "DepartmentSequence"
    )
    @GeneratedValue(
            generator = "DepartmentSequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    private Long id;
    private String Name ;
    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "department"
    )
    private List<Employee>employees=new ArrayList<Employee>();

    public Department(Long id, String name, List<Employee> employees) {
        this.id = id;
        Name = name;
        this.employees = employees;
    }

    public Department() {
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
