import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by dwt800 on 2014/5/9 0009.
 */
public class Checker {
    private ArrayList<Integer> location;
    int NumOfGuess=0;
    public void SetNumber(ArrayList<Integer> a){
    location = a;
        System.out.println(location);
    }

    public String CheckM(Integer Num){
        String result = "miss";
           for(Integer loc:location){
           if (Num==loc){
                    result ="hit";
                    System.out.println(location);
                    System.out.println("猜中了一个");
                }

        }
        if (result=="hit") {
            location.remove(Num);
        }
        NumOfGuess++;
        return result;
    }
    public boolean Status(){
        boolean status= false;
        if (location.isEmpty()==true){
            status = true;
        }
        return status;
    }
    public int NumOfGuess(){
        return NumOfGuess;
    }

}
