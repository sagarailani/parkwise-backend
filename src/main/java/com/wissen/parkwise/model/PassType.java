package com.wissen.parkwise.model;

import lombok.*;

import javax.persistence.*;
import java.time.Duration;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class PassType {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pass_id")
    private int passId;

    @ManyToOne
    @JoinColumn(name = "premise_configuration_id")
    private PremiseConfiguration premiseConfiguration;

    @Column(name = "duration")
    private Duration duration;

    @Column(name = "price")
    private double price;

}
