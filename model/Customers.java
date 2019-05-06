package model;
import java.util.*;
/**
*this class has the information of each client.<br>
*UNIVERSIDAD ICESI<br>
*Author: JULIAN ANDRES RIVERA CARRILLO<br>
*SYSTEM ENGINEER<br>
*/
public class Customers{
	//atributos 
	private String name; 
	private String ID; 
	private String address; 
	private String phoneNumber; 
	//relaciones 
	private ArrayList<Pets>mascota;
	private ClinicalHistory history;
	private Medicine medicina;
	//constructor 
	/**
	*this method is the constructor of the class.<br>
	*@param name the name of the a client.<br>
	*@param ID the id of the cliente.<br>
	*@param address the address of the client.<br>
	*@param phoneNumber the phone number of the client.<br>
	*/
	public Customers( String name, String ID, String address, String phoneNumber){
		this.name = name; 
		this.ID = ID; 
		this.address = address;
		this.phoneNumber = phoneNumber;
		mascota = new ArrayList<Pets>();
	}
	/**
	*this method asking for the name of the client.<br>
	*<b>pre:</b> the client is registred in the system.<br>
	*@return name name of each client.<br>
	*/
	public String getName(){
		return name; 
	}
	/**
	*this method assigned a new name.<br>
	*<b>pos:</b> the name is assigned to a client in the system.<br>
	*@param newName has the name of the new cliente.<br>
	*/
	public void setName(String newName){
		name = newName;
	}
	/**
	*this method has the function of asking for the id of the client.<br>
	*@return the id of the client.<br>
	*/
	public String getID(){
		return ID;
	}
	/**
	*this method change a id or add a Id of a client.<br>
	*<b>pos:</b> the id is registred in the system for a client.<br>
	*@param newID has the id of the client.<br>
	*/
	public void setID(String newID){
		ID = newID;
	}
	/**
	*this method ask the address of the client.<br>
	*<b>pre:</b> the client is registred in the system.<br>
	*@return the address of the client.<br>
	*/
	public String getAddress(){
		return address;
	}
	/**
	*this method registred a address of the a client in the system.<br>
	*<b>pos:</b> the client could be registred or he can be registred in the system.<br>
	@param newAddress has the address of the client.<br>
	*/
	public void setAddress(String newAddress){
		address = newAddress;
	}
	/**
	*this method ask for the phone number of the customer.<br>
	*<b>pre:</b> the client exist in the systme.<br>
	*@return the phone number of a specific client.<br>
	*/
	public String getPhoneNumber(){
		return phoneNumber;
	}
	/**
	*this method change a phone number or to assign a phone number.<br>
	*<b>pos:</b> the new phone number is registred in the system.<br>
	*@param newPhoneNumber has the phone number of the client.<br>
	*/
	public void setPhoneNumber(String newPhoneNumber){
		phoneNumber = newPhoneNumber; 
	}
	/**
	*this method get the pets of the arraylist.<br>
	*<b>pre:</b> the ArrayList must be created.<br>
	*@return all pets.<br>
	*/
	public ArrayList<Pets> getMascota(){
		return mascota;
	}
	/**
	*this method report each client of the veterinary.<br>
	*<b>pre:</b> there are client registred.<br>
	*@return a list of all client.
	*/
	public String customers(){
		String text="";
		text+= "CLIENTE:" + name + "/n" + "IDENTIFICACION:" + ID + "/n" + "DIRECCION:" + address + "/n" + "NUMERO DE TELEFONO:" + phoneNumber;
		return text;
	}
	/**
	*this method has the function of looking for a pet from its name.<br>
	*<b>pre:</b> the pet must be created.<br>
	*<b>pos:</b> the pet is found.<br>
	*@param name the name of the owner of the pet.<br>
	*@return the pet that matches the name.<br>
	*/
	public Pets searchPet(String name){
		Pets pt = null;
		boolean encontro = false;
		for(int i = 0; i < mascota.size() && !encontro; i++){
			if(name.equals(mascota.get(i).getName())){
				pt = mascota.get(i);
				encontro = true;
			}
		}
		return pt;
	}
	/**
	*this method add to the system a pet with its owner.<br>
	*<b>pre:</b> the pet is not registered.<br>
	*<b>pos:</b> th pet is added to the system.<br>
	*@param id is the id of the owner of the pet.<br>
	*@param name the name of the pet.<br>
	*@param age the age of the pet.<br>
	*@param weight the weight of the pet.<br>
	*@param height the height of the pet.<br>
	*@param animalRace the breed of the pet.<br>
	*@param type the type of animal of the pet.<br>
	*@return a message if the pet is added or if the pet already exists.<br>
	*/
	public String addPet(String id, String name, int age, double weight, double height, String animalRace, char type){
		String msg = "";
		Pets pt = new Pets( name, age, weight, height, animalRace, type);
		if(searchPet(name) !=null){
			msg = "MASCOTA YA EXISTE" ;
		}else {
			mascota.add(pt);
			msg = "LA MASCOTA HA SIDO AGREGADO EXITOSAMENTE";
		}
		return msg;
	}
	/**
	*this method delete a pet of the system.<br>
	<b>pre:</b> the pet is registred.<br>
	<b>pos:</b> the pet is deleted of the system.<br>
	*@param name the name of the pet that will delete.<br>
	*@return a message if the pet is deleted or if the pet doesn´t exists.<br>
	*/
	public String deletePet(String name){
		String ms = "";
		if(searchPet(name) != null){
		for(int i = 0; i < mascota.size(); i++){
			if(name != mascota.get(i).getName()){
				ms = "LA MASCOTA NO EXISTE";
			}else{
				mascota.remove(i);
				ms = "LA MASCOTA HA SIDO ELIMINADA";
			}
		}
		}
		return ms;
	}
	/**
	*this method report all pets of the veterinary.<br>
	*<b>pre:</b> there are pet registred.<br>
	*<b>pos.</b> all Pets are shown on the screen.<br>
	*@return a message with the list of pets.<br>
	*/
	public String reportPet(){
		String msg = "";
		for(int i = 0; i < mascota.size(); i++){
		if(mascota.isEmpty()){
			msg += "NO HAY MASCOTAS";
		}else {
			msg += "NOMBRE: " + mascota.get(i).getName() + "\nEDAD:" + mascota.get(i).getAge() + "\nPESO:" + mascota.get(i).getWeight() + "Kg" + mascota.get(i).getHeight() + "m2" + "\nRAZA" + mascota.get(i).getAnimalRace() + "\nSU INDICE DE MASA CORPORAL ES" + mascota.get(i).calculateIBM();
		}
		msg += "\n";
		msg += "\n";
		}
		return msg;
	}
}