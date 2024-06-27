import java.util.Scanner;

public class compterALenvers {
    public static void main (String args []){

nUn();

    }
    static Scanner scanner = new Scanner(System.in);

    public static void nUn(){
        System.out.println("rentrez un nombre maximum 20  : " );
        int n = scanner.nextInt();
        
           for (int i=n; i>=1; i--){
            System.out.println("Les nombre sont " + i);
           }
   }


    }


