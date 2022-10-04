package Praktikum1;
import java.util.Scanner;
public class PRAK103_2110817310012_AqilRahmatullah {
    public static void main(String[] args) {
        int bil;
        Scanner keyboard = new Scanner(System.in);
        //Input User
        bil = keyboard.nextInt();
        
        int i = 5;
        
        do {            
            if (bil % 7 != 0){
                if (i == 5){
                   System.out.print(bil);
                } else {
                    System.out.print(", " + bil);
                }
            }
            
            bil = bil - 1;
            i = i - 1;
        } while (i > 0);
    }
}
