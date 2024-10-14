package Model;

public class OfflineEvent extends Event {
    private final int kapasitas;

    public OfflineEvent(String nama_event, String tanggal_event, String lokasi, int kapasitas) {
        super(nama_event, tanggal_event, lokasi);
        this.kapasitas = kapasitas;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nNama Event   : " + getEventName());
        System.out.println("Tanggal Event: " + getEventDate());
        System.out.println("Lokasi       : " + getLocation() + " (Offline)");
        System.out.println("Kapasitas    : " + kapasitas);
    }
}
