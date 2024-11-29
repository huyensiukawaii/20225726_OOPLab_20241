package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
    public static int nbDigitalVideoDiscs = 0; // Bộ đếm để cấp phát id

    // Constructor đầy đủ
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, length, director); // Gọi constructor lớp cha
    }

    // Constructor không có length
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, director); // Mặc định length = 0
    }

    // Constructor không có director
    public DigitalVideoDisc(String title, String category, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, "Unknown"); // Mặc định director = "Unknown" và length = 0
    }

    // Constructor chỉ có title
    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDiscs, title, null, 0.0f, 0, "Unknown"); // Mặc định director = "Unknown" và length = 0
    }

    // Phương thức toString sử dụng getter từ lớp Disc
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + " min: " + getCost() + " $";
    }

    // Phương thức kiểm tra khớp tiêu đề
    public boolean isMatch(String title) {
        return this.getTitle().equalsIgnoreCase(title);
    }
}
