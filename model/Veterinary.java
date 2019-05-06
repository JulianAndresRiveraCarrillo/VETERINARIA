package model;
import java.util.*;
/**
*this class is the controller.<br>
*UNIVERSIDAD ICESI<br>
*Author: JULIAN ANDRES RIVERA CARRILLO<br>
*SYSTEM ENGINEER<br>
*/
public class Veterinary{
	//atributos 
	public final static int NUMERO_CUARTOS = 8;
	private String name;
	private String nit;
	private int[] rooms;
	//relaciones 
	private ArrayList<Customers> clientes;
	private Customers client;
	//constuctor 
	/**
		*Description: this method is the constructor of the class.<br>
		*@param name of the veterinary. this param doesn´t could be empty.<br>
		*@param nit of the veterinary.<br>
		*/
	public Veterinary(String name, String nit){
		this.name = name;
		this.nit = nit;
		clientes = new ArrayList<Customers>();
		rooms = new int[NUMERO_CUARTOS];
	}
	public int[] rooms(){
		return rooms;
	}
	/**
		*Description: this method has the function of asking the name of veterinary.<br>
		*@return the value that returns is the name.<br>
		*/
	public String getName(){
		return name;
	}
	/**
		*Description: this method has the function of assigning the new name of the veterinary.<br>
		*<b>pos:</b> a new name is assigned to the veterinary.<br>
		*@param newName the new name is assigned to the veterinary.<br>
		*/
	public void setName(String newName){
		name = newName;
	}
	/**
		*Description: this method has the function of asking the ID of the veterinary.<br>
		*@return the value that returns is the ID. <br>
		*/
	public String getNit(){
		return nit;
	}
	/**
		*this method has the function of asking the ID of veterinary.<br>
		*<b>pos:</b> a new NIT is assigned to the veterinary.<br>
		*@param newNit the nit can change and it will assigned to the veterinary.<br>
		*/
	public void setNit(String newNit){
		nit = newNit;
	}
	/**
		*this method has the function of report the attributes of the veterinary.<br>
		*@return the value that returns is the name and the nit of the veterinary.<br>
		*/
	public String reporVet(){
		String text ="";
		text+= "VETERINARIA:"+ name + "\nNIT:" + nit;
		return text;
	}
	/**
		*this method has the function of the search a client with his ID.<br>
		*<b>pre:</b> it is verified that the client exists.<br>
		*<b>pos:</b> it is verified that the ID is equal to a veterinary client.<br>
		*@param ID receives the id of the client.<br>
		*@return returns the client that is being requested.<br>
		*/
	public Customers searchClient(String ID){
		Customers clte = null;
		boolean encontro=false;
		for(int i = 0; i < clientes.size()&& !encontro; i++){
			if(ID.equals(clientes.get(i).getID())){
				clte = clientes.get(i);
				encontro=true;
			}
		}
		return clte;
	}
	/**
		*this method has the function of add a new client to the system.<br>
		*<b>pre:</b> the new customer is created.<br>
		*<b>pre:</b> it is verified that the client to be added is no longer saved.<br>
		*<b>pos:</b> the client is added to the system.<br>
		*@param name the new name of the new client of the system.this param don´t could be empty.<br>
		*@param ID the id of the new client.this param don´t could be empty.<br>
		*@param address the address of the new client.this param don´t could be empty.<br>
		*@param phoneNumber the phone number of the new client. this param don´t could be empty.<br>
		*@return a message that informs if the client was added or if it already exists.<br>
		*/
	public String addCliente(String name, String ID, String address, String phoneNumber){
		String msg = "";
		Customers cl = new Customers(name, ID, address, phoneNumber );
		if(searchClient(ID) !=null){
			msg = "EL CLIENTE YA EXISTE";
		}else {
			clientes.add(cl);
			msg = "EL CLIENTE HA SIDO AGREGADO EXITOSAMENTE ";
		}
		return msg;
	}
	/**
		*this method has the function of report all the clients that the veterinary has in the system.<br>
		*<b>pre:</b> it is verified that there is a registered client.<br>
		*@return a message with the name, identification, address, telephone number of each client.<br>
		*/
	public String reportClient(){
		String msg = "";
		for(int i = 0; i < clientes.size(); i++){
		if(clientes.isEmpty()){
			msg = "NO HAY CLIENTES";
		}else {
			msg += "NOMBRE:" + clientes.get(i).getName() + "\nIDENTIFICACION:" + clientes.get(i).getID() + "\nDIRRECCION:" + clientes.get(i).getAddress() + "\nTELEFONO:" +  clientes.get(i).getPhoneNumber();
		msg += "\n";
		msg += "\n";
		}
	}
	return msg;
	}
	/**
		*this method has the fucntion of add a pet to the system.<br>
		*<b>pre:</b> it is verified if the client, owner of the pet is in the system.<br>
		*<b>pos:</b> A new pet or pet is added to a customer.<br>
		*@param id receives the id of the client.<br>
		*@param name receives the name of the pet.<br>
		*@param age receives the age of the pet.<br>
		*@param weight receives the weight of the pet.<br>
		*@param height receives the height of the pet.<br>
		*@param animalRace receives the breed of the pet.<br>
		*@param type receives the type of animal of the pet.<br>
		*@return a message if the client don`t existe or if the pets has already been saved.<br>
		*/
	public String addPet(String id, String name, int age, double weight, double height, String animalRace, char type){
		String msg = "";
		Customers cl = searchClient(id);
		if(cl ==null){
			msg = "EL CLIENTE NO EXISTE";
		}else {
			msg = cl.addPet(id, name, age, weight, height, animalRace, symptoms, type);
		}
		return msg;
	}
	public String deletePet(String id, String name){
		String msg = "";
		Customers cl = searchClient(id);
		if(cl ==null){
			msg = "EL CLIENTE NO EXISTE";
		}else {
			msg = cl.deletePet(name);
		}
		return msg;
	}
	/**
		*this method has the function of report each customer with his pets.<br>
		*@return a message with the name of a client with his pets.<br>
		*/
	public String reportAll(){
		
		String mg = "";
		for(int i = 0; i < clientes.size(); i++){
			mg = "CLIENTE: " + clientes.get(i).getName() + "\nIDENTIFICADO CON: " + clientes.get(i).getID() + "\nMASCOTAS:";
			ArrayList<Pets>pet = clientes.get(i).getMascota();
			for(int j = 0; j < pet.size(); j++){
				mg += pet.get(j).getName();
				if(j == pet.size() - 1){
					mg += ".";
			}else {
				mg += ",";
			}
			
		}
	}
	return mg;
	}
	/**
		*this method has the function of return system clients.<br>
		*@return returns all registered customers.<br>
		*/
	public ArrayList<Customers> getClients(){
		return clientes;
	}
	public String reportPet(){
		String msg = "";
		for (int i = 0;i < clientes.size(); i++){
			ArrayList <Pets>pet = clientes.get(i).getMascota();
			for(int j = 0; j < pet.size(); j++){
				msg += "\nMASCOTA: " + pet.get(j).getName() + "\nEDAD: " + pet.get(j).getAge() + "\nPESO: " + pet.get(j).getWeight() + "\nALTURA: " + pet.get(j).getHeight() + "\nRAZA: " + pet.get(j).getAnimalRace() + "\nINDICE DE MASA CORPORAL:" + pet.get(j).calculateIBM();
			}
		}
		return msg;
	}
}