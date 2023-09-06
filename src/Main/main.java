package Main;
import Clases.Administradores;
import Clases.Autenticable;
import Clases.Regulares;
import Clases.Usuario;
import java.util.ArrayList; 
import java.util.Scanner;

class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
	//ArrayList de usuarios
		
		ArrayList <Usuario> usuarios = new ArrayList<>();

   //Creo usuarios Administradores y Regulares
		
		Administradores a1 = new Administradores("MartinaPadovani", "MP12345");
		Administradores a2 = new Administradores("SebastianLopez", "SL12345");
		
		Regulares r1 = new Regulares("DelfinaTorga", "DT12345");
		Regulares r2 = new Regulares("JulietaZapata", "JZ12345");
		
	//Los agrego al array
		usuarios.add(r2);
		usuarios.add(r1);
		usuarios.add(a2);
		usuarios.add(a1);
		
		System.out.println("Ingrese su nombre de Usuario: ");
		String nombreDeUsuario = scanner.nextLine();
		
		System.out.println("Ingrese su Contrasenia: ");
		String contrasenia = scanner.nextLine(); 
		
		r2.autenticar(nombreDeUsuario, contrasenia, usuarios);
		
		
		

	}

}
