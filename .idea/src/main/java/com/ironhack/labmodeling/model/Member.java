package com.ironhack.labmodeling.model;

import com.ironhack.labmodeling.status.Status;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int member_id;
    private String member_name;
    @Enumerated(EnumType.STRING)
    private Status member_status;
    private Date renewal_date;

}
