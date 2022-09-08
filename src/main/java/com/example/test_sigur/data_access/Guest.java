package com.example.test_sigur.data_access;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="guest")
public class Guest {
    @Id
    @GeneratedValue
    private int id;
    private int card;
    private Date visit_date;
    private int employee_id;

    protected Guest() {
    }

    public Guest(int card, Date visit_date, int employee_id) {
        this.card = card;
        this.visit_date = visit_date;
        this.employee_id = employee_id;
    }

    public int getId() {
        return id;
    }

    public int getCard() {
        return card;
    }

    public Date getVisit_date() {
        return visit_date;
    }

    public int getEmployee_id() {
        return employee_id;
    }
}