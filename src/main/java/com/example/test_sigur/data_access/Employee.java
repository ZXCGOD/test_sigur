package com.example.test_sigur.data_access;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private int card;
    private Date hire_time;
    private Date fire_time;
    private int department_id;

    protected Employee(){

    }

    public Employee(int card, Date hire_time, Date fire_time, int department_id) {
        this.card = card;
        this.hire_time = hire_time;
        this.fire_time = fire_time;
        this.department_id = department_id;
    }

    public int getId() {
        return id;
    }

    public int getCard() {
        return card;
    }

    public Date getHire_time() {
        return hire_time;
    }

    public Date getFire_time() {
        return fire_time;
    }

    public int getDepartment_id() {
        return department_id;
    }
}
