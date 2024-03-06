package com.springCourse.SpringDataJPACourse.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Table(
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "vehicleName_unique",
                        columnNames = "vehicle_name"
                )
        }

        )
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   /* @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vehicle_sequence"
    )
    @SequenceGenerator(
            name = "vehicle_sequence",
            sequenceName = "Vehicle_Sequence_name",
            allocationSize = 1

    )*/
    private  Long vehicleId;
    @Column(name = "vehicle_name",nullable = false,length = 500)
    private String vehicleName;
    private String vehicleDescription;
    private Integer vehicleTyreCount;

    private String vehicleColor;
    private String vehicleCompanyName;

    private Double vehiclePrice;

    @CreationTimestamp
    private LocalDate createdDate;

    @UpdateTimestamp
    private LocalDate updatedDate;
}
