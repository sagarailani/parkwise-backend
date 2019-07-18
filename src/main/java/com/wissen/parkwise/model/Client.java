package com.wissen.parkwise.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Client {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    private int clientId;

    @Column(name = "client_name")
    private String clientName;

//    @Column(name = "creation_date")
//    private LocalDateTime creationDate;

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
//                ", creationDate=" + creationDate +
                '}';
    }
}
