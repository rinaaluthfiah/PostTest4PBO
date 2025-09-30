/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ISRINA LUTHFIAH
 */


public class Konsultasi implements AturJadwal {
    private int id;
    private Pasien pasien;
    private Psikolog psikolog;
    private String jadwal;

    public Konsultasi(int id, Pasien pasien, Psikolog psikolog, String jadwal) {
        this.id = id;
        this.pasien = pasien;
        this.psikolog = psikolog;
        this.jadwal = jadwal;
    }

    public int getId() { return id; }
    public Pasien getPasien() { return pasien; }
    public Psikolog getPsikolog() { return psikolog; }

    @Override
    public void setJadwal(String jadwal) { this.jadwal = jadwal; }
    
    @Override
    public String getJadwal() { return jadwal; }

    public void tampil() {
        System.out.println("ID Konsultasi : " + id);
        System.out.println(pasien.info());
        System.out.println(psikolog.info());
        System.out.println("Jadwal   : " + jadwal);
    }
}
