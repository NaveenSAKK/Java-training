package com.nav.secondSpringProject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "atbl_traveller")
public class Travellers {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long travellerId;

    @Column(nullable = false,unique = true)
    private String travellerName;

    @Column(nullable = false)
    private String travellerPwd;

    @Column(nullable = false)
    private String roles;


}
