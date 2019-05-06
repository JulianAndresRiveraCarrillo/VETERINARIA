package model;
/**
*this class has the information of each service of the veterinary.<br>
*UNIVERSIDAD ICESI<br>
*Author: JULIAN ANDRES RIVERA CARRILLO<br>
*SYSTEM ENGINEER<br>
*/
public class Services{
	//atributos
	private String name;
	private String price;
	//constructor
	public Services(String name, String price){
		this.name = name;
		this.price = price;
	}
	public String getName(){
		return name;
	}
	public String getPrice(){
		return price;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setPrice(String newPrice){
		price = newPrice;
	}
}