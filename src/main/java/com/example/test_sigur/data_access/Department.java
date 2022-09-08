package com.example.test_sigur.data_access;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private int name;

    public int getId() {
        return id;
    }

    protected Department() {
    }

    public Department(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }


}