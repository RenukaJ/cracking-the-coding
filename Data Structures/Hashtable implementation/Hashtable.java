/*
 * @author Renuka Joshi
 */
package com.crackingthecoding;

//hashtable
//array - stores hashcode of the key
//linkedlist - stores <k,v> pair in each node
//
//key should be passed to hashcode generator function and then it should be processed to fit into the indices of an array
//after that, element should be inserted in the linked list connected to that particular index of an array
import java.util.ArrayList;
import java.util.LinkedList;

public class Hashtable {
	
	private String key;
	private String value;
	ArrayList<LinkedList<Node>> hashtable = new ArrayList <>(10);
	Hashtable(){
		for(int j=0;j<10;j++)
			hashtable.add(null);
	}
	
	public void put(String key, String value){
		//calculate hashcode for key
		
		int hashCode= hashCodeGenerator(key);// 1
		Node node = new Node(key,value);//renu, joshi
		LinkedList<Node> linkedList = new LinkedList<Node>();
		linkedList.add(node);
		hashtable.add(hashCode-1,linkedList);
		
	}
	
	public int hashCodeGenerator(String key){
		int hashCode=-1; 
		hashCode = key.length()%10;
		return hashCode;  // index of arrayList
	}
	
	public boolean contains(String key){
		int hashCode= hashCodeGenerator(key);
		// get linkedlist at arraylist(hashcode)
		//traverse the linkedlist searching for thekey.
		// if key is present return true, else retrun false.
		
		LinkedList<Node> dummyList = hashtable.get(hashCode);
		if(dummyList==null){
			return false;
		}
		//iterate through linkedlist
		for(int i=0; i<dummyList.size(); i++){
			
			if(dummyList.get(i).key.equals(key)){
				return true;
			}
			
		}
		return false;
	}
	
	public String get(String key){
		int hashCode= hashCodeGenerator(key);
		LinkedList<Node> retrieveList = hashtable.get(hashCode);
		if(retrieveList==null)
			return null;
		for(int i=0; i<retrieveList.size(); i++){
			if(retrieveList.get(i).key.equals(key)){
				return retrieveList.get(i).value;
			}
		}
		return null;
	}
}

class Node{
	String key ="";
	String value ="";
	Node(String key,String value){
		this.key =key;
		this.value=value;
	}
}
