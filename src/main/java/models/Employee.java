package models;

import java.util.List;

public class Employee {
    private long id;
    private String fname;
    private String lname;
    private char gender;
    private List<Pet> patients;

    public Employee() {
    }

    public Employee(long id, String fname, String lname, char gender) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
    }

    public Employee(long id, String fname, String lname, char gender, List<Pet> patients) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.patients = patients;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public List<Pet> getPatients() {
        return patients;
    }

    public void setPatients(List<Pet> patients) {
        this.patients = patients;
    }
}
