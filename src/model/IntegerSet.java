package model;

import java.util.ArrayList;

public class IntegerSet{
	
	private String name;
	private int cardinality;
	private ArrayList<Integer> elements;
	
	public IntegerSet(String name){
		this.name = name;
		elements = new ArrayList<Integer>();
		cardinality = elements.size();
	}
	
	public String getName(){
		return name;
	}
	
	public int getCardinaly(){
		cardinality = elements.size();
		return cardinality;
	}
	
	public ArrayList<Integer> getElements(){
		return elements;
	}
	
	public void setElements(ArrayList elements){
		this.elements = elements;
	}
	
	public void addElement(int element){
		
		int cont = 0;
		
		for(int i = 0; i < elements.size(); i++){
			if((int)elements.get(i) == element){
				cont++;
			}
		}
		
		if(cont == 0){
			elements.add(element);
		}
	}
	
	public void removeElement(int element){
		
		elements.remove(Integer.valueOf(element));
	
	}
	
	public IntegerSet union(IntegerSet set, String newName){
		
		IntegerSet newIntegerSet = new IntegerSet(newName);
		int cont = 0;
		
		//First assigment
		newIntegerSet.getElements().addAll(elements);
		newIntegerSet.getElements().addAll(set.getElements());
		
		//Second assigment
		
		for(int i = 0; i < newIntegerSet.getElements().size(); i++){
			
			cont = 0;
			
			for(int j = 0 ; j < newIntegerSet.getElements().size(); j++){
				
				if(newIntegerSet.getElements().get(i).equals(newIntegerSet.getElements().get(j))){
					cont++;
				}
				
				if(cont > 1){
					newIntegerSet.getElements().remove(j);
					cont--;
				}
				
			}	
		}	
		
		return newIntegerSet;
	}
	
	public IntegerSet difference(IntegerSet set, String newName){
		
		IntegerSet newDifference = new IntegerSet(newName);
		
		int cont = 0;
		
		//First assigment
		
		for(int i = 0; i < elements.size() ; i++){
			
			cont = 0;
			
			for(int j = 0 ; j < set.getElements().size(); j++){
				
				if(!elements.get(i).equals(set.getElements().get(j))){
					cont++;
				}
				
				if(cont == set.getElements().size()){
					newDifference.addElement(elements.get(i));
				}
			}	
		}
		
		return newDifference;
	}
	
	public IntegerSet intersection(IntegerSet set, String newName){
		
		IntegerSet newIntersection = new IntegerSet(newName);
	
		//First assigment
		
		for(int i = 0; i < elements.size() ; i++){
			
			for(int j = 0 ; j < set.getElements().size(); j++){
				
				if(elements.get(i).equals(set.getElements().get(j))){
					newIntersection.addElement(elements.get(i));
				}
			
			}	
		}
		
		return newIntersection;
		
	}
	
	public IntegerSet simetryDifference(IntegerSet set, String newName){
		
		IntegerSet newIntegerSet = new IntegerSet(newName);
	
		int cont = 0;
		
		for(int i = 0; i < elements.size() ; i++){
			
			cont = 0;
			
			for(int j = 0 ; j < set.getElements().size(); j++){
				
				if(!elements.get(i).equals(set.getElements().get(j))){
					cont++;
				}
				
				if(cont == set.getElements().size()){
					newIntegerSet.addElement(elements.get(i));
				}
			}	
		}
		
		for(int i = 0; i < set.getElements().size(); i++){
			
			cont = 0;
			
			for(int j = 0 ; j < elements.size(); j++){
				
				if(!set.getElements().get(i).equals(elements.get(j))){
					cont++;
				}
				
				if(cont == elements.size()){
					newIntegerSet.addElement(set.getElements().get(i));
				}
			}	
		}
		
		return newIntegerSet;
	}
	
	private String values(){
		String message = "";
		
		for(int i = 0 ; i < elements.size() ; i++){
			message += elements.get(i) + ", ";
		}
		
		if(message.length() >= 3){
			message = "{" + message.substring(0, message.length() - 2) + "}";
		}
		
		return message;
	}	
	
	public String showContent(){
		String message = "";
		
		message += "*************Conjunto***********" + "\n";
		message += "Nombre: " + name + "\n";
		message += "Elementos: " + getCardinaly() + "\n";
		message += "Valores: " + values() + "\n\n";
		
		
		return message;
	}
}