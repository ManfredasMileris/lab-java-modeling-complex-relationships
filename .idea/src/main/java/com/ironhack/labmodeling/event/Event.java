package com.ironhack.labmodeling.event;

import com.ironhack.labmodeling.model.Guest;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private long duration;
    private String location;
    private String title;
    @ManyToMany
    @JoinTable(name = "event_guest",
    joinColumns = @JoinColumn(name="event_id"),
    inverseJoinColumns = @JoinColumn(name = "guest_id"))
    private List<Guest> guests;



}
