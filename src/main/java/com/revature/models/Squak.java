package com.revature.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "squaks")
@NoArgsConstructor
public class Squak {

    public Squak(String content){
        this.content = content;
        this.date = System.currentTimeMillis();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String content;
    private long date;
}
