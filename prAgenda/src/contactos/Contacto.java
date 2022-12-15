
package contactos;

/*1) La clase Contacto debe mantener información sobre un contacto. En
concreto, tendrá variables de instancia de tipo String para el nombre, los apellidos, el correo electrónico 
y el teléfono de un contacto. También dispondrá del constructor y los métodos necesarios para:*/


public class Contacto {
	
	private String nombre;
	private String apellidos;
	private String correoElectronico;
	private String telefono;
	
	// a. Construir un objeto de la clase a partir del nombre, apellidos, email y teléfono de un contacto.
	
	public Contacto(String nom, String ap, String correo, String tlf) {
		nombre = nom;
		apellidos = ap;
		correoElectronico = correo;
		telefono = tlf;
	}

	//b. Métodos de consulta y modificación para cada uno de los campos de un contacto.
	
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

	/*c. La representación como cadena de caracteres de un contacto con valores
	“nombre”, “apellido”, “email” y “teléfono” será del tipo:
	APELLIDOS, NOMBRE <dirección@correoelectrónico> (123456789)*/
	
	public String toString() {
		return ("Contacto->" + apellidos.toUpperCase() + ", " + nombre.toUpperCase() + "<"+ correoElectronico + ">" + "(" + telefono + ")");
		
		
}
	
	/*d. Dos objetos de la clase Contacto se consideran iguales si coinciden
sus nombres y apellidos, sin considerar mayúsculas ni minúsculas.*/
	
	// Determina que dos contactos son iguales cuando coinciden en nombre y apellido:
	
	public boolean equals(Object o) {
		boolean res = o instanceof Contacto;
		Contacto c = res ? (Contacto) o : null;
		return res && nombre.equalsIgnoreCase(c.nombre)
		&& apellidos.equalsIgnoreCase(c.apellidos);
		}
	
	// Redefinición de hashCode() acorde a la redefinición de equals(Object)
	
	public int hashCode() {
	return nombre.toUpperCase().hashCode() + apellidos.toUpperCase().hashCode();
	}
}
