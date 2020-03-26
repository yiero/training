package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class SymptomsReader {
	
	public Integer nombreDeSymptomes;
 	 							
			Map<String, Integer> hm = new HashMap<>();			//déclarer une hashmap
	
	public void afficherLigne (String line) {
			nombreDeSymptomes++;
		System.out.println(line); 			
		}	
	
	public void countSymptoms (String line) {  //intéragir avec hashmap
		// TODO Auto-generated method stub
		
	}
	
	public SymptomsReader() {
		nombreDeSymptomes = 0;
	}
}
