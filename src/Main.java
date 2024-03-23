public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng MP3
        MP3 mp3 = new MP3("Song Name", "Description of the song", "MP3-001", 10.99f, 240);

        // Tạo đối tượng Book
        Book book = new Book("Book Title", "Description of the book", "BK-001", 29.99f, "Author Name", 300, "Fiction");

        // Hiển thị thông tin của đối tượng MP3
        System.out.println("MP3 Information:");
        mp3.showInfo();
        System.out.println();

        // Hiển thị thông tin của đối tượng Book
        System.out.println("Book Information:");
        book.showInfo();
    }
}

