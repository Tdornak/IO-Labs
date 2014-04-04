package lab2;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        
        RecordReader rr = new RecordReader();
        Scanner keyboard = new Scanner(System.in);
        List<String> record; 
        
        try {
            System.out.println("Enter a record number");
            record = rr.getRecord(keyboard.nextLine());
            for (String s : record) {
                System.out.println(s);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }
}
