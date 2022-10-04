package Praktikum1;
import java.util.Scanner;
public class PRAK102_2110817310012_AqilRahmatullah {
     public static void main(String[] args) {
        int bilangan, bilanganCetak;
        Scanner keyboard = new Scanner(System.in);
        
        //Input dari User
        bilangan = keyboard.nextInt();
        
        int i = 7;
        while (i >= 0) {            
            if (bilangan % 2 == 0){
                bilanganCetak = (bilangan / 2) - 1;
            } else {
                bilanganCetak = bilangan;
            }
            
            if (i == 7){
               System.out.print(bilanganCetak);
            } else {
                System.out.print(", " + bilanganCetak);
            }
            
            bilangan = bilangan + 1;
            i = i - 1;
        }
    }
}
