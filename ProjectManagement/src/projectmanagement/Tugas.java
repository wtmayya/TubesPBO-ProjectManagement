package projectmanagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayya
 */
public class Tugas {
    private Programmer pelaksana;
    String namaTugas;
    
    public void setPelaksana(Programmer p){
        this.pelaksana = p;
    }
    
    public void setTugas (String namaTugas){
        this.namaTugas = namaTugas;
    }
}
