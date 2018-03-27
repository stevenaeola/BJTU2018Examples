import java.util.*;

public class ScannerUI
{
    private int x;

    public int getIntFromKeyboard() throws ExitFromMenuException{
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        while(!found){
            System.out.println("Please enter a number");
            if(sc.hasNextInt()){
                x = sc.nextInt();
                found = true;
            }
            else{
                String token = sc.next();
                if(token.equals("exit")){
                    throw new ExitFromMenuException();
                }
            }
        }

        return x;
    }

    public int menuChoice() throws ExitFromMenuException{
        System.out.println("1 Go to sleep");
        System.out.println("2 Wake up");
        System.out.println("3 Eat");
        int choice = getIntFromKeyboard();

        return choice;
    }

    public void menu() throws ExitFromMenuException{
        while(true){
            int choice = menuChoice();

            switch(choice){
                case 1: System.out.println("zzzzzzzzzzzzz");
                break;
                case 2:
                System.out.println("Yawn");
                break;

                case 3:
                System.out.println("Yum");
                break;

            }
        }
    }

    public static void main(String[] args){
        int tries = 0;
        if(args.length == 2){
            System.out.println(args[0]);
            System.out.println(args[1]);
        }

        ScannerUI sui = new ScannerUI();
        while(true){
            try{
                while(true){

                    sui.menu();

                }
            }
            catch(ExitFromMenuException e){
                tries ++;
                System.out.println("You have exited " + tries + " times");
                System.out.println("Could save or load here");
                
            }
        }
    }
}
