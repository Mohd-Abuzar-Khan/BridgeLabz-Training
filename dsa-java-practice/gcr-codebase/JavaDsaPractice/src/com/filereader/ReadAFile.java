package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

	
	public static void main(String[] args) {

		System.out.println("Working Directory: " + System.getProperty("user.dir"));

        String filePath = "sample"; 

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();

        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}