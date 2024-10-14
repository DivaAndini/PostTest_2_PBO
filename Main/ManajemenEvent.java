package Main;
import java.util.*;
import Model.Event;
import Model.Organizer;
import Model.OfflineEvent;
import Model.OnlineEvent;

public class ManajemenEvent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Organizer organizer = new Organizer("Mega Event Organizer", "Jl. Kemang Raya No.10");
        
        Event event1 = new OnlineEvent("Talkshow", "2024-11-09", "Hexagon", "Zoom");
        Event event2 = new OfflineEvent("Donor Darah", "2024-11-06", "Ruang C105", 100);
        Event event3 = new OfflineEvent("Pedas Puas Festival", "2024-12-21", "Gor Kadrie Oening", 500);
        Event event4 = new OnlineEvent("Workshop IT", "2024-11-05", "Lab Komputer", "Google Meet");
        
        organizer.addEvent(event1);
        organizer.addEvent(event2);
        organizer.addEvent(event3);
        organizer.addEvent(event4);
        
        boolean isRunning = true;
        System.out.println("<< Selamat Datang di Sistem Manajemen Event >>");
        
        while (isRunning) {
            System.out.println("\n+------------------------------+");
            System.out.println("|             MENU             |");
            System.out.println("+------------------------------+");
            System.out.println("| 1. Menambahkan Event         |");
            System.out.println("| 2. Menampilkan Semua Event   |");
            System.out.println("| 3. Memperbarui Event         |");
            System.out.println("| 4. Menghapus Event           |");
            System.out.println("| 0. Keluar                    |");
            System.out.println("+------------------------------+");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama event: ");
                    String namaEvent = scanner.nextLine();
                    System.out.print("Masukkan tanggal event (YYYY-MM-DD): ");
                    String tanggalEvent = scanner.nextLine();
                    System.out.print("Masukkan lokasi event: ");
                    String lokasi = scanner.nextLine();
                    System.out.println("+------------------------------+");
                    System.out.println("|       Menambahkan Event      |");
                    System.out.println("+------------------------------+");
                    System.out.println("| 1. Event Online              |");
                    System.out.println("| 2. Event Offline             |");
                    System.out.println("| 0. Keluar                    |");
                    System.out.println("+------------------------------+");
                    System.out.print("Masukkan pilihan: ");
                    int pilih = scanner.nextInt();
                    scanner.nextLine();
                    switch (pilih){
                        case 1:
                            System.out.print("Masukkan platform: ");
                            String platform = scanner.nextLine();
                            Event onlineEvent = new OnlineEvent(namaEvent, tanggalEvent, lokasi, platform);
                            organizer.addEvent(onlineEvent);
                            System.out.println("<< Event '" + namaEvent + "' Telah Ditambahkan >>");
                            break;
                        case 2:
                            System.out.print("Masukkan kapasitas: ");
                            int kapasitas = scanner.nextInt();
                            Event offlineEvent = new OfflineEvent(namaEvent, tanggalEvent, lokasi, kapasitas);
                            organizer.addEvent(offlineEvent);
                            System.out.println("<< Event '" + namaEvent + "' Telah Ditambahkan >>");
                            break;
                        case 0:
                            System.out.println("<< Kembali ke Menu Utama >>");
                            break;
                        default:
                            System.out.println("<< Opsi Tidak Valid! Silakan Coba Lagi >>");
                    }
                case 2:
                    organizer.showEvents();
                    break;

                case 3:
                    System.out.print("Masukkan nama event yang ingin diperbarui: ");
                    String nama_event = scanner.nextLine();
                    System.out.print("Masukkan tanggal event baru (YYYY-MM-DD): ");
                    String tanggal_event = scanner.nextLine();
                    System.out.print("Masukkan lokasi baru: ");
                    String lokasi_baru = scanner.nextLine();
                    organizer.updateEvent(nama_event, tanggal_event, lokasi_baru);
                    break;

                case 4:
                    System.out.print("Masukkan nama event yang ingin dihapus: ");
                    String nama_event_hapus = scanner.nextLine();
                    organizer.removeEvent(nama_event_hapus);
                    break;

                case 0:
                    isRunning = false;
                    System.out.println("<< Sistem Manajemen Event Ditutup >>");
                    break;

                default:
                    System.out.println("<< Opsi Tidak Valid! Silakan Coba Lagi >>");
            }     
        }       
    }
}