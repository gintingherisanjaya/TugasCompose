# TugasCompose
Projek ini terdiri atas 3 halaman (screen), yang masing-masing halaman ada di package com.herisanjaya.tugascompose.screens

# 3 halaman utama pada project ini yakni, yakni :
+ Home
+ Profile
+ Setting

## Home
Pada Halaman ini terdapat fitur untuk melakukan aksi inkremental pada sebuah nilai yang akan diingat oleh Composer
nilainya. Saya menggunakan keyword remmember untuk memerintahkan composer mengingat nilainya dan menggunakan fungsi 
mutableStateOf dengan argumen 0, untuk membuat variabel ini dapat diubah nilainya.

Didalam fungsi Home saya menggunakan 3 tombol didalam satu container. 
+ Tombol pertama berlabel *Increment* yang setiap ditekan akan melakukan penambahan nilai satu terhadap variabel angka 
+ Tombol kedua berlabel *Navigate to Profile* yang jika ditekan akan menggunakan objek dari NavHostController dan menggunakan class Routes untuk membawa pengguna ke halaman profile
+ Tombol ketiga akan menavigasi pengguna ke halaman *setting* dengan membawa nilai terbaru dari variabel angka

## Profile
Halaman ini merupakan halaman untuk menampilkan profile pengguna

## Setting
Halaman ini merupakan halaman pengaturan yang akan menampilkan data yang dikirimkan dari home saat halaman ini dibuka

### ROUTES merupakan api yang digunakan untuk memetakan halaman yang dapat diakses di aplikasi


