package com.ironhack.labmodeling.event;

import com.ironhack.labmodeling.model.Speaker;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Conferences  extends Event{
    @OneToMany
    @JoinColumn(name="event_id")
    private List<Speaker> speakers;
}
