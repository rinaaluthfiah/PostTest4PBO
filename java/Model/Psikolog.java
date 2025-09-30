/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ISRINA LUTHFIAH
 */


public class Psikolog extends Orang {
    private String spesialis;

    public Psikolog(String nama, int umur, String spesialis) {
        super(nama, umur);
        this.spesialis = spesialis;
    }

    public String getSpesialis() { return spesialis; }
    public void setSpesialis(String spesialis) { this.spesialis = spesialis; }

    @Override
    public String info() { // Overriding
        return "Psikolog : " + getNama() + "\n" +
               "Umur     : " + getUmur() + "\n" +
               "Spesialis: " + spesialis;
    }
}

