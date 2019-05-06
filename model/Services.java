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
	/**
	*this method is the constructor of the class.<br>
	*@param name the name of the service.<br>
	*@param price the price of the service.<br>
	*/
	public Services(String name, String price){
		this.name = name;
		this.price = price;
	}
	/**
	*this method ask for the name of the service.<br>
	*<b>pre:</b> the service is available in the veterinary.<br>
	*@return name name of each service.<br>
	*/
	public String getName(){
		return name;
	}
	/**
	*this method ask for the price of a service.<br>
	*<b>pre:</b> the service is available in the veterinary.<br>
	*@return price of each service.<br>
	*/
	public String getPrice(){
		return price;
	}
		/**
		*this method assign a new name.<br>
		*<b>pos:</b> the name is assigned to a service in the system.<br>
		*@param newName has the name of the a service.<br>
		*/
	public void setName(String newName){
		name = newName;
	}
	/**
	*this method assign a new price for a service.<br>
	*<b>pos:</b> the price is assigned to a service in the system.<br>
	*@param newPrice has the price of the a service.<br>
	*/
	public void setPrice(String newPrice){
		price = newPrice;
	}
}