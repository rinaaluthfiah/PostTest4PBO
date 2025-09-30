/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Konsultasi;
import Model.Pasien;
import Model.Psikolog;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ISRINA LUTHFIAH
 */

public class KonsultasiService {
    private ArrayList<Konsultasi> daftar = new ArrayList<>();
    private int nextId = 1;
    private Scanner scan = new Scanner(System.in);

  
    public void tambahData() {
        System.out.print("Masukkan Nama Pasien: ");
        String namaP = scan.nextLine();
        System.out.print("Umur Pasien: ");
        int umurP = Integer.parseInt(scan.nextLine());
        System.out.print("Keluhan: ");
        String keluhan = scan.nextLine();
        Pasien p = new Pasien(namaP, umurP, keluhan);

        System.out.print("Masukkan Nama Psikolog: ");
        String namaPs = scan.nextLine();
        System.out.print("Umur Psikolog: ");
        int umurPs = Integer.parseInt(scan.nextLine());
        System.out.print("Spesialis: ");
        String spesialis = scan.nextLine();
        Psikolog ps = new Psikolog(namaPs, umurPs, spesialis);

        System.out.print("Jadwal: ");
        String jadwal = scan.nextLine();

        Konsultasi k = new Konsultasi(nextId++, p, ps, jadwal);
        daftar.add(k);
        System.out.println("Data berhasil ditambahkan!\n");
    }

   
    public void tampilData() {
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data\n");
            return;
        }
        for (Konsultasi k : daftar) {
            k.tampil();
            System.out.println("----------------------");
        }
    }

 
    public void updateData() {
        System.out.print("ID yang mau diubah: ");
        int id = Integer.parseInt(scan.nextLine());
        for (Konsultasi k : daftar) {
            if (k.getId() == id) {
                System.out.print("Jadwal baru: ");
                k.setJadwal(scan.nextLine());
                System.out.println("Data diupdate\n");
                return;
            }
        }
        System.out.println("ID tidak ditemukan\n");
    }

    
    public void hapusData() {
        System.out.print("ID yang mau dihapus: ");
        int id = Integer.parseInt(scan.nextLine());
        Konsultasi target = null;
        for (Konsultasi k : daftar) {
            if (k.getId() == id) { target = k; break; }
        }
        if (target != null) {
            daftar.remove(target);
            System.out.println("Data dihapus\n");
        } else {
            System.out.println("ID tidak ditemukan\n");
        }
    }

    
    public void searchData() {
        System.out.print("Cari berdasarkan ID Pasien: ");
        String key = scan.nextLine();
        try {
            int id = Integer.parseInt(key);
            searchData(id); 
        } catch (NumberFormatException e) {
            searchData(key); 
        }
    }

    
    public void searchData(String nama) {
        boolean found = false;
        for (Konsultasi k : daftar) {
            if (k.getPasien().getNama().equalsIgnoreCase(nama)) {
                k.tampil();
                System.out.println("----------------------");
                found = true;
            }
        }
        if (!found) System.out.println("Data tidak ditemukan\n");
    }

    public void searchData(int id) {
        for (Konsultasi k : daftar) {
            if (k.getId() == id) {
                k.tampil();
                System.out.println("----------------------");
                return;
            }
        }
        System.out.println("Data tidak ditemukan\n");
    }
}
