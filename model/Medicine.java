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
	/**
	*this method is the constructor of the class.<br>
	*@param name the name of the medicine.<br>
	*@param dose the dose of the medicine.<br>
	*@param frequency the frequency of the medicine.<br>
	*/
	public Medicine(String name, double dose, int frequency){
		this.name = name;
		this.dose = dose;
		this.frequency = frequency;
	}
	/**
	*this method ask for the name of the medicine.<br>
	*<b>pre:</b> the medicine is prescribed for the pet.<br>
	*@return name name of each medicine.<br>
	*/
	public String  getName(){
		return name;
	}
	/**
	*this method assign a new name.<br>
	*<b>pos:</b> the name is assigned to a medicine in the system.<br>
	*@param newName has the name of the a medicine.<br>
	*/
	public void setName(String newName){
		name = newName;
	}
	/**
	*this method ask for the dose of the medicine.<br>
	*<b>pre:</b> the medicine is prescribed for the pet.<br>
	*@return dose dose of each medicine.<br>
	*/
	public double getDose(){
		return dose;
	}
	/**
	*this method assign a new dose.<br>
	*<b>pos:</b> the dose is assigned to a medicine in the system.<br>
	*@param newDose has the dose of the a medicine.<br>
	*/
	public void setDose(double newDose){
		dose = newDose;
	}
	/**
	*this method ask for the frequency of the medicine.<br>
	*<b>pre:</b> the medicine is prescribed for the pet.<br>
	*@return frequency frequency of each service.<br>
	*/
	public int getFrequency(){
		return frequency;
	}
	/**
	*this method assign a new frequency.<br>
	*<b>pos:</b> the frequency is assigned to a medicine in the system.<br>
	*@param newFrequency has the frequency of the a medicine.<br>
	*/
	public void setFrequency(int newFrequency){
		frequency = newFrequency;
	}
}