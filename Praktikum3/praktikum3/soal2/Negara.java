package praktikum3.soal2;
import java.util.HashMap;
import java.util.Scanner;
public class Negara {
    private String namaNegara, jenisNegara, namaPemimpin;
    private int tanggalMerdeka, bulanMerdeka, tahunMerdeka;

    //Konstruktor
    public Negara(String namaNegara, String jenisNegara, String namaPemimpin, int tanggalMerdeka, int bulanMerdeka, int tahunMerdeka){
        this.namaNegara = namaNegara;
        this.jenisNegara = jenisNegara;
        this.namaPemimpin = namaPemimpin;
        this.tanggalMerdeka = tanggalMerdeka;
        this.bulanMerdeka = bulanMerdeka;
        this.tahunMerdeka = tahunMerdeka;
    }

    //Enkapsulasi
    public int getBulan(){
        return bulanMerdeka;
    }

    void getData(){
        Scanner inputD = new Scanner(System.in);
        namaNegara=inputD.nextLine();
        jenisNegara=inputD.nextLine();
        namaPemimpin=inputD.nextLine();
        if (jenisNegara.equalsIgnoreCase("presiden")||jenisNegara.equalsIgnoreCase("perdana menteri")) {
            tanggalMerdeka = inputD.nextInt();
            bulanMerdeka = inputD.nextInt();
            tahunMerdeka = inputD.nextInt();
        }
    }

    void cetak(){
        HashMap<Integer, String> month = new HashMap<Integer,String>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        if (jenisNegara.equalsIgnoreCase("presiden")) {
        System.out.println("Negara "+namaNegara+" mempunyai Presiden bernama "+namaPemimpin);
        }
        else if (jenisNegara.equalsIgnoreCase("perdana menteri")){
            System.out.println("Negara "+namaNegara+" mempunyai Perdana Menteri bernama "+namaPemimpin);
        }
        else if (jenisNegara.equalsIgnoreCase("monarki")){
            System.out.println("Negara "+namaNegara+" mempunyai Raja"+" bernama "+namaPemimpin+"\n");
        }
        if (jenisNegara.equalsIgnoreCase("presiden")||jenisNegara.equalsIgnoreCase("perdana menteri")) {
        System.out.println("Deklarasi Kemerdekaan pada Tanggal "+tanggalMerdeka+" "+month.get(getBulan())+" "+tahunMerdeka+"\n");}
    }
}