package model; 
import java.util.*;
/**
*this class has the information of each pet.<br>
*UNIVERSIDAD ICESI<br>
*Author: JULIAN ANDRES RIVERA CARRILLO<br>
*SYSTEM ENGINEER<br>
*/
public class Pets {
	//Atributos
	public final static char PERRO = 'P';
	public final static char GATO = 'G';
	public final static char AVE = 'A';
	private String name;
	private int age;
	private double weight;
	private double height;
	private char type; 
	private String animalRace;
	//relaciones 
	private ArrayList<Services> servicios;
	private ClinicalHistory history;
	private Medicine medicina;
	//constructor
	/**
	*Description this method is the constructor of the class.<br>
	*@param name this attribute receives the function of the name of the object.<br>
	*@param age this attribute receives the function of the age of the object.<br>
	*@param weight this attibute receives the function of weight of the object.<br>
	*@param height this attribute receives the height of the pet.<br>
	*@param type this attribute receives the function of type of animal of the object.<br>
	*@param animalRace this attribute receives the function of the animal race that belongs to the object.<br>
	*/
	public Pets(String name, int age, double weight, double height, String animalRace, char type){

		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.type = type;
		this.animalRace = animalRace;
		servicios = new ArrayList<Services>();
	}
	/**
	*Description: This method has the function of asking for the name of the pet. <br>
	*@return the value that returns is the name of the pet.<br>
	*/	
	public String getName(){

	return name;
	}
	public void setName( String newName){
		/**
		*this method has the function of assigning a name to a certain pet. <br>
		*<b>pos:</b> a new name is assigned to the pet.<br>
		*@param newName this attribute receives the new name of the pet. <br>
		*/
		name = newName;
	}
	public int getAge(){
		/**
		*this method has the function of asking for the age of the pet.<br>
		*@return the value that returns is the age of the pet.<br>
		*/
		return age;
	}
	public void setAge( int newAge){
		/**
		*this method has the function of assigning the age of the pet.<br>
		*<b>pos:</b> a new age is assigned to the pet.<br>
		*@param age this atribute receives the age of the pet. <br>
		*/
		age = newAge;
	}
	public double getWeight(){
		/**
		*Description: this method has the function of asking for the weight of the pet.<br>
		*@return the value that returns is the weight of the pet.<br>
		*/
		return weight;
	}
	public void setWeight( double newWeight){
		/**
		*Description: this method has the function of assigning the weight of the pet.<br>
		*<b>pos:</b> a new weight is assigned to the pet. <br>
		*@param weight this atribute receives the new weight of the pet.<br>
		*/
		weight = newWeight;
	}
	public double getHeight(){
		/**
		*this method has the function of asking for the height of the pet.<br>
		*@return the value that returns is the height of the pet.<br>
		*/
		return height;
	}
	public void setHeight(double newHeight){
		/**
		*this method has the function of assigning the height of a pet.<br>
		*<b>pos:</b> a new height is assigned to the pet.<br>
		*@param newHeight receives the new height of the pet.<br>
		*/
		height = newHeight;
	}
	public String getAnimalRace(){
		/**
		*Description: this method has the function of asking for the symtoms of the pet.<br>
		*@return the value that returns is the pet race.<br>
		*/
		return animalRace;
	}
	public void setAnimalRace( String newAnimalRace){
		/**
		*Description: this method has the function of assigning the pet race.<br>
		*<b>pos:</b> the breed of the pet is known.<br>
		*@param animalRace this atribute receives the pet race.
		*/
		animalRace = newAnimalRace;
	}
	public double calculateIBM(){
		double ibm = 0.0; 
		ibm = (height*height)/weight;
		if(height == 0.0){
			ibm = -1.0;
		}
		return ibm;
	}
	public ClinicalHistory getHistory(){
		return history;
	}
}