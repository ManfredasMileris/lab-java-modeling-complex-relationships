package com.ironhack.labmodeling.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="speakers")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String speakerName;
    private int presentationDuration;

}
