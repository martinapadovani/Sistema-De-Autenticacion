package Clases;

public class Administradores extends Usuario{
	
	String tipoDeUsuario;
	
 public Administradores(String usuario, String contrasenia) {
		super(usuario, contrasenia);
		this.tipoDeUsuario = "Administrador";
	}
 

  @Override
	public String getTipoUsuario() {
	return tipoDeUsuario;
	}


@Override
public String toString() {
	return  super.toString() + "tipoDeUsuario=" + tipoDeUsuario;
}
  
  
}
