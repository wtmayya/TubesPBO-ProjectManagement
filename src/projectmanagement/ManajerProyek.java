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
public class ManajerProyek extends Orang {

    private ArrayList<Proyek> listProyek;

    public ManajerProyek(String nama, int umur, String alamat) {
        super(nama, umur, alamat);
    }

    public void createProyek(Date deadline) {
        Proyek p = new Proyek();
        p.setDeadline(deadline);
        listProyek.add(p);
    }
}
