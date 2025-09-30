/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

/**
 *
 * @author ISRINA LUTHFIAH
 */





import Service.KonsultasiService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KonsultasiService service = new KonsultasiService();
        Scanner scan = new Scanner(System.in);
        int pilih = 0;

        while (true) {
            System.out.println("\n=== SISTEM LAYANAN KONSULTASI PSIKOLOG ===");
            System.out.println("1. Tambah Data Konsultasi");
            System.out.println("2. Tampilkan Data Konsultasi");
            System.out.println("3. Perbarui Data Konsultasi");
            System.out.println("4. Hapus Data Konsultasi");
            System.out.println("5. Cari Data Konsultasi");
            System.out.println("6. Keluar");
            System.out.print("Silahkan pilih menu di atas (1-6): ");

            if (!scan.hasNextInt()) {
                System.out.println("Input harus berupa angka");
                scan.nextLine();
                continue;
            }
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1 -> service.tambahData();
                case 2 -> service.tampilData();
                case 3 -> service.updateData();
                case 4 -> service.hapusData();
                case 5 -> service.searchData();
                case 6 -> {
                    System.out.println("Terima kasih.");
                    scan.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak ada, coba lagi!");
            }
        }
    }
}

