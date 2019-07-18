package com.wissen.parkwise.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class Pass {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pass_id")
    private int passId;

    @Column(name = "pass_name")
    private String name;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "vehicle_number")
    private String vehicleNumber;

    @ManyToOne
    @JoinColumn(name = "pass_type")
    private PassType passType;

    @Override
    public String toString() {
        return "Pass{" +
                "passId=" + passId +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", isActive=" + isActive +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", passType=" + passType +
                '}';
    }
}
