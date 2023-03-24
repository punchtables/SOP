import java.util.Scanner;

public class View {


    public void menu(){
        System.out.println("Alternativ: ");
        System.out.println();
    }

    public int choice(){
        System.out.println("Gör ett menyval: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        return choice;
    }

}
