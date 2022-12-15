package contactos;


/*1) La clase Contacto debe mantener información sobre un contacto. En
concreto, tendrá variables de instancia de tipo String para el nombre, los apellidos, el correo electrónico y 
el teléfono de un contacto. También dispondrá del constructor y los métodos necesarios para:*/


public class Agenda {

	private Contacto[] contactos;
	private final int maxContactos=500;
	int numContacto;
	
//a.Constructores:Un constructor con un argumento que indique la capacidad máxima de contactos a almacenar

	public Agenda(int maxContactos) {
		contactos = new Contacto[maxContactos];
	}
	
	// otro constructor sin argumentos que asumirá que esa capacidad máxima es de 500 contactos.

	public Agenda() {
		contactos=new Contacto[maxContactos];
		
	}

/* b. Un método Contacto buscaContacto(String nombre, String apellido)nos permite buscar en la agenda el contacto cuyos apellidos y nombre coinciden
* con los que se pasan como argumentos (sin tener en cuenta minúsculas o mayúsculas). Se devolverá el contacto encontrado en la agenda, y en caso de
* no localizar ninguno, se devolverá null. (Nota: Obsérvese que un contacto creado como del modo siguiente:new Contacto(nombre, apellidos, ”@”, ””) es
* considerado “igual” que cualquier otro contacto con ese nombre y apellidos.)*/

	public Contacto buscarContacto(String nombre, String apellido) {
	
		boolean encontrado = false;
		for (int i = 0; i < contactos.length && !encontrado; i++) {
			if (new Contacto (nombre, apellido, "@","").equals(contactos[i])) {
				encontrado = true;
			} 
		}
		return null;
	}	
	
		
/* c. Un método void agregaContacto (Contacto c) para añadir el contacto c al
* final de la agenda. Si en la agenda hubiera previamente un contacto igual al
* que se trata de añadir, éste no se añadirá, manteniendo el que ya existía.*/

	public void agregaContacto(Contacto c) {
	
		// Comprobamos que la agenda tiene capacidad para agregar el contacto
	    
		
		if (contactos !=null) {//Utilizamos el método buscarContacto para comprobar que no existe
			for(int i=0; i<contactos.length;i++) {// Si no existe, le decimos que lo introduzca en la última posición disponible
				contactos[i]=c;
				numContacto++;
				
			}
		}
	}
		
			

//d. El método void eliminaTodos()elimina todos los contactos de la agenda.

	public void eliminaTodos (Contacto c) {
		
		for (int i=0; i<contactos.length; i++) {
			if (contactos[i]!=null) {//Le pedimos que recorra todo el array borrando los que no son null
				contactos[i]= null;
			}else {
				System.out.println("Los contactos han sido eliminados.");
			}
		}
	}

/*e. El método int nroContactosConEmail(String dominio)
devuelve el número de contactos que tienen su dirección de correo electrónico en el dominio indicado por 
el argumento. Por ejemplo, el número de contactos que tienen su dirección en “gmail.com”.*/
	
	
	String correo = contactos[numContacto].getCorreoElectronico();//Creamos una variable con la comparación de referencia
	int dominio=correo.lastIndexOf("@"); // Otra variable con la cadena que queremos encontrar
	public int nrContactosConEmail(String dominio) {
		  for (int i = 0; i < contactos.length; i++) {//Pedimos que recorra los correos
			    if (correo.equalsIgnoreCase(dominio)) {//Y le decimos que si un correo contiene ese dominio lo devuelva
			      return i;
			    }
			  }
			  return -1;
				
	}

	
/*f. La representación textual de una agenda debe mostrar la secuencia de
contactos, separando cada uno de ellos con un guión.*/
	
	
	public String toString() {
		return(contactos.toString() + "-");
	}
	
	
	
}








	
	
	
	
	
	
	


