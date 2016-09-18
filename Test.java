package com.crackingthecoding;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable htable = new Hashtable();
		
		htable.put("renu","joshi");//insertion TO DO
		htable.put("amogh","antarkar"); //insert TO DO
		htable.put("kiru","joshi"); //insert
		
		//testing purposes
		ArrayList<String> aList = new ArrayList<String>(){
			{
				add("pappa");
				add("renu");
				add("mothiaai");
			}
			
		};
		System.out.println("list:"+aList.toString());
//		cntl+/ - comment
//		
		for(String key: aList){
			boolean isPresent = htable.contains(key); //TO DO - 
			System.out.println("key:"+key+" present status ="+isPresent);
			if(isPresent){
				System.out.println("key:"+key+" value: "+htable.get(key)); // TO DO - retrieval
			}
		}
		
	}

}
