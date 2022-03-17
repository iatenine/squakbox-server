package com.revature.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "squaks")
public class Squak {
    @Id
    private int id;

    private String content;
    private long date;
}
