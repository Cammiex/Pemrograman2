package Praktikum1;
import java.util.Scanner;
public class PRAK104_2110817310012_AqilRahmatullah {
    public static void main(String[] args) {
        int poinAndi = 0, poinBudi = 0;
        int Andi1, Andi2, Andi3, Budi1, Budi2, Budi3;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Kartu Andi: ");
        Andi1 = keyboard.nextInt();
        Andi2 = keyboard.nextInt();
        Andi3 = keyboard.nextInt();

        System.out.print("Kartu Budi: ");
        Budi1 = keyboard.nextInt();
        Budi2 = keyboard.nextInt();
        Budi3 = keyboard.nextInt();
        
        int Andi [] = {Andi1, Andi2, Andi3};
        int Budi [] = {Budi1, Budi2, Budi3};
        
        for(int i = 0; i < 3; i++) {
            if(Budi[i] < Andi[i]) {
                poinAndi++;
            } else if(Budi[i] > Andi[i]) {
                poinBudi++;
            } 
        }

        if(poinBudi > poinAndi) {
            System.out.println("Budi");
        } else if(poinBudi < poinAndi) {
            System.out.println("Andi");
        } else {
            System.out.println("Seri");
        }
    }
}

