package model;
/**
*this class has the information of each medicine for the pet.<br>
*UNIVERSIDAD ICESI<br>
*Author: JULIAN ANDRES RIVERA CARRILLO<br>
*SYSTEM ENGINEER<br>
*/
public class Medicine{
	//atributos 
	private String name;
	private double dose;
	private int frequency;
	//relaciones 
	//constructor
	public Medicine(String name, double dose, int frequency){
		this.name = name;
		this.dose = dose;
		this.frequency = frequency;
	}
	public String  getName(){
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public double getDose(){
		return dose;
	}
	public void setDose(double newDose){
		dose = newDose;
	}
	public int getFrequency(){
		return frequency;
	}
	public void setFrequency(int newFrequency){
		frequency = newFrequency;
	}
}