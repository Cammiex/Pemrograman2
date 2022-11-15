package praktikum4.soal2;
public class Novel extends Buku {
    private String genre, sinopsis;
    
    //konstruktor
    public Novel(String j, String p, String t, String g, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.genre = g;
        this.sinopsis = s;
    }
    
    String getNovelDetail(){
        return "Data yang baru di inputkan adalah\nSebuah novel bergenre Drama dengan judul \"" + judul
        + "\". Novel  tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + tahun
        + ".\nSinopsis : " + sinopsis.substring(0, 59) + "...";
    }
}