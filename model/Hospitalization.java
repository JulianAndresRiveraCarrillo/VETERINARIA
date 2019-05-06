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
	public Hospitalization(int rooms){
		this.rooms = rooms;
	}
	public int getRooms(){
		return rooms;
	}
	public void SetRooms(int newRooms){
		rooms = newRooms;
	}
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