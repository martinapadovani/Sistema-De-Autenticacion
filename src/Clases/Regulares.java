package Clases;

public class Regulares extends Usuario{
	
	String tipoDeUsuario;
	
	public Regulares (String usuario, String contrasenia) {
		super(usuario, contrasenia);
		this.tipoDeUsuario = "Regular";
	}
	

  @Override
	public String getTipoUsuario() {
	return tipoDeUsuario;	
	}


@Override
public String toString() {
	return  super.toString() + ", Tipo de Usuario=" + tipoDeUsuario;
}
  
  
}
