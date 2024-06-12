package com.ironhack.labmodeling.model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
@Entity
@Getter
@Setter
@Table(name = "chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String district;
    @ManyToOne
    @JoinColumn(name="member_id")
    private Member president;
    @OneToMany
    @JoinTable(name = "chapter_nurses",
    joinColumns = @JoinColumn(name = "chapter_id"),
    inverseJoinColumns = @JoinColumn(name="nurse_id"))
    private List<Member> memberList;
}
