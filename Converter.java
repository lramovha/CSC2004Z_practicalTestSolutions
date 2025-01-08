import java.util.*;
import java.io.*;

public class Converter {
    public static void main(String [] args){
        System.out.println("Enter a time or 'quit':");
        Scanner input = new Scanner(System.in);
        String time = input.nextLine();

        if (input.equals("quit")){
            System.out.println("done");
            System.exit(0);
        }
        else{
            System.out.println(time);
            String timeParts [] = time.split(":");
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);

            System.out.println(hours);
            System.out.println(minutes);
            input.close();
        }
    }
}