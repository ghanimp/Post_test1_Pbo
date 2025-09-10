package com.mycompany.post_test1;

import java.util.ArrayList;
import java.util.Scanner;

// Class pemain
class Pemain {
    public String nama;
    public String klub;
    public String posisi;
    public int nomorPunggung;
    public int usia;

    // Constructor
    public Pemain(String nama, String klub, String posisi, int nomorPunggung, int usia) {
        this.nama = nama;
        this.klub = klub;
        this.posisi = posisi;
        this.nomorPunggung = nomorPunggung;
        this.usia = usia;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s | Klub: %s | Posisi: %s | Nomor: %d | Usia: %d",
                nama, klub, posisi, nomorPunggung, usia);
    }
}

// Class manajemen pemain
class ManajemenPemain {
    private final ArrayList<Pemain> daftarPemain;

    public ManajemenPemain() {
        daftarPemain = new ArrayList<>();
    }

    // Menampilkan semua pemain
    public void tampilkanDaftarPemain() {
        if (daftarPemain.isEmpty()) {
            System.out.println("\nBelum ada data pemain.");
            return;
        }
        System.out.println("\n==== DAFTAR PEMAIN LIGA INGGRIS ====");
        for (int i = 0; i < daftarPemain.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPemain.get(i));
        }
    }

    // Menambah pemain dengan inputan
    public void tambahPemainBaru(Scanner scanner) {
        System.out.print("\nMasukkan nama pemain: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan klub pemain: ");
        String klub = scanner.nextLine();
        System.out.print("Masukkan posisi pemain: ");
        String posisi = scanner.nextLine();
        System.out.print("Masukkan nomor punggung pemain: ");
        int nomor = scanner.nextInt();
        System.out.print("Masukkan usia pemain: ");
        int usia = scanner.nextInt();
        scanner.nextLine();

        daftarPemain.add(new Pemain(nama, klub, posisi, nomor, usia));
        System.out.println("Pemain baru berhasil ditambahkan!");
    }

    // Mengupdate data pemain
    public void updatePemain(String namaCari, Scanner scanner) {
        boolean ditemukan = false;
        for (Pemain pemain : daftarPemain) {
            if (pemain.nama.equalsIgnoreCase(namaCari)) {
                System.out.print("Masukkan klub baru: ");
                pemain.klub = scanner.nextLine();
                System.out.print("Masukkan posisi baru: ");
                pemain.posisi = scanner.nextLine();
                System.out.print("Masukkan nomor punggung baru: ");
                pemain.nomorPunggung = scanner.nextInt();
                System.out.print("Masukkan usia baru: ");
                pemain.usia = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Data pemain berhasil diperbarui!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Pemain dengan nama '" + namaCari + "' tidak ditemukan.");
        }
    }

    // Menghapus data pemain
    public void hapusPemain(String namaCari) {
        boolean ditemukan = false;
        for (int i = 0; i < daftarPemain.size(); i++) {
            if (daftarPemain.get(i).nama.equalsIgnoreCase(namaCari)) {
                daftarPemain.remove(i);
                System.out.println("Pemain '" + namaCari + "' berhasil dihapus!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Pemain dengan nama '" + namaCari + "' tidak ditemukan.");
        }
    }
}

// Class main
public class Post_test1 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ManajemenPemain manajemen = new ManajemenPemain();

            int pilihan;
            do {
                System.out.println("\n=== SISTEM MANAJEMEN PEMAIN LIGA INGGRIS ===");
                System.out.println("1. Tampilkan semua pemain");
                System.out.println("2. Tambah pemain baru");
                System.out.println("3. Update data pemain");
                System.out.println("4. Hapus pemain");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu (1-5): ");

                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1 -> manajemen.tampilkanDaftarPemain();

                    case 2 -> manajemen.tambahPemainBaru(scanner);

                    case 3 -> {
                        System.out.print("\nMasukkan nama pemain yang ingin diupdate: ");
                        String namaUpdate = scanner.nextLine();
                        manajemen.updatePemain(namaUpdate, scanner);
                    }

                    case 4 -> {
                        System.out.print("\nMasukkan nama pemain yang ingin dihapus: ");
                        String namaHapus = scanner.nextLine();
                        manajemen.hapusPemain(namaHapus);
                    }

                    case 5 -> System.out.println("\nTerima kasih telah menggunakan sistem ini!");

                    default -> System.out.println("\nPilihan tidak valid. Silakan pilih 1-5.");
                }
            } while (pilihan != 5);
        }
    }
}