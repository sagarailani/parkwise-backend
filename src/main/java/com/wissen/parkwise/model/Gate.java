package com.wissen.parkwise.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor @Setter @Getter @AllArgsConstructor
public class Gate {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gate_id")
    private int gateId;

    @ManyToOne
    @JoinColumn(name = "premise_id")
    private Premise premiseId;

    @Column(name="gate_name")
    private String gateName;

    @Override
    public String toString() {
        return "Gate{" +
                "gateId=" + gateId +
                ", premiseId=" + premiseId +
                ", gateName='" + gateName + '\'' +
                '}';
    }
}
