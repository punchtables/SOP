package control;
import model.*;
import view.*;

import java.util.ArrayList;

public class InkomstManager {

    private ArrayList<Inkomst> list = new ArrayList<>();

    public InkomstManager(){}

    public void add(Inkomst inkomst){
        list.add(inkomst);
    }

    public void remove(int i){
        list.remove(i);
    }

    public String[] getInfoString(){
        String[] inkomster = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            inkomster[i] = i + ". " + list.get(i).toString();
        }
        return inkomster;
    }
    public int getTotal(){
        int total = 0;
        for(int i = 0; i < list.size();i++){
            total = total + list.get(i).getAmount();
        }
        return total;
    }

    public ArrayList<Inkomst> getList(){
        return list;
    }

}
