package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Usuario implements Autenticable {
	
	private String usuario;
	private String contrasenia;
	
	public Usuario(String usuario, String contrasenia) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}
	
	//Getters-Setters

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getContrasenia() {
			return contrasenia;
		}

		public void setContrasenia(String contrasenia) {
			this.contrasenia = contrasenia;
		}

		
	
	//Metodos
	
	@Override
		public String toString() {
			return "Usuario=" + usuario + ", contrasenia=" + contrasenia;
		}

	public abstract String getTipoUsuario();
	
	@Override 
	
	public void autenticar(String nombreDeUsuario, String constrasenia, ArrayList <Usuario> usuarios) {
		boolean autenticado = false;
				
        for (Usuario usuarioAutenticar: usuarios) {

          if(nombreDeUsuario.equals(usuarioAutenticar.getUsuario()) && constrasenia.equals(usuarioAutenticar.getContrasenia())) {
        		
        	  autenticado = true;
        	  System.out.println("Ha iniciado sesion como Usuario " + usuarioAutenticar.getTipoUsuario());	
        	  break;
        	}
        }
          
       if (!autenticado) {
          
          System.out.println("Error! Usuario o Contraseña incorrectos"); 
        }	
	 }
}
