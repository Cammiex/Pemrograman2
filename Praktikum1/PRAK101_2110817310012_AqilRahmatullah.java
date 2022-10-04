package Praktikum1;
import java.util.Scanner;
public class PRAK101_2110817310012_AqilRahmatullah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaLengkap, tempatLahir, tanggalLahir, bulanLahir = null;
        int bulan, tahunLahir, tinggiBadan;
        float beratBadan;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap : ");
        namaLengkap = keyboard.nextLine();
        
        System.out.print("Masukkan Tempat Lahir : ");
        tempatLahir = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        tanggalLahir = keyboard.nextLine();
        
        System.out.print("Masukkan Bulan Lahir : ");
        bulan = keyboard.nextInt();
      
        System.out.print("Masukkan Tahun Lahir : ");
        tahunLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan : ");
        tinggiBadan = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan : ");
        beratBadan = keyboard.nextFloat();
        
        switch(bulan){
            case 1 -> bulanLahir = "Januari";
            case 2 -> bulanLahir = "Februari";
            case 3 -> bulanLahir = "Maret";
            case 4 -> bulanLahir = "April";
            case 5 -> bulanLahir = "Mei";
            case 6 -> bulanLahir = "Juni";
            case 7 -> bulanLahir = "Juli";
            case 8 -> bulanLahir = "Agustus";
            case 9 -> bulanLahir = "September";
            case 10 -> bulanLahir = "Oktober";
            case 11 -> bulanLahir = "November";
            case 12 -> bulanLahir = "Desember";
        }
        
        System.out.print("Data Telah Ditambahkan, \nNama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bulanLahir + " " + tahunLahir + " Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram " );
    }
    
}
