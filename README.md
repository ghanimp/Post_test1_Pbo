**Nama : Ghani Mandala Putra**

**Nim: 2409116042**

**Tema : Manajemen Data Pemain Bola Pada Liga Inggris**
---

# Deskripsi Program

Program ini adalah sistem manajemen pemain sederhana berbasis console. Fungsi utamanya: Tambah, Lihat, Update, dan Hapus data pemain. Semua data disimpan sementara di memori menggunakan beberapa ArrayList (one list per atribut). Program ini berjalan secara interaktif melalui menu yang terus berulang sampai pengguna memilih untuk keluar, sehingga memudahkan pengguna untuk melakukan lebih dari satu operasi sekaligus.

-----

## Penjelasan Alur Program

1. Package dan Import Library

<img width="416" height="111" alt="image" src="https://github.com/user-attachments/assets/e68e4436-67b0-470d-8d3a-110751cbb5c7" />

- package digunakan untuk menentukan lokasi file Java di dalam proyek (struktur folder).
- import java.util.ArrayList; digunakan untuk menggunakan struktur data ArrayList.
- import java.util.Scanner; digunakan untuk membaca input dari keyboard.

2. Class dan Method Main

<img width="572" height="65" alt="image" src="https://github.com/user-attachments/assets/71263249-8c48-4a55-ab31-80b6a6714455" />

- public class Post_test1 merupakan nama class utama.
- public static void main(String[] args) digunakan untuk menjalankan program Java.

3. Deklarasi ArrayList

<img width="663" height="162" alt="image" src="https://github.com/user-attachments/assets/58b8b722-96ca-4e17-bdff-9491c2fcbd35" />

- Setiap atribut pemain disimpan dalam ArrayList berbeda:
  - namaPemain  menyimpan nama pemain.
  - klubPemain menyimpan klub pemain.
  - posisiPemain menyimpan posisi pemain.
  - nomorPunggung menyimpan nomor punggung.
  - usiaPemain menyimpan usia pemain.
 
4. Scanner Input

<img width="613" height="68" alt="image" src="https://github.com/user-attachments/assets/24db74a4-9e3f-463c-8700-21fbf1bcd873" />

- Scanner digunakan untuk menangkap input pengguna.
- try di gunakan untuk menutup scaner secara otomatis saat progran selesai.

5. Menu Perulangan

<img width="84" height="40" alt="image" src="https://github.com/user-attachments/assets/eca89020-7f0e-4f31-bc07-836cde68dcd1" /> <img width="283" height="69" alt="image" src="https://github.com/user-attachments/assets/3c57cfd5-74c6-4c50-8041-2847e8b9ab28" />

- Program akan terus berjalan menampilkan menu selama user belum memilih 5 (Keluar).

6. Menu Pilihan

<img width="854" height="304" alt="image" src="https://github.com/user-attachments/assets/80d38a45-d111-4810-a549-97564b8b53b9" />


