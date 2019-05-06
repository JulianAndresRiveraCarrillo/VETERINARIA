package userinterface;
import java.util.*;
import model.*;
public class Main {
	//relaciones
	private Veterinary veterinaria;
	
	
	public Main(){
		 veterinaria = new Veterinary("MI PEQUENA MASCOTA" , "123.456.789");
		 menu();
	}
	public static void main(String [] args){
		Main objmain=new Main();
	}

	public void menu(){
		int option;
		boolean exit = false;
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------HOLA, ERES BIENVENIDO-------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(veterinaria.reporVet());
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		while (!exit){
		System.out.println("1.INGRESAR CLIENTE");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("2.INGRESAR MASCOTA");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("3.DESPLEGAR CLIENTE");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("4.DESPLEGAR MASCOTAS");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("5.DESPLEGAR CLIENTES Y MASCOTAS DEL SISTEMA");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("6.ELIMINAR MASCOTAS");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");		
		System.out.println("6.INACTIVAR CLIENTE");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("7.CREAR HISTORIA CLINICA");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("8.CALCULAR EL COSTO DE HOSPITALIZACION");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("9.MODIFICAR DATOS DE UN CLIENTE");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("0.SALIR");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		option = sc.nextInt();

		switch (option){
			case 1:
            sc.nextLine();
			System.out.print ("INGRESE EL NOMBRE DEL CLIENTE: ");
			String nomb = sc.nextLine();
			System.out.print ("INGRESE EL NUMERO DE IDENTIFICACION DEL CLIENTE: ");
			String id = sc.nextLine();
			System.out.print ("INGRESE LA DIRECCION DEL CLIENTE: ");
			String direccion = sc.nextLine();
			System.out.print ("INGRESE EL NUMERO DE TELEFONO DEL CLIENTE: ");
			String telefono = sc.nextLine();
			System.out.print (veterinaria.addCliente(nomb, id, direccion, telefono));
			sc.nextLine();
			break;

			case 2:
			sc.nextLine();
			System.out.print ("INGRESE LA IDENTIFICACION DEL DUENO: ");
			id = sc.nextLine();
			System.out.print ("INGRESE EL NOMBRE DE LA MASCOTA: ");
			String nombre = sc.nextLine();
			System.out.println ("INGRESE LA EDAD DE LA MASCOTA: ");
			int edad = sc.nextInt();
			System.out.print ("INGRESE EL PESO DE LA MASCOTA: ");
			double peso = sc.nextDouble();
			System.out.print ("INGRESE LA ALTURA DE LA MASCOTA: ");
			double altura = sc.nextDouble();
			System.out.print ("INGRESE LA RAZA DE LA MASCOTA: ");
			String raza = sc.nextLine();
			sc.nextLine();
			String sim = sc.nextLine();
			System.out.println ("INGRESE EL TIPO DE LA MASCOTA");
			char caracter = sc.next().charAt(0);
			sc.nextLine();
			System.out.println (veterinaria.addPet(id, nombre, edad, peso,altura, raza, sim,caracter));
			break;
			
			case 3:
			System.out.println (veterinaria.reportClient());
			break;
			
			case 4:
			sc.nextLine();
			System.out.print (veterinaria.reportPet());
			sc.nextLine();
			break;
			
			case 5:
			System.out.println (veterinaria.reportAll());
			break;
			
			case 6:
			sc.nextLine();
			System.out.print ("INGRESE LA IDENTIFICACION DEL DUENO: ");
			id = sc.nextLine();
			System.out.print ("INGRESE EL NOMBRE DE LA MASCOTA: ");
			nomb = sc.nextLine();
			System.out.print (veterinaria.deletePet(id,nomb));
			break;
			
			case 9: 
			sc.nextLine();
			System.out.print ("INGRESE EL NUMERO DE IDENTIFICACION DEL CLIENTE: ");
			id = sc.nextLine();
			System.out.print ("INGRESE LA NUEVA DIRECCION");
			direccion = sc.nextLine();
			System.out.print ("INGRESE EL NUEVO NUMERO DE TELEFONO");
			telefono = sc.nextLine();
			
			break;
			
			case 0:
			System.out.println("GOOD BYE...... ");
			System.out.println("    -----   -----    ");
			System.out.println("    | 0 |   | 0 |    ");
			System.out.println("    -----   -----    ");
			System.out.println("  -               -");
			System.out.println("   -             -");
			System.out.println("    ------------- ");
			exit = true;
			break;

			default:
			System.out.println ("INGRESE UNA OPCION VALIDA POR FAVOR");
			break; 



		}

	}
}
}