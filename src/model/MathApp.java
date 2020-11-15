package model;

import java.util.ArrayList;

public class MathApp{
	private int amount;
	private ArrayList<IntegerSet> sets;
	
	public MathApp(){
		sets = new ArrayList<IntegerSet>();
		amount = sets.size();
	}
	
	public void addSet(String name){
		IntegerSet newSet = new IntegerSet(name);
		sets.add(newSet);
	}
	
	public void removeSet(String name){
		for(int i = 0; i < sets.size(); i++){
			if(sets.get(i).getName().equals(name)) {
				sets.remove(i);
			}
		}
	}
	
	public void addElementToSet(String setName, int element){
		for(int i = 0; i < sets.size(); i++){
			if(sets.get(i).getName().equals(setName)) {
				sets.get(i).addElement(element);
			}
		}
	}
	
	public void removeElementFromSet(String setName, int element){
		
		for(int i = 0; i < sets.size(); i++){
			
			if(sets.get(i).getName().equals(setName)) {
				sets.get(i).removeElement(element);
			}
		
		}
	
	}
	
	public void union(String name1, String name2, String newName){
		
		for(int i = 0; i < sets.size(); i++){
			
			if(sets.get(i).getName().equals(name1)) {
				
				for(int j = 0; j < sets.size(); j++){
					
					if(sets.get(j).getName().equals(name2)) {
						
						sets.add(sets.get(i).union(sets.get(j), newName));
					
					}
				}	
			}
		}
	
	}
	
	public void difference(String name1, String name2, String newName){
		
		for(int i = 0; i < sets.size(); i++){
			
			if(sets.get(i).getName().equals(name1)) {
				
				for(int j = 0; j < sets.size(); j++){
					
					if(sets.get(j).getName().equals(name2)) {
						
						sets.add(sets.get(i).difference(sets.get(j), newName));
					
					}
				}	
			}
		}
	}
	
	public void intersection(String name1, String name2, String newName){
		
		for(int i = 0; i < sets.size(); i++){
			
			if(sets.get(i).getName().equals(name1)) {
				
				for(int j = 0; j < sets.size(); j++){
					
					if(sets.get(j).getName().equals(name2)) {
						
						sets.add(sets.get(i).intersection(sets.get(j), newName));
					
					}
				}	
			}
		}
	}
	
	public void simetryDifference(String name1, String name2, String newName){
		
		for(int i = 0; i < sets.size(); i++){
			
			if(sets.get(i).getName().equals(name1)) {
				
				for(int j = 0; j < sets.size(); j++){
					
					if(sets.get(j).getName().equals(name2)) {
						
						sets.add(sets.get(i).simetryDifference(sets.get(j), newName));
					
					}
				}	
			}
		}
		
	}
	
	public String showInfoSet(String name){
		
		String info = "";
		
		for(int i = 0; i < sets.size(); i++){
			
			if(sets.get(i).getName().equals(name)){
				info = sets.get(i).showContent();
			}
			
		}
		
		return info;
		
	}
	
	public String showInfoSets(){
		
		String info = ""; 
		
		for(int i = 0; i < sets.size(); i++){
			
			info += sets.get(i).showContent();
			
		}
		
		return info;
	}
	
}