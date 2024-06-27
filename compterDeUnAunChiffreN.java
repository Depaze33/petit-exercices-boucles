import java.util.Scanner;

public class compterDeUnAunChiffreN {
    public static void main (String args []){

UnAn();

    }
    static Scanner scanner = new Scanner(System.in);

    public static void UnAn(){
        System.out.println("rentrez un nombre maximum 20  : " );
        int n = scanner.nextInt();
        for (int i=0; i<=n; i++){
            
           System.out.println("Les nombre sont " + i);
           }
   }


    }

