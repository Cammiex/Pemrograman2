package praktikum3.soal1;
import java.util.LinkedList;
    public class Dadu {
        private int user;
        int total;

        void setInput( int input ) {
        this.user = input;
        }

        LinkedList<Integer> simpanDadu = new LinkedList<Integer>();

        void acakNilai() {
            for( int i = 0; i < this.user; i++ ) {
            int randomAngka = 1 + (int)(Math.random() * 6);
            simpanDadu.add(randomAngka);
            this.total = this.total + randomAngka;
            }
         }

        void cetakHasilDadu() {
            for( int i = 0; i < this.user; i++ ) {
                System.out.println("Dadu ke-" + (i + 1) + " bernilai " + simpanDadu.get(i));
            }
            System.out.println("Total nilai dadu keseluruhan " + this.total);
        }
    }