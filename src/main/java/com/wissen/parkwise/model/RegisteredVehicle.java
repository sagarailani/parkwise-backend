package com.wissen.parkwise.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class RegisteredVehicle {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "registration_id")
    private int registrationId;

    @ManyToOne
    @JoinColumn(name = "premise_configuration_id")
    private PremiseConfiguration premiseConfiguration;

    @Column(name = "vehicle_number")
    private String vehicleNumber;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "owner_name")
    private String ownerName;

    @Override
    public String toString() {
        return "RegisteredVehicle{" +
                "registrationId=" + registrationId +
                ", premiseConfiguration=" + premiseConfiguration +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}

