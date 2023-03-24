package control;
import model.Inkomst;
import model.Utgift;
import view.View;
import java.util.ArrayList;

public class Controller {
    private View ui;
    private InkomstManager inkomstManager;
    private UtgiftManager utgiftManager;
    private Inkomst inkomst;
    private Utgift utgift;

    public Controller(){
        ui = new View(this);
        inkomstManager = new InkomstManager();
        utgiftManager = new UtgiftManager();
        menu();
    }

    public void menu(){

        int choice=0;

        do{

            ui.menu();

            switch(choice = ui.choice()){
                case 1:
                    ui.addIncome();
                    break;
                case 2:
                    ui.addExpense();
                    break;
                case 3:
                    showIncome();
                    ui.changeIncome();
                    break;
                case 4:
                    showExpense();
                    ui.changeExpense();
                    break;
                case 5:
                    showIncome();
                    ui.removeIncome();
                    break;
                case 6:
                    showExpense();
                    ui.removeExpense();
                    break;
                case 7:
                    showIncome();
                    break;
                case 8:
                    showExpense();
                    break;
                case 0:
                    break;
                default:
                    ui.newMessage("FUNKAR INTE");
            }

        }while(choice!=0);

    }

    public void addIncome(String income, int sum){
        inkomst = new Inkomst(income, sum);
        inkomstManager.add(inkomst);
    }
    public void addExpense(String type, int sum){
        utgift = new Utgift(type, sum);
        utgiftManager.add(utgift);
    }

    public void showIncome(){
        String[] incomes = inkomstManager.getInfoString();
        int total = inkomstManager.getTotal();
        ui.showIncome(incomes, total);
    }

    public void showExpense(){
        String[] utgifter = utgiftManager.getInfoString();
        int total = utgiftManager.getTotal();
        ui.showExpense(utgifter, total);
    }

    public void changeIncome(int i, int sum){
        ArrayList<Inkomst> inkomst = inkomstManager.getList();
        inkomst.get(i).setAmount(sum);
    }

    public void changeExpense(int i, int sum){
        ArrayList<Utgift> utgift = utgiftManager.getList();
        utgift.get(i).setPrice(sum);
    }
    public void removeIncome(int i){
        inkomstManager.remove(i);

    }
    public void removeExpense(int i){
        utgiftManager.remove(i);
    }

}
