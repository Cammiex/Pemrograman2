package praktikum3.soal1;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Dadu dadu = new Dadu();
            int user = input.nextInt();
            dadu.setInput(user);
            dadu.acakNilai();
            dadu.cetakHasilDadu();
        }
    }