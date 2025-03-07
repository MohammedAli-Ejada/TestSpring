package com.example.demoJavaSpring.SpringWithHibernate.Models.OneToOne;

import jakarta.persistence.*;

@Entity(name = "MyUser")
@Table(name = "MyUser")
public class User {
    @SequenceGenerator(
            name = "UserSequence",
            allocationSize = 1,
            sequenceName = "UserSequence"
    )
    @GeneratedValue(
            generator = "UserSequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    private Long id;
    private String Name ;

    public User(Long id, String name, Address address) {
        this.id = id;
        Name = name;
        this.address = address;
    }

    public User() {
    }

    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "addressId")
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
