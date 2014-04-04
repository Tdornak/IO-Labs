package lab3;

import java.io.IOException;
import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {
        
        RecordReader rr = new RecordReader();
        Scanner keyboard = new Scanner(System.in);
                
        try {
            System.out.println("Enter a record number");
            System.out.println(rr.getCity(keyboard.nextLine()));
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }
}
