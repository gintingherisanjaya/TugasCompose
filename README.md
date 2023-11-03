# TugasCompose
Projek ini terdiri atas 3 halaman (screen), yang masing-masing halaman ada di package com.herisanjaya.tugascompose.screens

# 3 halaman utama pada project ini yakni :
+ Home
+ Profile
+ Setting

## Home
![3](https://github.com/gintingherisanjaya/TugasCompose/assets/138018382/3fb7c707-79fe-4ac9-97c7-5a49a9076f9b)

Pada Halaman ini terdapat fitur untuk melakukan aksi inkremental pada sebuah nilai yang akan diingat oleh Composer
nilainya. Saya menggunakan keyword remmember untuk memerintahkan composer mengingat nilainya dan menggunakan fungsi 
mutableStateOf dengan argumen 0, untuk membuat variabel ini dapat diubah nilainya.

Didalam fungsi Home saya menggunakan 3 tombol didalam satu container. 
+ Tombol pertama berlabel *Increment* yang setiap ditekan akan melakukan penambahan nilai satu terhadap variabel angka 
+ Tombol kedua berlabel *Navigate to Profile* yang jika ditekan akan menggunakan objek dari NavHostController dan menggunakan class Routes untuk membawa pengguna ke halaman profile
+ Tombol ketiga akan menavigasi pengguna ke halaman *setting* dengan membawa nilai terbaru dari variabel angka

## Profile
![2](https://github.com/gintingherisanjaya/TugasCompose/assets/138018382/4aeb3162-eb9c-460d-8d89-b90c411d354a)

Halaman ini merupakan halaman untuk menampilkan data dari Application Programming Interface (API) https://api.npoint.io.
Dalam halaman ini ditampilkan list bahasa.

### Retrofit (ListController dan ListModel)
Untuk menampilkan data dari api ke halaman profile dibutuhkan sebuah listcontroller dan listmodel.

## Setting
![1](https://github.com/gintingherisanjaya/TugasCompose/assets/138018382/ea4749c6-20e3-4a4e-a176-6d41152a87d5)

Halaman ini merupakan halaman pengaturan yang akan menampilkan data yang dikirimkan dari home saat halaman ini dibuka

### ROUTES merupakan api yang digunakan untuk memetakan halaman yang dapat diakses di aplikasi
