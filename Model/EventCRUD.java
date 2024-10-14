package Model;

public interface EventCRUD {
    void addEvent(Event event);
    void updateEvent(String nama_event, String tanggal_event, String lokasi_baru);
    void removeEvent(String nama_event);
    void showEvents();
}
