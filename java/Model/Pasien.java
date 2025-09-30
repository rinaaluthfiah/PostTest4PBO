/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ISRINA LUTHFIAH
 */

public class Pasien extends Orang {
    private String keluhan;

    public Pasien(String nama, int umur, String keluhan) {
        super(nama, umur);
        this.keluhan = keluhan;
    }

    public String getKeluhan() { return keluhan; }
    public void setKeluhan(String keluhan) { this.keluhan = keluhan; }

    @Override
    public String info() { // Overriding
        return "Pasien   : " + getNama() + "\n" +
               "Umur     : " + getUmur() + "\n" +
               "Keluhan  : " + keluhan;
    }
}

