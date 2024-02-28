import java.util.Scanner;

public class BankingTask {
    
    public static void main(String[] args) {
        int acno=12345;
        int amt=0;
        int blncamt=500;

        while (true) {

            System.out.println("enter the account number");
            Scanner sc1=new Scanner(System.in);
            int acntno=sc1.nextInt();
            
            if (acno==acntno) {
                
            System.out.println("for deposit enter number : 1");
            System.out.println("for withdraw enter number : 2");
            System.out.println("for check balance enter number : 3");
            System.out.println(" pls enter the choice");
           
            Scanner sc=new Scanner(System.in);
             int choice=sc.nextInt();
            
            switch (choice) {
                case 1:
                System.out.println("enter the deposit ammount");
                Scanner sc2=new Scanner(System.in);
             int depoamt=sc2.nextInt();
                blncamt=amt+depoamt;
                System.out.println("Balance Ammount" + blncamt);
                 break;
            
                 case 2:
                 System.out.println("enter the withdraw ammount");
                 Scanner sc3=new Scanner(System.in);
                   int withdrawamt=sc3.nextInt();
                  if (blncamt>withdrawamt) {
                    
                   blncamt=blncamt-withdrawamt;
                    System.out.println("Balance Ammount" + blncamt);
                  }
                  else{
                    System.out.println("*******insufficient balance******");
                  }
                 break;

                 case 3:
                 System.out.println("balance is "+ blncamt);
                 break;

                default:System.out.println("========invalid========");
                    break;
            }
        } 
        else{
            System.out.println("--------invalid account number--------");
        }

        System.out.println(" ======= Thank you =======");
        }
    }
}
