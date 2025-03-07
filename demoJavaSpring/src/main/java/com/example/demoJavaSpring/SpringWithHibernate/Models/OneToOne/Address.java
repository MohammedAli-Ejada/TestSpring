package com.example.demoJavaSpring.SpringWithHibernate.Models.OneToOne;

import jakarta.persistence.*;
@Entity
@Table
public class Address {
    @SequenceGenerator(
            name = "AddressSequence",
            allocationSize = 1,
            sequenceName = "AddressSequence"
    )
    @GeneratedValue(
            generator = "AddressSequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    private Long id;
    private String location;
    @OneToOne(mappedBy = "address")
    private User user;
    public Address(Long id, String location) {
        this.id = id;
        this.location = location;
    }

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
