package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media { 
    public static int nbDigitalVideoDiscs = 0; // Bộ đếm để cấp phát id

    private String director;
    private int length;

    // Constructor đầy đủ
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost); // Gọi constructor lớp cha
        this.director = director;
        this.length = length;
    }

    // Constructor không có length
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost);
        this.director = director;
    }

    // Constructor không có director
    public DigitalVideoDisc(String title, String category, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost);
    }

    // Constructor chỉ có title
    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDiscs, title, null, 0.0f);
    }

    // Getter và Setter cho các thuộc tính riêng
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Phương thức toString sử dụng getter từ lớp Media
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + director + " - " + length + " min: " + getCost() + " $";
    }

    // Phương thức kiểm tra khớp tiêu đề
    public boolean isMatch(String title) {
        return this.getTitle().equalsIgnoreCase(title);
    }
}
