import java.util.Scanner;
public class display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            Menu();
            System.out.println("Input your choice:(1-4) :");
            choice = sc.nextInt();
        }while(choice != 4);
        sc.close();
    }
}
