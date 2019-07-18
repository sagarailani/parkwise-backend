package com.wissen.parkwise.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class PremiseConfiguration {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "configuration_id")
    private int configurationId;

    @ManyToOne
    @JoinColumn(name="premise_id")
    private Premise premise;

    @Column(name = "entry_type")
    private String entryType;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "max_count")
    private int maxCount;

    @Column(name = "active_count")
    private int activeCount;

    @Column(name = "is_valet_available")
    private boolean isValetAvailable;

    @Column(name = "is_registration_required")
    private boolean isRegistrationRequired;

    @Override
    public String toString() {
        return "PremiseConfiguration{" +
                "configurationId=" + configurationId +
                ", premise=" + premise +
                ", entryType='" + entryType + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", maxCount=" + maxCount +
                ", activeCount=" + activeCount +
                ", isValetAvailable=" + isValetAvailable +
                ", isRegistrationRequired=" + isRegistrationRequired +
                '}';
    }
}
