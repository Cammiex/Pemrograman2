package praktikum4.soal1;
public class Buku {
    public String judul;
    public String penulis;
    public int tahun;
    
    //inisiasi objek menggunakan konstruktor
    public Buku(String j, String p, int t) {
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
    }
    
    //method display pada main
    public void display() {
        System.out.println("Detail buku:");
        System.out.println("Judul adalah " + judul);
        System.out.println("Penulis adalah " + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }
}
