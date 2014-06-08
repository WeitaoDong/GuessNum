import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dwt800 on 2014/5/9 0009.
 */
public class SetNum {
    int n;
    public ArrayList SetNum(){
    ArrayList<Integer> Num = new ArrayList(3);
        for (int n=0;n<3;n++) {
     Num.add((int)(Math.random()*10));
            System.out.println(Num);
        }
        return Num;
    }
}
