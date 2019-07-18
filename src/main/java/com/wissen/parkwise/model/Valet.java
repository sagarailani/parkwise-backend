package com.wissen.parkwise.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class Valet {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "valet_id")
    private int valetId;

    @OneToOne
    @JoinColumn(name = "log_id")
    private Log log;

    @Column(name = "slot")
    private int slot;

    @Column(name = "is_slot_active")
    private boolean isSlotActive;

}
