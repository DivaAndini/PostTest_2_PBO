# Sistem Manajemen Event
- Nama    : Diva Tri Andini
- NIM      : 2309116011

# Deskripsi Program
Sistem Manajemen Event Sederhana adalah program yang dibuat untuk mengelola berbagai acara. Program ini dibuat untuk membantu organizer (penyelenggara acara) dalam menambah, melihat, memperbarui, dan menghapus event yang mereka selenggarakan. Program ini menggunakan bahasa pemrograman Java dan mengimplementasikan konsep Object-Oriented Programming (OOP).

1. Package
   - Model: Di dalam paket ini terdapat kelas-kelas model yang digunakan untuk mendefinisikan Event, baik yang bersifat OnlineEvent maupun OfflineEvent.
   - Main: Paket utama yang menjalankan aplikasi, termasuk input dari pengguna dan logika kontrol menu utama.

2. Class & Interface
   - Event (Abstraksi - Abstract Class): Class Event adalah kelas abstrak yang mendefinisikan struktur dasar sebuah event. Kelas ini digunakan sebagai super class dari event-event spesifik seperti OnlineEvent dan OfflineEvent. Menggunakan konsep inheritance di mana subclass dapat mewarisi properti dari Event serta menambahkan properti khusus.
   - OnlineEvent (Inheritance - Subclass): OnlineEvent adalah subclass dari Event yang menambahkan properti spesifik untuk event online, yaitu platform.
   - OfflineEvent (Inheritance - Subclass): OfflineEvent adalah subclass dari Event yang memiliki properti khusus seperti kapasitas peserta untuk event offline.
   - Organizer (Encapsulation, CRUD, Static Method): Class Organizer bertugas mengelola daftar event. Menggunakan konsep encapsulation untuk membungkus data dan menyediakan method getter dan setter. Class ini juga memiliki metode CRUD (Create, Read, Update, Delete) yang mengatur event yang ditambahkan ke daftar events.
   - EventCRUD (Interface): Interface EventCRUD mengatur operasi dasar untuk event (CRUD) sehingga memungkinkan berbagai kelas untuk mengimplementasikannya. Interface ini digunakan di class Organizer untuk mengimplementasikan method-method CRUD seperti addEvent(), removeEvent(), dll.

# Cara Kerja Program
Saat program dijalankan, objek organizer dibuat dan beberapa record data event default juga ditambahkan untuk menyediakan data awal yang bisa dilihat dan dikelola pengguna.

Setelah inisialisasi, program menampilkan menu utama kepada pengguna, di mana pengguna dapat memilih operasi yang ingin dilakukan (menambah event, menampilkan semua event, memperbarui event, menghapus event, atau keluar dari program). Pengguna diminta untuk memasukkan pilihan (dengan angka) untuk menentukan tindakan yang ingin diambil.

![Screenshot 2024-10-14 165307](https://github.com/user-attachments/assets/06141d19-2041-4a9b-849d-56f035f624d4)

Berikut merupakan operasi CRUD pada Sistem Manajemen Event.
- Menambahkan Event:
  Pengguna emasukkan detail yang diperlukan seperti nama event, tanggal, lokasi, dan memasukkan detail khusus untuk tiap jenis event seperti platform (untuk event online) atau kapasitas (untuk event offline).
  Event tersebut kemudian ditambahkan ke daftar event organizer melalui metode addEvent().
  ![Screenshot 2024-10-14 165318](https://github.com/user-attachments/assets/e33ca666-d884-4340-ba16-2d3fc55a0451)

- Menampilkan Semua Event:
  Program memanggil metode showEvents() dari kelas Organizer, yang menampilkan informasi semua event (baik online maupun offline) yang telah ditambahkan.
  ![Screenshot 2024-10-14 165334](https://github.com/user-attachments/assets/4cf75f31-0e34-4b47-8acb-e0285507ad8b)

- Memperbarui Event:
  Pengguna dapat memperbarui event berdasarkan nama event. Program meminta pengguna memasukkan nama event, tanggal baru, dan lokasi baru, lalu memperbarui event yang cocok dengan nama yang dimasukkan.
  ![Screenshot 2024-10-14 165419](https://github.com/user-attachments/assets/782fb9ac-c2e8-490c-b24c-82293dbaa9dc)

- Menghapus Event:
  Pengguna dapat menghapus event dengan memasukkan nama event yang ingin dihapus. Jika ditemukan, event tersebut akan dihapus dari daftar event.![Screenshot 2024-10-14 165452](https://github.com/user-attachments/assets/403d6207-d3f1-466c-9bfd-8645dca706fd)

Jika pengguna memilih opsi "0", program akan menghentikan eksekusi dan menampilkan pesan bahwa sistem telah ditutup.
![Screenshot 2024-10-14 165531](https://github.com/user-attachments/assets/bbf46d1f-f243-435b-bc09-117af670265b)

Program berjalan dalam loop (perulangan) hingga pengguna memilih untuk keluar. Selama loop, pengguna dapat melakukan operasi CRUD berulang kali sampai mereka memutuskan untuk keluar.











