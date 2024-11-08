public class Main {
    public static void main(String[] args) {
        PlaylistMusik songList = new PlaylistMusik();

        // Menampilkan playlist kosong
        songList.display();

        songList.addLagu("A Sky Full of Stars", "Coldplay", "Pop", 2014, 264);
        songList.addLagu("Thinking Out Loud", "Ed Sheeran", "Pop", 2014, 281);
        songList.addLagu("Talking to the Moon", "Bruno Mars", "Pop", 2010, 228);
        songList.addLagu("Cinta Luar Biasa", "Andmesh Kamaleng", "Pop", 2018, 240);
        songList.addLagu("Laskar Pelangi", "Nidji", "Pop", 2008, 215);
        songList.addLagu("Kemesraan", "Iwan Fals", "Pop", 1988, 230);
        songList.addLagu("Akad", "Payung Teduh", "Pop", 2017, 265);
        songList.addLagu("Blinding Lights", "The Weeknd", "Pop", 2020, 200);
        songList.addLagu("Watermelon Sugar", "Harry Styles", "Pop", 2019, 174);
        songList.addLagu("Separuh Aku", "Noah", "Pop", 2012, 243);
        songList.addLagu("Meraih Bintang", "Via Vallen", "Dangdut", 2018, 202);
        songList.addLagu("Peaches", "Justin Bieber", "R&B", 2021, 198);
        songList.addLagu("Drivers License", "Olivia Rodrigo", "Pop", 2021, 242);
        songList.addLagu("Rumah Kita", "God Bless", "Rock", 1988, 276);
        songList.addLagu("Tinggal Kenangan", "Gaby", "Pop", 2007, 244);
        songList.addLagu("Good 4 U", "Olivia Rodrigo", "Pop", 2021, 178);
        songList.addLagu("Levitating", "Dua Lipa feat. DaBaby", "Pop", 2020, 203);
        songList.addLagu("Bintang Kehidupan", "Nike Ardilla", "Pop", 1990, 270);
        songList.addLagu("Pupus", "Dewa 19", "Pop", 2000, 298);
        songList.addLagu("Stay", "The Kid LAROI & Justin Bieber", "Pop", 2021, 142);
        songList.addLagu("Kangen", "Dewa 19", "Pop", 1992, 300);
        songList.addLagu("As It Was", "Harry Styles", "Pop", 2022, 167);
        songList.addLagu("Hanya Rindu", "Andmesh Kamaleng", "Pop", 2019, 210);
        songList.addLagu("Butter", "BTS", "Pop", 2021, 164);
        songList.addLagu("Easy On Me", "Adele", "Pop", 2021, 224);
        songList.addLagu("Januari", "Glenn Fredly", "Pop", 2003, 276);
        songList.addLagu("Save Your Tears", "The Weeknd", "Pop", 2020, 215);
        songList.addLagu("Sempurna", "Andra and the Backbone", "Pop", 2007, 250);
        songList.addLagu("Love Story", "Taylor Swift", "Country Pop", 2008, 235);
        songList.addLagu("All Too Well (10 Minute Version)", "Taylor Swift", "Pop", 2021, 600);
        songList.addLagu("Happier Than Ever", "Billie Eilish", "Pop", 2021, 298);
        songList.addLagu("Deen Assalam", "Sabyan", "Religi", 2018, 300);
        songList.addLagu("Bad Habits", "Ed Sheeran", "Pop", 2021, 231);
        songList.addLagu("Dance Monkey", "Tones and I", "Pop", 2019, 209);
        songList.addLagu("Shape of You", "Ed Sheeran", "Pop", 2017, 233);
        songList.addLagu("Rolling in the Deep", "Adele", "Pop", 2010, 228);
        songList.addLagu("Senorita", "Shawn Mendes & Camila Cabello", "Pop", 2019, 191);
        songList.addLagu("Don't Start Now", "Dua Lipa", "Pop", 2019, 183);
        songList.addLagu("Shallow", "Lady Gaga & Bradley Cooper", "Pop", 2018, 215);
        songList.addLagu("Someone Like You", "Adele", "Pop", 2011, 285);
        songList.addLagu("Rockstar", "Post Malone feat. 21 Savage", "Hip Hop", 2017, 218);
        songList.addLagu("Sunflower", "Post Malone & Swae Lee", "Hip Hop", 2018, 158);
        songList.addLagu("Perfect", "Ed Sheeran", "Pop", 2017, 263);
        songList.addLagu("Memories", "Maroon 5", "Pop", 2019, 189);
        songList.addLagu("Believer", "Imagine Dragons", "Rock", 2017, 204);
        songList.addLagu("Despacito", "Luis Fonsi feat. Daddy Yankee", "Reggaeton", 2017, 229);
        songList.addLagu("Kasih Putih", "Glenn Fredly", "Pop", 2001, 278);
        songList.addLagu("Bento", "Iwan Fals", "Rock", 1989, 320);
        songList.addLagu("Somewhere Over The Rainbow", "Israel Kamakawiwo'ole", "Hawaiian", 1993, 210);
        songList.addLagu("Photograph", "Ed Sheeran", "Pop", 2014, 258);
        songList.addLagu("See You Again", "Wiz Khalifa feat. Charlie Puth", "Hip Hop", 2015, 229);        
        // Menampilkan playlist setelah penambahan lagu
        songList.display();

        // Mengurutkan lagu berdasarkan durasi dengan Bubble Sort
        songList.bubbleByDurasi();
        songList.display();

        // Mengurutkan lagu berdasarkan tahun rilis dengan Selection Sort
        songList.selectionByTahunRilis();
        songList.display();

        // Mencari lagu berdasarkan judul tertentu
        songList.searchJudul("Blinding Lights");
        songList.searchJudul("Stay");
        songList.searchJudul("Akad");
        songList.searchJudul("Memories");
        songList.searchJudul("Despacito");
    }
}

