package com.nav.secondSpringProject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "atbl_foreign")
public class ForeignTour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foreignId;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private long noofpeople;

    @Column(nullable = false)
    private boolean isPassportValid;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "travellercode", referencedColumnName = "travellerId")
    private Travellers trtourist;
}
