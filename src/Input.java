import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by dwt800 on 2014/5/9 0009.
 */
public class Input {
            public Integer UserInput(){

System.out.println("快点猜个数！");
            Scanner is = new Scanner((System.in));
            Integer inputLine = is.nextInt();

        return inputLine;
    }
}
