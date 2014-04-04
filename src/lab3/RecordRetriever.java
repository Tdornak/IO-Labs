package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecordRetriever {

    private int recordEnd = 0;
    
    //the line number the city is on in each record
    private int CITY_NUM = 3;
    
    private final int RECORD_SIZE = 8;
    private final String NO_VALUE_ENTERED = "A value must be entered";
    private final String NOT_AN_INTEGER = "Must be an Integer";
    private final String MAX_RECORDS = "We only have 4 records";
    private final String GREATER_THAN_ZERO = "Must be greater than 0";
    
    List<String> myList = new ArrayList<String>();
    
    File file = new File(File.separatorChar + "I:" + File.separatorChar +
                "Advanced Java" + File.separatorChar + "ExamplesAndLabs" + 
                    File.separatorChar + "IOFiles" + File.separatorChar +
                        "lab2.txt");
    
    public List getRecord(String recordNo) throws IOException, IllegalArgumentException {
        if (recordNo == null || recordNo.isEmpty()) {
            throw new IllegalArgumentException(NO_VALUE_ENTERED);
        } if (!isInteger(recordNo)) {
            throw new IllegalArgumentException(NOT_AN_INTEGER);
        }
        
        BufferedReader in = new BufferedReader(new FileReader(file));
        
        String line = in.readLine();
        int recordStart = findRecordStart(Integer.parseInt(recordNo));
        int count = 0;
        while (line != null) {
            if (count >= recordStart && recordStart < recordEnd) {
                myList.add(line);
                recordStart++;
            }  
            line = in.readLine();
            count++;
        }
        in.close();
        
        if (myList.size() < RECORD_SIZE) {
            throw new IllegalArgumentException(MAX_RECORDS);
        }
        
        return myList;
        
    }
    
    public String getCity(String recordNo) throws IOException {
        List<String> record = this.getRecord(recordNo); // this method should perform all the validation needed
        
        return record.get(CITY_NUM);
    }
    
    
    //finds the start of the record by multipling the record start by the size of each record
    private int findRecordStart(int recordNo) {
        if (recordNo < 0) {
            throw new IllegalArgumentException(GREATER_THAN_ZERO);
        }
        this.setRecordEnd(recordNo);
        return recordNo * RECORD_SIZE;
    }
    
   
    //Sets the end of the record to "Record_size" after the start of the record
    private void setRecordEnd(int recordNo) {
        if (recordNo < 0) { 
            throw new IllegalArgumentException(GREATER_THAN_ZERO);
        }
        recordEnd = (recordNo * RECORD_SIZE + RECORD_SIZE);  
    }
    
    
    //returns "true" if the value entered by the user is an integer
    private boolean isInteger(String recordNo) {
        try {
            Integer.parseInt(recordNo);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
