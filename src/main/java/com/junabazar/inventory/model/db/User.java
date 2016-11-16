package com.junabazar.inventory.model.db;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    private String password;

    @Column(name = "mobile_no")
    private String mobileNo;

    private String name;
    
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
