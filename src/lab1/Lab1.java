package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Lab1 {

    public static void main(String[] args) throws IOException {
        Lab1 lab = new Lab1();
        //lab.q1();
        //lab.q2();
        lab.q3();
    }
    
    public void q1() throws IOException { 
        
        File file = new File(File.separatorChar + "E:" + File.separatorChar +
                "Advanced Java" + File.separatorChar + "ExamplesAndLabs" + 
                    File.separatorChar + "IOFiles" + File.separatorChar +
                        "lab1.txt");
        List<String> myList = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader(file));
        
        String line = in.readLine();
        while (line != null) {
            myList.add(line);
            line = in.readLine();
        }
        in.close();
        for (String s : myList) {
            System.out.println(s);
        }
    }
    
    public void q2() throws IOException {
    
        File file = new File(File.separatorChar + "E:" + File.separatorChar +
                "Advanced Java" + File.separatorChar + "ExamplesAndLabs" + 
                    File.separatorChar + "IOFiles" + File.separatorChar +
                        "lab1.txt");
        List<String> myList = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader(file));
        
        String line = in.readLine();
        int count = 1;
        while (line != null) {
            if (count > 8 && count <= 16) {
                myList.add(line);
            }  
            line = in.readLine();
            count++;
        }
        in.close();
        for (String s : myList) {
            System.out.println(s);
        }
        
    }
    
    
    public void q3() throws IOException {
        
        boolean append = true;
        
        File file = new File(File.separatorChar + "E:" + File.separatorChar +
                "Advanced Java" + File.separatorChar + "ExamplesAndLabs" + 
                    File.separatorChar + "IOFiles" + File.separatorChar +
                        "lab1.txt");
        
        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(file, append)));
        
        out.println();
        out.print("Phil\n");
        out.print("Philups\n");
        out.print("312 Phils house\n");
        out.print("philadelphia\n");
        out.print("WI\n");
        out.print("13254\n");
        out.print("Phil@gmail.com\n");
        out.print("745-3261\n");
        
        out.close();
        
        List<String> myList = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader(file));
        
        String line = in.readLine();
        while (line != null) {
            myList.add(line);
            line = in.readLine();
        }
        in.close();
        for (String s : myList) {
            System.out.println(s);
        }
        
    }
}
