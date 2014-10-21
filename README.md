# Membuat Aplikasi #

Pertanyaan yang sering muncul di forum dan group di internet

> Saya ingin belajar bahasa pemrograman (java, php, c#, dsb). Bagaimana cara yang paling cepat dan mudah?

Jawaban : membuat aplikasi. Dengan membuat aplikasi, kita akan belajar:

* sintaks bahasa pemrograman : statement, looping, function, class, dsb
* cara menerjemahkan ide menjadi aplikasi
* cara membagi aplikasi besar menjadi modul-modul kecil supaya ringan pengerjaannya
* cara menghubungkan modul-modul agar bisa bekerja sama dengan baik
* cara mengubah suatu cerita menjadi kode program

Metode ini berlaku juga dalam bidang lain, misalnya SMK jurusan multimedia. Cara paling cepat dan mudah untuk bisa adalah coba membuat film pendek. Nanti akan belajar bercerita, lighting, teknik shooting, audio, dsb.

## Tahapan dalam membuat aplikasi ##

Dalam membuat aplikasi, semakin besar aplikasi, semakin kecil porsi codingnya. Dari keseluruhan effort, coding memakan 20%-40% porsi pekerjaan. Sisanya adalah project management, analisa requirement, testing, provisioning, dan lainnya.

* Proses legal dan komersial
* Requirement Specification
* Desain Aplikasi
* Construction
* User Acceptance Test
* Production
* Maintenance

## Kelengkapan Seremonial ##

* Ukuran Project
* Nilai Project
* Jumlah team member
* Project 5 BA 3 SA 100 PR dimanage dengan cara yang berbeda dengan project 1 BA/SA 3 PR.
* Contoh kasus:
  - Aplikasi bank
  - Sudah ada existing system, pakai RPG/AS400
  - Ingin membuat ATM switching menggunakan Java
  - Interfacing dengan HSM
  - Interfacing dengan Card Management yang dibuat vendor lain dengan .NET

## Studi Kasus ##

* Aplikasi Training Management
* Institusi mendaftarkan peserta
* Membuat kelas
* Cetak absensi
* Cetak papan nama di dada
* Cetak papan nama di meja
* Cetak sertifikat
* Export/Import data peserta

## Requirement Specification ##

* Daftar Fitur
* UI Mockup

## Desain Aplikasi ##

* Skema Database
* Class Diagram
* Pemilihan Teknologi, Framework, Library, dan Workflow

## Construction ##

* Coding
  * Main Source
  * Test Source
* Internal Testing
* Code Review
* Static Code Analysis

## Closing ##

* demikianlah tahap-tahap pembuatan aplikasi
* pada episode ini, kita juga sudah belajar analisa requirement
* requirement ini bersifat technology-independent, artinya bisa diimplement menggunakan teknologi apa saja
* oleh sebab itu, adalah suatu hal yang lazim requirement dan implementasi dilakukan oleh dua perusahaan yang berbeda. Perusahaan pertama membuatkan requirement sampai UI mockup, perusahaan kedua melakukan construction untuk membuat aplikasinya.
* pada tahap berikutnya, yaitu desain, kita baru akan melakukan pemilihan teknologi untuk membuat implementasi dari requirement ini
* Pemilihan teknologi juga belum tentu dilakukan oleh perusahaan yang melakukan implementasi. Bisa jadi teknologinya sudah ditentukan oleh client, agar seragam dengan aplikasi dia yang lainnya.
* client atau end user biasanya tidak peduli teknologi apa yang digunakan, yang penting aplikasinya bisa dipakai dengan baik
* 
