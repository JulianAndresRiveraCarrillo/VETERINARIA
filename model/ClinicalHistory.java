package model;
/**
*this class has the information of each clinical history of each pet.<br>
*UNIVERSIDAD ICESI<br>
*Author: JULIAN ANDRES RIVERA CARRILLO<br>
*SYSTEM ENGINEER<br>
*/
public class ClinicalHistory{
	//atributos 
	public final static char ABIERTO = 'a';
	public final static char CERRADO = 'c';
	private String admission;
	private String diagnostic;
	private String symtoms;
	private char status;
	private String[] notes;
	//relaciones
	Medicine medicina;
	//constructor 
	/**
	*this mtehod is the constructor of the class.<br>
	*@param admission receive the start date of hospitalization.<br>
	*@param diagnostic revecive the diagnostic that the doctor gives a pet.<br>
	*@param symtoms receive the symtoms that presented a pet.<br>
	*@param status receive the status of the hospitalization.<br>
	*/
	public ClinicalHistory(String admission,String diagnostic, String symtoms, char status){
		this.admission = admission;
		this.diagnostic = diagnostic;
		this.symtoms = symtoms;
		this.status = status;
		notes = new String[10];
	}
	/**
	*this method asking for the start date of hospitalization.<br>
	*<b>pre:</b> a pet has to be hospitalized.<br>
	*@return the value of the start date of the hospitalization.<br>
	*/
	public String getAdmission(){
		return admission;
	}
	/**
	*this method assigned the new admission of the hospitalization of a pet on the veterinary.<br>
	*<b>pos:</b> is assigned the new admission.<br>
	*@param newAdmission receive the new start date.<br>
	*/
	public void setAdmission(String newAdmission){
		admission = newAdmission;
	}
	/**
	*this method asking and get diagnostic that the doctor gives to the pet.<br>
	*<b>pre</b> the pet must be registred in the system.<br>
	*@return the diagnostic of the a pet.<br>
	*/
	public String getDiagnostic(){
		return diagnostic;
	}
	/**
	*the method has the function of change the diagnostic.<br>
	*<b>pos:</b> the diagnostic is changed in the system.<br>}
	*@param newDiagnostic receive the new diagnostic of the pet.<br>
	*/
	public void setDiagnostic(String newDiagnostic){
		diagnostic = newDiagnostic;
	}
	/**
	*this method asking about the symtoms of the pet.<br>
	*<b>pre:</b> the pet must be registred in the system.<br>
	*@return the symtoms of the pet.<br>
	*/
	public String getSymtoms(){
		return symtoms;
	}
	/**
	*this method change or add more symtoms of a pet.<br>
	*<b>pos:</b> there are more symtoms or there are less symtoms inthe system of a pet.<br>
	*@param newSymtoms receive more symtoms.<br>
	*/
	public void setSymtoms(String newSymtoms){
		symtoms = newSymtoms;
	}
	/**
	*this mehtod asking about the status of the hospitalization.<br>
	*<b>pre:</b> the pet must be registred in the system.<br>
	*@return the value of the status of the hospitalization of a pet.<br>
	*/
	public char getStatus(){
		return status;
	}
	/**
	*this method change the status of the hospitalization.<br>
	*<b>pos:</b> the status changed in the system.<br>
	*@param newStatus receive the status of the hospitalization.<br>
	*/
	public void setStatus(char newStatus){
		status = newStatus;
	}
}