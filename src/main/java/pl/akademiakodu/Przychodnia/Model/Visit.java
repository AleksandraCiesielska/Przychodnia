package pl.akademiakodu.Przychodnia.Model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class Visit
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Time time;

    @ManyToOne(fetch=FetchType.LAZY)
    private Doctor doctor;

    @ManyToOne(fetch=FetchType.LAZY)
    private Patient patient;

    public Visit() {
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time)
    {
        this.time = time;
    }
}


