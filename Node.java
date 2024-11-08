public class Node {
    String judul, namaArtis, genre;
    int tahunRilis, durasi;
    Node next, prev;

    // Konstruktor
    public Node(String judul, String namaArtis, String genre, int tahunRilis, int durasi) {
        this.judul = judul;
        this.namaArtis = namaArtis;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
        this.durasi = durasi;
        this.next = null;
        this.prev = null;
    }

    // Mengonversi durasi ke menit
    public int convertKeMenit() {
        return durasi / 60;
    }

     // Mendapatkan sisa detik setelah dikonversi ke menit
    public int convertKeDetik() {
        return durasi % 60;
    }
}
