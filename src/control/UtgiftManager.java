package control;

import java.util.ArrayList;
import model.*;

public class UtgiftManager {

    private ArrayList<Utgift> list = new ArrayList<>();

    public UtgiftManager(){

    }

    public void add(Utgift utgift){
        list.add(utgift);
    }
    public void remove(int i){
        list.remove(i);
    }

    public String[] getInfoString(){
        String[] infoString = new String[list.size()];

        for(int i = 0; i<list.size();i++){
            infoString[i] = i + ". " + list.get(i).toString();
        }
        return infoString;
    }

    public int getTotal(){
        int total = 0;
        for(int i = 0; i < list.size();i++){
            total = total + list.get(i).getPrice();
        }
        return total;
    }

    public ArrayList<Utgift> getList(){
        return list;
    }

}
