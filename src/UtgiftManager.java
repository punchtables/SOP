import java.util.ArrayList;

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

        for(int i = 0; i<list.size();){
            infoString[i] = list.get(i).toString();
        }
        return infoString;
    }

}
