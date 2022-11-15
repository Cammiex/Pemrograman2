package praktikum4.soal2;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        //instansiasi scanner
        Scanner input = new Scanner(System.in);
        
        //input pilihan user
        System.out.println("Pilih buku yang ingin diinputkan : ");
        System.out.println("1. Novel");
        System.out.println("2. Komik");
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();
        input.nextLine();
        
        //pengkondisian untuk Novel atau Komik
        if(pilihan == 1){
            //Novel
            String judul, penulis, tahun, genre, sinopsis;
            
            System.out.print("Judul : ");
            judul = input.nextLine();
            
            System.out.print("Penulis : ");
            penulis = input.nextLine();
            
            System.out.print("Tahun Terbit : ");
            tahun = input.nextLine();
            
            System.out.print("Genre : ");
            genre = input.nextLine();
            
            System.out.print("Sinopsis : ");
            sinopsis = input.nextLine();
            
            //instansiasi objek novel
            Novel novel = new Novel(judul, penulis, tahun, genre, sinopsis);
            System.out.println(novel.getNovelDetail());
        } else if(pilihan == 2){
            //Komik
            String judul, penulis, tahun, sinopsis;
            int volume;
            
            System.out.print("Judul : ");
            judul = input.nextLine();
            
            System.out.print("Penulis : ");
            penulis = input.nextLine();
            
            System.out.print("Tahun Terbit : ");
            tahun = input.nextLine();
            
            System.out.print("Volume : ");
            volume = input.nextInt();
            input.nextLine();
            
            System.out.print("Sinopsis : ");
            sinopsis = input.nextLine();

            //instansiasi objek komik
            Komik komik = new Komik(judul, penulis, tahun, volume, sinopsis);
            System.out.println(komik.getKomikDetail());
        }
    }
    
}