public class PlaylistMusik {
    Node head = null; 
    Node tail = null;
    int index;

    //menambahkan lagu ke dalam playlist
    public void addLagu(String judul, String namaArtis, String genre, int tahunRilis, int durasi) {
        Node lagu = new Node(judul, namaArtis, genre, tahunRilis, durasi);
        if (head == null) {
            head = lagu;
            tail = lagu;
        } else {
            tail.next = lagu;
            lagu.prev = tail;
            tail = lagu;
        }
    }

    //menukar data antara dua node
    private void swapData(Node x, Node y) {
        String tempJudul = x.judul;
        x.judul = y.judul;
        y.judul = tempJudul;

        String tempNamaArtis = x.namaArtis;
        x.namaArtis = y.namaArtis;
        y.namaArtis = tempNamaArtis;

        String tempGenre = x.genre;
        x.genre = y.genre;
        y.genre = tempGenre;

        int tempTahunRilis = x.tahunRilis;
        x.tahunRilis = y.tahunRilis;
        y.tahunRilis = tempTahunRilis;

        int tempDurasi = x.durasi;
        x.durasi = y.durasi;
        y.durasi = tempDurasi;
    }

    //pengurutan Bubble Sort berdasarkan durasi
    public void bubbleByDurasi() {
        if (head == null) // Tidak ada lagu jika head kosong
        return;

        boolean statusSwap = true;
        while (statusSwap) {
            statusSwap = false;
            Node current = head;

            //memeriksa setiap node dan tukar jika urutannya salah
            while (current.next != null) {
                if (current.durasi > current.next.durasi) {
                    swapData(current, current.next);
                    statusSwap = true;
                }
                current = current.next;
            }
        }
    }

    // Pengurutan Selection Sort berdasarkan tahun rilis
    public void selectionByTahunRilis() {
        if (head == null) return;

        for (Node current = head; current != null; current = current.next) {
            Node max = current;
            for (Node search = current.next; search != null; search = search.next) {
                if (search.tahunRilis > max.tahunRilis) {
                    max = search;
                }
            }
            if (max != current) {
                swapData(current, max);
            }
        }
    }

    //Mencari lagu berdasarkan judul
    public void searchJudul(String text) {
        String search = text;
        index = 1;
        Node temp = head;

        System.out.println("\n\n======================================================================================");
        System.out.println("||                                 LOL PLAYLIST                                     ||");
        System.out.println("======================================================================================");
        if (head == null) {
            System.out.println("                        There is no song in the playlist yet.                ");
            System.out.println("=======================================================================================");
        } else {
            while (temp != null) {
                if (temp.judul.equalsIgnoreCase(search)) {
                    System.out.println("Judul lagu yang ingin dicari : " + search);
                    System.out.println("Lagu yang sesuai dengan judul '" + search + "' ditemukan pada posisi ke - " + index);
                    System.out.println("======================================================================================");
                    System.out.printf("       %d | %s - %s (%d)\n", index, temp.namaArtis, temp.judul, temp.tahunRilis);
                    System.out.printf("       %d:%02d           %s\n", temp.convertKeMenit(), temp.convertKeDetik(), temp.genre);
                    System.out.println("======================================================================================");
                    return;
                } else if (temp.next == null) {
                    System.out.println("                  There is no song that you search in the playlist.                    ");
                    System.out.println("======================================================================================");
                }
                index++;
                temp = temp.next;
            }
        }
    }

    //Menampilkan semua lagu di dalam playlist
    public void display() {
        Node temp = head;
        index = 1;
        System.out.println("\n\n======================================================================================");
        System.out.println("||                                  LOL PLAYLIST                                    ||");
        System.out.println("======================================================================================");
        if (head == null) {
            System.out.println("                        There is no song in the playlist yet.         ");
            System.out.println("======================================================================================");
            return;
        }
        while (temp != null) {
            System.out.printf("       %d | %s - %s (%d)\n", index, temp.namaArtis, temp.judul, temp.tahunRilis);
            System.out.printf("       %d:%02d           %s\n", temp.convertKeMenit(), temp.convertKeDetik(), temp.genre);
            System.out.println("======================================================================================");
            temp = temp.next;
            index++;
        }
    }
}




    
