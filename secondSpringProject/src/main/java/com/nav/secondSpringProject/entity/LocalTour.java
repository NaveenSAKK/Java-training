package com.nav.secondSpringProject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "atbl_local")
public class LocalTour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long localid;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private long noofpeople;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="travellercode", referencedColumnName="travellerId")
    private Travellers trtourist;
}
