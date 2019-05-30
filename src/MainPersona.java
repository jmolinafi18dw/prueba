import java.util.*;
import com.zubiri.persona.*;

public class MainPersona {
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Persona> Personas= new ArrayList<Persona>();
	public static void main(String[] args) {
	
	int opcion;
		
		do {
			System.out.println("----Bienvenid@ al Menu----");
			System.out.println(" 1. Añadir Personas");
			System.out.println(" 2. Mostrar Personas");
			System.out.println(" 3. Número de personas por poblacion");
			System.out.println(" 4. Codigos postales correctos");
			System.out.println(" 5. Salir");
			System.out.print("Elije una opción: ");
			opcion=teclado.nextInt();
			teclado.nextLine();
			switch(opcion){
			
				case 1:
					leerPersonas(Personas);
					break;
				case 2:
					mostrar(Personas);
					break;
				case 3:
					System.out.println("Introduce el nombre de la población: ");
					String ciudad = teclado.nextLine();
					System.out.println("El numero de personas que viven en "+ciudad+" son "+cuantasPersonasVivenEn(ciudad));
					break;
				case 4:
					cuantoscódigospostalesbuenos(Personas);
					break;
				case 5:
					System.out.println("Saliendo...");
					System.out.println("Ha salio con exito");
					break;
				default:
					System.out.println("ERROR-Introduce un numero entre 1 y 5");
				
			}
		}while (opcion!=5);
}
public static void leerPersonas(ArrayList<Persona> Personas) {
	System.out.print("Introduce el numero de personas a añadir: ");
	int cuantos= teclado.nextInt();
	for (int i=1;i<=cuantos;i++) {
		System.out.println("Introduce los datos personales de la persona: ");
		teclado.nextLine();
		System.out.print("Nombre de la persona: ");
		String nombre = teclado.nextLine();
		System.out.print("Dirección de la persona: ");
		String direccion = teclado.nextLine();
		System.out.print("Código postal de la persona: ");
		int codigopostal = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Ciudad de la persona: ");
		String ciudad = teclado.nextLine();
		System.out.print("Edad de la persona: ");
		int edad = teclado.nextInt();
		Persona Persona1 = new Persona(nombre, direccion, codigopostal, ciudad, edad);
		Personas.add(Persona1);
	}
}
public static void mostrar(ArrayList<Persona> Personas) {
	
	for (int i = 0;i<Personas.size();i++) {
		System.out.println(Personas.get(i).toString());
	}
}

public static int cuantasPersonasVivenEn(String ciudad) {
	int contCiudad = 0;
	for (int i = 0;i<Personas.size();i++) {
		if (ciudad.equalsIgnoreCase(Personas.get(i).getCiudad())) {
			contCiudad++;
		}
	}
	return contCiudad;
}

public static void cuantoscódigospostalesbuenos(ArrayList<Persona> Personas) {
	int contCod = 0;
	for (int i = 0;i<Personas.size();i++) {
		if(Personas.get(i).escorrectocodpostal()==true) {
			contCod++;
		}
	}
	System.out.println("En la lista se encuentran "+contCod+" codigos buenos entre 0 y 20000.");
}

}
