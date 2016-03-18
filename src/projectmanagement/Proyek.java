package projectmanagement;

import java.util.ArrayList;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mayya
 */
public class Proyek {

    private ArrayList<Programmer> listProgrammer;
    private ArrayList<Tugas> listTugas;
    private Date deadline;

    public Proyek() {
    }

    public void addProgrammer(Programmer p) {
        listProgrammer.add(p);
    }

    public void createTugas(String namaTugas, Programmer p) {
        Tugas t = new Tugas(p, namaTugas);
        listTugas.add(t);
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }

}
