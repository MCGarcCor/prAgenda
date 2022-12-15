
package contactos;

/*1) La clase Contacto debe mantener informaci�n sobre un contacto. En
concreto, tendr� variables de instancia de tipo String para el nombre, los apellidos, el correo electr�nico 
y el tel�fono de un contacto. Tambi�n dispondr� del constructor y los m�todos necesarios para:*/


public class Contacto {
	
	private String nombre;
	private String apellidos;
	private String correoElectronico;
	private String telefono;
	
	// a. Construir un objeto de la clase a partir del nombre, apellidos, email y tel�fono de un contacto.
	
	public Contacto(String nom, String ap, String correo, String tlf) {
		nombre = nom;
		apellidos = ap;
		correoElectronico = correo;
		telefono = tlf;
	}

	//b. M�todos de consulta y modificaci�n para cada uno de los campos de un contacto.
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/*c. La representaci�n como cadena de caracteres de un contacto con valores
	�nombre�, �apellido�, �email� y �tel�fono� ser� del tipo:
	APELLIDOS, NOMBRE <direcci�n@correoelectr�nico> (123456789)*/
	
	public String toString() {
		return ("Contacto->" + apellidos.toUpperCase() + ", " + nombre.toUpperCase() + "<"+ correoElectronico + ">" + "(" + telefono + ")");
		
		
}
	
	/*d. Dos objetos de la clase Contacto se consideran iguales si coinciden
sus nombres y apellidos, sin considerar may�sculas ni min�sculas.*/
	
	// Determina que dos contactos son iguales cuando coinciden en nombre y apellido:
	
	public boolean equals(Object o) {
		boolean res = o instanceof Contacto;
		Contacto c = res ? (Contacto) o : null;
		return res && nombre.equalsIgnoreCase(c.nombre)
		&& apellidos.equalsIgnoreCase(c.apellidos);
		}
	
	// Redefinici�n de hashCode() acorde a la redefinici�n de equals(Object)
	
	public int hashCode() {
	return nombre.toUpperCase().hashCode() + apellidos.toUpperCase().hashCode();
	}
}
