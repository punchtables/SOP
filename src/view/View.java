package view;

import java.util.Scanner;
import control.*;

public class View {

    private Controller controller;

    public View(Controller controller){
       this.controller=controller;
    }


    public void menu(){
        System.out.println("Alternativ: ");
        System.out.println();
        System.out.println("1. Lägg till inkomst");
        System.out.println("2. Lägg till utgift");
        System.out.println("3. Ändra inkomst");
        System.out.println("4. Ändra utgift");
        System.out.println("5. Ta bort inkomst");
        System.out.println("6. Ta bort utgift");
        System.out.println("7. Visa alla inkomster: ");
        System.out.println("8. Visa alla utgifter: ");
        System.out.println("0. AVSLUTA");
        System.out.println();
    }

    public int choice(){
        System.out.println("Gör ett menyval: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        return choice;
    }

    public void newMessage(String mm){
        System.out.println(mm);
    }

    public void addIncome(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ange typ av inkomst:");
        String income = input.nextLine();
        System.out.println("Ange summa: ");
        int sum = input.nextInt();
        controller.addIncome(income, sum);
    }

    public void addExpense(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ange typ av utgift:");
        String income = input.nextLine();
        System.out.println("Ange summa: ");
        int sum = input.nextInt();
        controller.addExpense(income, sum);
    }

    public void showIncome(String[] list, int total){
        System.out.println("Inkomster: ");
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println("Total kostnad: " + total);
    }

    public void showExpense(String[] list, int total){
        System.out.println("Utgifter: ");
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println("Totala utgifter: " + total);
    }

    public void changeIncome(){
        Scanner input = new Scanner(System.in);
        System.out.println("Vilken inkomst vill du ändra? (Ange ental): ");
        int choice = input.nextInt();
        System.out.println("Ange ny summa: ");
        int sum = input.nextInt();
        controller.changeIncome(choice, sum);
    }
    public void changeExpense(){
        Scanner input = new Scanner(System.in);
        System.out.println("Vilken utgifter vill du ändra? (Ange ental): ");
        int choice = input.nextInt();
        System.out.println("Ange ny summa: ");
        int sum = input.nextInt();
        controller.changeExpense(choice, sum);
    }

    public void removeIncome(){
        Scanner input = new Scanner(System.in);
        System.out.println("Vilken inkomst vill du ta bort? (Ange heltal): ");
        int choice = input.nextInt();
        controller.removeIncome(choice);
    }

    public void removeExpense(){
        Scanner input = new Scanner(System.in);
        System.out.println("Vilken utgift vill du ta bort? (Ange heltal): ");
        int choice = input.nextInt();
        controller.removeExpense(choice);
    }

}
