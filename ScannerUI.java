import java.util.*;

public class ScannerUI
{
    private int x;

    public int getIntFromKeyboard(){
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        while(!found){
            System.out.println("Please enter a number");
            if(sc.hasNextInt()){
                x = sc.nextInt();
                found = true;
            }
            else{
                sc.next();
            }
        }

        return x;
    }

    public void menu(){
        while(true){
            System.out.println("1 Go to sleep");
            System.out.println("2 Wake up");
            System.out.println("3 Eat");
            System.out.println("4 Exit");

            int choice = getIntFromKeyboard();

            switch(choice){
                case 1: System.out.println("zzzzzzzzzzzzz");
                break;
                case 2:
                System.out.println("Yawn");
                break;

                case 3:
                System.out.println("Yum");
                break;

                case 4:
                return;

            }
        }
    }
}
