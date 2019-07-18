package com.wissen.parkwise.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class Log {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "log_id")
    private int logId;

    @ManyToOne
    @JoinColumn(name = "premise_configuration_id")
    private PremiseConfiguration premiseConfiguration;

    @Column(name = "vehicle_number")
    private String vehicleNumber;

    @Column(name = "entry_date")
    private LocalDate entryDate;

    @Column(name = "entry_time")
    private LocalTime entryTime;

    @Column(name = "exit_date")
    private LocalDate exitDate;

    @Column(name = "exit_time")
    private LocalTime exitTime;

    @Column(name = "entry_type")
    private String entryType;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "entry_gate")
    private String entryGate;

    @ManyToOne
    @JoinColumn(name = "entry_worker_user_id")
    private User entryWorker;

    @Column(name = "exit_gate")
    private String exitGate;

    @ManyToOne
    @JoinColumn(name = "exit_worker_user_id")
    private User exitWorker;

    @Column(name = "has_opted_for_valet")
    private boolean hasOptedForValet;

    @Override
    public String toString() {
        return "Log{" +
                "logId=" + logId +
                ", premiseConfiguration=" + premiseConfiguration +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", entryDate=" + entryDate +
                ", entryTime=" + entryTime +
                ", exitDate=" + exitDate +
                ", exitTime=" + exitTime +
                ", entryType='" + entryType + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", entryGate='" + entryGate + '\'' +
                ", entryWorker=" + entryWorker +
                ", exitGate='" + exitGate + '\'' +
                ", exitWorker=" + exitWorker +
                ", hasOptedForValet=" + hasOptedForValet +
                '}';
    }
}

