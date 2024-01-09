import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔════════════════════════╗");
        System.out.println("║  Welcome to Snack Bar  ║");
        System.out.println("║       Menu             ║");
        System.out.println("╠════════════════════════╣");
        System.out.println("║ Code  | Food           | Price");
        System.out.println("╠════════════════════════╣");
        System.out.println("║   1   | Hot dog        | U$4.00");
        System.out.println("║   2   | Hamburger      | U$4.50");
        System.out.println("║   3   | French Fries   | U$3.00");
        System.out.println("║   4   | Toast          | U$2.00");
        System.out.println("║   5   | Coke           | U$1.50");
        System.out.println("╚════════════════════════╝");
        System.out.print("Please enter the code of your order:");
        int code = sc.nextInt();
        System.out.print("Please how many quantities do you want:");
        int qtt  = sc.nextInt();
        double total;

            if(code == 1){
                total = qtt * 4;

            }else if (code == 2){
                total = qtt * 4.50;

            }else if (code == 3){
                total = qtt * 3;

            }else if (code == 4){
                total = qtt * 2;

            }else{
                total = qtt * 1.50;
            }

            System.out.printf("The bill is %.2f dollars", total);

            sc.close();


    }
}