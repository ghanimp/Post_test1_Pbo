package com.mycompany.post_test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Post_test1 {
    public static void main(String[] args) {
        // ArrayList untuk tiap atribut pemain
        ArrayList<String> namaPemain = new ArrayList<>();
        ArrayList<String> klubPemain = new ArrayList<>();
        ArrayList<String> posisiPemain = new ArrayList<>();
        ArrayList<Integer> nomorPunggung = new ArrayList<>();
        ArrayList<Integer> usiaPemain = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            
            do {
                System.out.println("\n=== SISTEM MANAJEMEN PEMAIN LIGA INGGRIS ===");
                System.out.println("1. Tambah Pemain");
                System.out.println("2. Lihat Daftar Pemain");
                System.out.println("3. Update Data Pemain");
                System.out.println("4. Hapus Pemain");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = input.nextInt();
                input.nextLine();
                
                switch (pilihan) {
                    case 1 -> {
                        // Tambah pemain
                        System.out.print("\nMasukkan nama pemain: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan klub pemain: ");
                        String klub = input.nextLine();
                        System.out.print("Masukkan posisi pemain: ");
                        String posisi = input.nextLine();
                        System.out.print("Masukkan nomor punggung: ");
                        int nomor = input.nextInt();
                        System.out.print("Masukkan usia pemain: ");
                        int usia = input.nextInt();
                        input.nextLine();
                        
                        namaPemain.add(nama);
                        klubPemain.add(klub);
                        posisiPemain.add(posisi);
                        nomorPunggung.add(nomor);
                        usiaPemain.add(usia);
                        
                        System.out.println("Pemain berhasil ditambahkan!");
                    }
                    
                    case 2 -> {
                        // Lihat daftar pemain
                        System.out.println("\n=== DAFTAR PEMAIN ===");
                        if (namaPemain.isEmpty()) {
                            System.out.println("Belum ada data pemain.");
                        } else {
                            for (int i = 0; i < namaPemain.size(); i++) {
                                System.out.printf("%d. Nama: %s | Klub: %s | Posisi: %s | Nomor: %d | Usia: %d%n",
                                        i + 1,
                                        namaPemain.get(i),
                                        klubPemain.get(i),
                                        posisiPemain.get(i),
                                        nomorPunggung.get(i),
                                        usiaPemain.get(i));
                            }
                        }
                    }
                    
                    case 3 -> {
                        // Update pemain 
                        System.out.print("\nMasukkan nama pemain yang ingin diupdate: ");
                        String namaCari = input.nextLine();
                        
                        int idx = -1;
                        for (int i = 0; i < namaPemain.size(); i++) {
                            if (namaPemain.get(i).equalsIgnoreCase(namaCari)) {
                                idx = i;
                                break;
                            }
                        }
                        
                        if (idx != -1) {
                            System.out.print("Masukkan nama baru: ");
                            String namaBaru = input.nextLine();
                            System.out.print("Masukkan klub baru: ");
                            String klubBaru = input.nextLine();
                            System.out.print("Masukkan posisi baru: ");
                            String posisiBaru = input.nextLine();
                            System.out.print("Masukkan nomor punggung baru: ");
                            int nomorBaru = input.nextInt();
                            System.out.print("Masukkan usia baru: ");
                            int usiaBaru = input.nextInt();
                            input.nextLine();
                            
                            namaPemain.set(idx, namaBaru);
                            klubPemain.set(idx, klubBaru);
                            posisiPemain.set(idx, posisiBaru);
                            nomorPunggung.set(idx, nomorBaru);
                            usiaPemain.set(idx, usiaBaru);
                            
                            System.out.println("Data pemain berhasil diperbarui!");
                        } else {
                            System.out.println("Pemain dengan nama '" + namaCari + "' tidak ditemukan.");
                        }
                    }
                    
                    case 4 -> {
                        System.out.print("\nMasukkan nama pemain yang ingin dihapus: ");
                        String namaHapus = input.nextLine();
                        
                        int idxHapus = -1;
                        for (int i = 0; i < namaPemain.size(); i++) {
                            if (namaPemain.get(i).equalsIgnoreCase(namaHapus)) {
                                idxHapus = i;
                                break;
                            }
                        }
                        
                        if (idxHapus != -1) {
                            namaPemain.remove(idxHapus);
                            klubPemain.remove(idxHapus);
                            posisiPemain.remove(idxHapus);
                            nomorPunggung.remove(idxHapus);
                            usiaPemain.remove(idxHapus);
                            
                            System.out.println("Pemain berhasil dihapus!");
                        } else {
                            System.out.println("Pemain dengan nama '" + namaHapus + "' tidak ditemukan.");
                        }
                    }
                    
                    case 5 -> System.out.println("\nTerima kasih telah menggunakan sistem ini!");
                    
                    default -> System.out.println("\nPilihan tidak valid.");
                }
                
            } while (pilihan != 5);
        }
    }
}
