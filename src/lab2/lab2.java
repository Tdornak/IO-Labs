package lab2;

import java.io.IOException;
import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        
        RecordRetriever rr = new RecordRetriever();
        Scanner keyboard = new Scanner(System.in);
                
        try {
            System.out.println("Enter a record number");
            rr.getRecord(keyboard.nextLine());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }
}