- User akan ditampilkan 5 menu pilihan.
- Terdapat switch (pilihan) untuk menangani aksi berdasarkan pilihan user.

  a. Tambah Pemain

  <img width="675" height="606" alt="image" src="https://github.com/user-attachments/assets/9bf79ac6-88b8-4c26-9986-85edaac8a2fa" />

    - User diminta untuk memasukan nama, asal klub, posisi, nomor punggung, dan usia pemain untuk menambah data pemain baru.
    - Sistem akan menyimpan data ke ArrayList sesuai atributnya. 

  b. Lihat Daftar Pemain

  <img width="1155" height="468" alt="image" src="https://github.com/user-attachments/assets/a067c56c-a8a5-4687-a5be-78de1ebc6363" />
    - Semua pemain yang sudah tersimpan akan ditampilkan sesuai dengan format yang ada.
    - Jika belum ada data yang dimasukkan, akan ada pesan “Belum ada data pemain”.

  c. Update Pemain

  <img width="852" height="343" alt="image" src="https://github.com/user-attachments/assets/97079ad3-b8d0-437c-8a28-f7366272a0e7" />

    - User akan diperintahkan untuk memasukkan nama pemain yang ingin di update.
 
  <img width="734" height="551" alt="image" src="https://github.com/user-attachments/assets/15d61f6e-cb9e-4d94-88ef-43b23d64737b" />
   
   - Jika nama pemain yang ingin di update ditemukan program akan otomatis meminta user untuk memasukkan ulang data pemain sesuai saat ingin menambah pemain.
   - Jika berhasil akan muncul pesan "Data pemain berhasil diperbarui!".

  <img width="1023" height="111" alt="image" src="https://github.com/user-attachments/assets/a9e5a1e7-822c-48aa-b92a-e27d4fa6f200" />

   - Jika nama pemain tidak ditemukan sistem akan otomatis memberikan pesan nama pemain tidak ditemukan dan user akan kembali kemenu awal.

  d. Hapus Pemain

  <img width="1074" height="661" alt="image" src="https://github.com/user-attachments/assets/35409c59-7f4e-45dc-8f2a-c213ef1c6691" />

    - User memasukkan nama pemain yang mau dihapus dan sistem akan otomatis mencari nama tersebut didaftar.
    - Jika ditemukan data atribut pemain dihapus dari semua ArrayList.
    - Jika tidak user akan kembali kemenu awal.

  e. Keluar

  <img width="1003" height="126" alt="image" src="https://github.com/user-attachments/assets/5b74e59c-2e15-4f8c-9a4d-70fe84e9f995" />

    - Program berhenti otomatis jika user memilih 5, karena kondisi while (pilihan != 5) tidak terpenuhi lagi.
    - default akan muncul ketika user mengetik angka selain 1–5.
  
## Output

1. Tampilan menu awal

<img width="507" height="187" alt="image" src="https://github.com/user-attachments/assets/96cb2bd3-2945-431e-bb7b-8b7011896d35" />

2. Tampilan saat menambahkan pemain

<img width="473" height="179" alt="image" src="https://github.com/user-attachments/assets/b92e0062-8580-449e-bcd1-d736fcc36784" />

3. Tampilan saat memilih menampilkan data pemain

<img width="979" height="80" alt="image" src="https://github.com/user-attachments/assets/e7d6c56f-c1e6-422d-a940-adb46bdb2d68" />

4. Tampilan saat user mengupdate pemain

 - Sebelum diupdate

<img width="1004" height="114" alt="image" src="https://github.com/user-attachments/assets/eb7c18de-2f21-4a18-85a2-ab206d2ec404" />

 - Setelah diupdate

<img width="972" height="94" alt="image" src="https://github.com/user-attachments/assets/14e7b15f-e97a-46ee-9bc6-5f354c292ee6" />

 - Tampilan saat mengupdate

<img width="614" height="195" alt="image" src="https://github.com/user-attachments/assets/3652e9e4-3059-4d22-a914-cb8639766c62" />

5. Tampilan saat menghapus pemain

 - Tampilan sebelum dihapus

<img width="974" height="114" alt="image" src="https://github.com/user-attachments/assets/332ded52-03bd-4862-9c73-9856d461ee96" />

 - Tampilan setelah dihapus

<img width="980" height="95" alt="image" src="https://github.com/user-attachments/assets/a4603ac8-8198-444d-abce-112973cdea16" />

 - Tampilan jika berhasil

<img width="525" height="63" alt="image" src="https://github.com/user-attachments/assets/e9e29ae3-68d7-4d51-9438-50141eef56ee" />

 - Tampilan jika pemain tidak ditemukan

<img width="499" height="75" alt="image" src="https://github.com/user-attachments/assets/8f1d97f3-dc9e-4faa-8e5a-d9b080b7a2c5" />

6. Tampilan saat user memilih selain angka 1-5

<img width="266" height="90" alt="image" src="https://github.com/user-attachments/assets/c6da5d8a-d788-4c2f-ac5c-d4cbe0d9a59d" />

8. Tampilan saat user memilih keluar

<img width="812" height="114" alt="image" src="https://github.com/user-attachments/assets/6d5e8a1e-9a80-452e-9be6-7acfd7132a29" />











