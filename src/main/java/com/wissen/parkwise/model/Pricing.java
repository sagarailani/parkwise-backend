package com.wissen.parkwise.model;

import lombok.*;

import javax.persistence.*;
import java.time.Duration;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class Pricing {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pricing_id")
    private int pricingId;

    @OneToOne
    @JoinColumn(name = "premise_configuration_id")
    private PremiseConfiguration premiseConfigurationId;

    @Column(name = "base_time")
    private Duration baseTime;

    @Column(name = "base_cost")
    private double baseCost;

    @Column(name = "increment_time")
    private Duration incrementTime;

    @Column(name = "increment_cost")
    private double incrementCost;

    @Column(name = "entry_type")
    private String entryType;

    @Override
    public String toString() {
        return "Pricing{" +
                "pricingId=" + pricingId +
                ", premiseConfigurationId=" + premiseConfigurationId +
                ", baseTime=" + baseTime +
                ", baseCost=" + baseCost +
                ", incrementTime=" + incrementTime +
                ", incrementCost=" + incrementCost +
                ", entryType='" + entryType + '\'' +
                '}';
    }
}
