package Praktikum1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class PRAK105_2110817310012_AqilRahmatullah {
    public static final double PHI = 3.14;
    
    public static void main(String[] args) {
        double jarijari, tinggi, hasil;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari : ");
        jarijari = keyboard.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        tinggi = keyboard.nextDouble();
        
        hasil = PHI * jarijari * jarijari * tinggi;
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.println("Volume tabung dengan jari-jari " + jarijari + " cm ");
        System.out.println("dan tinggi " + tinggi + " cm ");
        System.out.println("adalah " + df.format(hasil) + " m3");
    }
}
