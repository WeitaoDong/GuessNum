import java.util.ArrayList;

/**
 * Created by dwt800 on 2014/5/9 0009.
 */
public class Main {
    public static void main(String[] args) {
        SetNum a = new SetNum();
        Checker b = new Checker();
        Input c =new Input();
        b.SetNumber( a.SetNum());

        while (!b.Status()==true){
            c.UserInput();
             if(b.CheckM(c.UserInput())=="hit"){
                System.out.println(b.NumOfGuess);
                if(b.Status()==true){
                System.out.println("You have guess all the numbers, and your scores is"+ b.NumOfGuess);
                    break;
                }

            }else {
                 System.out.println("你没猜对啊");
             }


        }

    }
}
