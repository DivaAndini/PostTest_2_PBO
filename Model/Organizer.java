package Model;
import java.util.*;

public final class Organizer implements EventCRUD {
    private String nama_organizer;
    private String alamat_kantor;
    private static final ArrayList<Event> events = new ArrayList<>();

    public Organizer(String nama_organizer, String alamat_kantor) {
        this.nama_organizer = nama_organizer;
        this.alamat_kantor = alamat_kantor;
    }

    public String getNamaOrganizer() {
        return nama_organizer;
    }

    public void setNamaOrganizer(String nama_organizer) {
        this.nama_organizer = nama_organizer;
    }

    public String getAlamatKantor() {
        return alamat_kantor;
    }

    public void setAlamatKantor(String alamat_kantor) {
        this.alamat_kantor = alamat_kantor;
    }

    @Override
    public void addEvent(Event event) {
        events.add(event);
    }

    @Override
    public void showEvents() {
        if (events.isEmpty()) {
            System.out.println("<< Tidak Ada Event yang Tersedia >>");
        } else {
            for (Event event : events) {
                event.displayInfo();
                System.out.println("------------------------------");
            }
        }
    }

    @Override
    public void updateEvent(String nama_event, String tanggal_event, String lokasi_baru) {
        boolean found = false;
        for (Event event : events) {
            if (event.getEventName().equals(nama_event)) {
                event.setEventDate(tanggal_event);
                event.setLocation(lokasi_baru);
                System.out.println("<< Event '" + nama_event + "' Telah Diperbarui >>");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("<< Event Tidak Ditemukan >>");
        }
    }

    @Override
    public void removeEvent(String nama_event) {
        Iterator<Event> iterator = events.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Event event = iterator.next();
            if (event.getEventName().equals(nama_event)) {
                iterator.remove();
                System.out.println("<< Event '" + nama_event + "' Telah Dihapus >>");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("<< Event Tidak Ditemukan >>");
        }
    }
}