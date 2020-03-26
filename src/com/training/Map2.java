package com.training;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;



public class Map2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
	
		try {
			FileReader fileReader = new FileReader("symptoms.txt");
			//System.out.println(fileReader.getAbsolutePath());
			reader = new BufferedReader(fileReader);
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		SymptomsReader monObjet = new SymptomsReader();
		
		String line; 
		line = reader.readLine();
		
		while (line != null) {			
												
			monObjet.afficherLigne(line);
			line = reader.readLine();
		}
		reader.close();	
		
		System.out.println(monObjet.nombreDeSymptomes);
		
		FileWriter writer = new FileWriter ("result.out");
			writer.write("Nombres de symptomes " + monObjet.nombreDeSymptomes);
			writer.close();
	}	
}
 // declaration String maString
// affectation maString = xxx
// instanciation new String()
	
		
	


