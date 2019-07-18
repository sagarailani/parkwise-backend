package com.wissen.parkwise.model;



import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class Premise {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "premise_id")
    private int premiseId;

    @Column(name = "premise_name")
    private String premiseName;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

}
