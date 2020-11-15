package ui;

import java.util.Scanner;
import model.*;

public class Menu{
	
	private Scanner in;  //numbers
	private Scanner sc;  //text
	private MathApp set;
	
	public Menu(){
		
		in = new Scanner(System.in);
		sc = new Scanner(System.in);
		set = new MathApp();
		
	}
	
	public void addSet(){
		
		System.out.print("Nombre del conjunto: ");
		String name = sc.nextLine();
		
		set.addSet(name);
	}
	
	public void removeSet(){
		System.out.println("Escriba el nombre del conjunto que desea eliminar");
		System.out.print("Nombre: ");
		String name = sc.nextLine();
		
		set.removeSet(name);
	}
	
	public void addElementToSet(){
		int cont = 0;
		int element = 0;
		String name = "";
		
		System.out.println("Digite el nombre del conjunto");
		System.out.print("Nombre: ");
		name = sc.nextLine();
		
		System.out.println("¿Cuantos elementos desea agregar?");
		cont = in.nextInt();
		
		System.out.println("Digite los elementos");
		
		while(cont > 0){
			
			System.out.print("Elemento: ");
			element = in.nextInt();
			set.addElementToSet(name, element);
			cont--;
		}
		
	}
	
	public void removeElementFromSet(){
		
		System.out.println("Digite el nombre del conjunto");
		System.out.print("Nombre: ");
		String name = sc.nextLine();
		System.out.println("Digite el elemento que desea eliminar");
		System.out.print("Numero: ");
		int element = in.nextInt();
		
		set.removeElementFromSet(name,element);
	}
	
	public void union(){
		
		System.out.println("Digite el nombre del primer conjunto");
		System.out.print("Nombre: ");
		String name1 = sc.nextLine();
		System.out.println("Digite el nombre del primer conjunto");
		System.out.print("Nombre: ");
		String name2 = sc.nextLine();
		System.out.println("Digite el nombre del el conjunto union");
		String newName = sc.nextLine();
		
		set.union(name1, name2, newName);
	}
	
	public void difference(){
		
		System.out.println("Digite el nombre del primer conjunto");
		System.out.print("Nombre: ");
		String name1 = sc.nextLine();
		System.out.println("Digite el nombre del segundo conjunto");
		System.out.print("Nombre: ");
		String name2 = sc.nextLine();
		System.out.println("Digite el nombre del el conjunto diferencia");
		String newName = sc.nextLine();
		
		set.difference(name1, name2, newName);
	}
	
	public void intersection(){
		
		System.out.println("Digite el nombre del primer conjunto");
		System.out.print("Nombre: ");
		String name1 = sc.nextLine();
		System.out.println("Digite el nombre del segundo conjunto");
		System.out.print("Nombre: ");
		String name2 = sc.nextLine();
		System.out.println("Digite el nombre del el conjunto interseccion");
		String newName = sc.nextLine();
		
		set.intersection(name1, name2, newName);
	}
	
	public void simetryDifference(){
		
		System.out.println("Digite el nombre del primer conjunto");
		System.out.print("Nombre: ");
		String name1 = sc.nextLine();
		System.out.println("Digite el nombre del segundo conjunto");
		System.out.print("Nombre: ");
		String name2 = sc.nextLine();
		System.out.println("Digite el nombre del el conjunto diferencia simetrica");
		String newName = sc.nextLine();
		
		set.simetryDifference(name1, name2, newName);
		
	}
	
	public void showInfoSet(){
		
		System.out.println("Digite el nombre del conjunto");
		System.out.print("Nombre: ");
		String name = sc.nextLine();
		
		System.out.print("");
		System.out.println(set.showInfoSet(name));
	}
	
	public void showInfoSets(){
		
		System.out.print("");
		System.out.println(set.showInfoSets());
		
	}
	
	public void startProgram(){
		
		int option = 0; 
		int cont = 0;
		
		while(option != 11){
			System.out.println("");
			System.out.println("Selecciona una opcion");
			System.out.println("1. Agregar nuevo conjunto.");
			
			if(cont > 0){
				System.out.println("2. Eliminar conjunto.\n" + "3. Agregar elemento a conjunto.\n" + 
				"4. Eliminar elemento de conjunto.");
			}
			
			if(cont > 1){
				System.out.println("5. Unir conjuntos.\n" + "6. Diferencia de conjuntos.\n" 
				+ "7. Diferencia simetrica de conjuntos.\n" + "8. Interseccion de conjuntos.\n" 
				+ "9. Buscar y mostrar informacion de un conjunto.\n" 
				+ "10. Mostrar informacion de todos los conjuntos.\n" + "11.Salir del programa.");
			}
			
			option = in.nextInt();
			
			switch(option){
				
				case 1:
					
					addSet();
					
				break;
				
				case 2:
				
					removeSet();
				
				break;
				
				case 3:
				
					addElementToSet();
				
				break;
				
				case 4:
				
					removeElementFromSet();
				
				break;
				
				case 5:
				
					union();
				
				break;
				
				case 6:
					
					difference();
					
				break;
				
				case 7:
				
					simetryDifference();
				
				break;
				
				case 8:
				
					intersection();
				
				break;
				
				case 9:
				
					showInfoSet();
				
				break;
				
				case 10:
				
					showInfoSets();
				
				break;
				
				case 11:
				
					System.out.println("Gracias por usar nuestro programa.");
				
				break;
			
				default:
					System.out.println("Selecciona una de las opciones disponibles, por favor.");
				break;
			}
			
			if(option == 1){
				cont++;
			}
		}
	}
	
}