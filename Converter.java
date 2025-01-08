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
            input.close();
        }
    }
}