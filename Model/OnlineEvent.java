
package Model;

public class OnlineEvent extends Event {
    private final String platform;

    public OnlineEvent(String nama_event, String tanggal_event, String lokasi, String platform) {
        super(nama_event, tanggal_event, lokasi);
        this.platform = platform;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nNama Event   : " + getEventName());
        System.out.println("Tanggal Event: " + getEventDate());
        System.out.println("Lokasi       : " + getLocation() + " (Online)");
        System.out.println("Platform     : " + platform);
    }
}