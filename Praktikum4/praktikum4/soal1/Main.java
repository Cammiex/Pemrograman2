package praktikum4.soal1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    //instansiasi scanner
    Scanner input = new Scanner (System.in);
    
    //variabel untuk input
    String j, p;
    int t;
    
    //input dari user
    System.out.print("Judul : ");
    j = input.nextLine();
        
    System.out.print("Penulis : ");
    p = input.nextLine();
        
    System.out.print("Tahun Terbit : ");
    t = input.nextInt();
        
    //instansiasi objek "buku"
    Buku buku = new Buku(j, p, t);
    
    buku.display();
    
    }
    
}
