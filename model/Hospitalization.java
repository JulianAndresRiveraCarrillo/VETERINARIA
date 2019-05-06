package model;
/**
*this class has the information of the hospitalization of a pet.<br>
*UNIVERSIDAD ICESI<br>
*Author: JULIAN ANDRES RIVERA CARRILLO<br>
*SYSTEM ENGINEER<br>
*/
public class Hospitalization{
	//atributos
	private int rooms;
	//relaciones
	private Pets pet; 
	private ClinicalHistory history;
	private Medicine medicina;
	//constructor
	/**
	*this method is the constructor of the class.<br>
	*@param rooms the rooms that has the veterinary.<br>
	*/
	public Hospitalization(int rooms){
		this.rooms = rooms;
	}
	/**
	*this method ask for the number of the rooms.<br>
	*@return the number of the room.<br>
	*/
	public int getRooms(){
		return rooms;
	}
	/**
	*this method change the number of the room or assign a number.<br>
	*<b>pos:</b> a numer is assigned to a room.<br>
	@param newRooms is the room assigned.<br>
	*/
	public void SetRooms(int newRooms){
		rooms = newRooms;
	}
	/**
	*this method has the function of calculate the cost of the hospitalization.<br>
	*<b>pre:</b> the status of the hospitalization is open.<br>
	*@param weight is the weight of the pet.<br>
	*@param type is the type of animal of the pet.<br>
	*@param day is the quantity of days that the pet is hospitalized.<br>
	@return the cost of the hospitalization.<br>
	*/
	public int calculateCost(double weight, char type, int day){
		int cost = 0;
		if(type == 'g'){
			if(weight > 1 && weight < 3){
				cost = 10000 * day;
			}else if (weight > 3.1 && weight < 10){
				cost = 12000 * day;
			}else if (weight > 10.1 && weight < 20){
				cost = 15000 * day;
			}else {
				cost = 20000 * day;
			}		
		}else if(type == 'p'){
			if(weight > 1 && weight < 3){
				cost = 15000 * day;
			}else if (weight > 3.1 && weight < 10){
				cost = 17000 * day;
			}else if (weight > 10.1 && weight < 20){
				cost = 20000 * day;
			}else {
				cost = 25000 * day;
			}		
		}else if(type == 'a'){
			if(weight > 1 && weight < 3){
				cost = 10000 * day;
			}else if (weight > 3.1 && weight < 10){
				cost = 12000 * day;
			}else if (weight > 10.1 && weight < 20){
				cost = 20000 * day;
			}else {
				cost = 25000 * day;
			}		
		}else {
		if(weight > 1 && weight < 3){
				cost = 10000 * day;
			}else if (weight > 3.1 && weight < 10){
				cost = 17000 * day;
			}
		}
		return cost;
	}
}