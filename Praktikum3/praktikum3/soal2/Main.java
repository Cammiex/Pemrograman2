package praktikum3.soal2;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        String namaNegara = "", jenisNegara="", namaPemimpin="";
        int tanggalMerdeka=0, bulanMerdeka=0, tahunMerdeka=0;
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> linNegara = new LinkedList<>();

        int inputUser;
        inputUser = input.nextInt();

        for (int i=0; i<inputUser; i++){
            Negara simpanNegara = new Negara(namaNegara, jenisNegara, namaPemimpin, tanggalMerdeka, bulanMerdeka, tahunMerdeka);
            simpanNegara.getData();
            linNegara.add(simpanNegara);
        }

        for (int i = 0; i < linNegara.size(); i++){
            Negara tampilkan = linNegara.get(i);
            tampilkan.cetak();
    }
}
}

