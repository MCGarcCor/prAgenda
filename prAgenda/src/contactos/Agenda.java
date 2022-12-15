package contactos;


/*1) La clase Contacto debe mantener informaci�n sobre un contacto. En
concreto, tendr� variables de instancia de tipo String para el nombre, los apellidos, el correo electr�nico y 
el tel�fono de un contacto. Tambi�n dispondr� del constructor y los m�todos necesarios para:*/


public class Agenda {

	private Contacto[] contactos;
	private final int maxContactos=500;
	int numContacto;
	
//a.Constructores:Un constructor con un argumento que indique la capacidad m�xima de contactos a almacenar

	public Agenda(int maxContactos) {
		contactos = new Contacto[maxContactos];
	}
	
	// otro constructor sin argumentos que asumir� que esa capacidad m�xima es de 500 contactos.

	public Agenda() {
		contactos=new Contacto[maxContactos];
		
	}

/* b. Un m�todo Contacto buscaContacto(String nombre, String apellido)nos permite buscar en la agenda el contacto cuyos apellidos y nombre coinciden
* con los que se pasan como argumentos (sin tener en cuenta min�sculas o may�sculas). Se devolver� el contacto encontrado en la agenda, y en caso de
* no localizar ninguno, se devolver� null. (Nota: Obs�rvese que un contacto creado como del modo siguiente:new Contacto(nombre, apellidos, �@�, ��) es
* considerado �igual� que cualquier otro contacto con ese nombre y apellidos.)*/

	public Contacto buscarContacto(String nombre, String apellido) {
	
		boolean encontrado = false;
		for (int i = 0; i < contactos.length && !encontrado; i++) {
			if (new Contacto (nombre, apellido, "@","").equals(contactos[i])) {
				encontrado = true;
			} 
		}
		return null;
	}	
	
		
/* c. Un m�todo void agregaContacto (Contacto c) para a�adir el contacto c al
* final de la agenda. Si en la agenda hubiera previamente un contacto igual al
* que se trata de a�adir, �ste no se a�adir�, manteniendo el que ya exist�a.*/

	public void agregaContacto(Contacto c) {
	
		// Comprobamos que la agenda tiene capacidad para agregar el contacto
	    
		
		if (contactos !=null) {//Utilizamos el m�todo buscarContacto para comprobar que no existe
			for(int i=0; i<contactos.length;i++) {// Si no existe, le decimos que lo introduzca en la �ltima posici�n disponible
				contactos[i]=c;
				numContacto++;
				
			}
		}
	}
		
			

//d. El m�todo void eliminaTodos()elimina todos los contactos de la agenda.

	public void eliminaTodos (Contacto c) {
		
		for (int i=0; i<contactos.length; i++) {
			if (contactos[i]!=null) {//Le pedimos que recorra todo el array borrando los que no son null
				contactos[i]= null;
			}else {
				System.out.println("Los contactos han sido eliminados.");
			}
		}
	}

/*e. El m�todo int nroContactosConEmail(String dominio)
devuelve el n�mero de contactos que tienen su direcci�n de correo electr�nico en el dominio indicado por 
el argumento. Por ejemplo, el n�mero de contactos que tienen su direcci�n en �gmail.com�.*/
	
	
	String correo = contactos[numContacto].getCorreoElectronico();//Creamos una variable con la comparaci�n de referencia
	int dominio=correo.lastIndexOf("@"); // Otra variable con la cadena que queremos encontrar
	public int nrContactosConEmail(String dominio) {
		  for (int i = 0; i < contactos.length; i++) {//Pedimos que recorra los correos
			    if (correo.equalsIgnoreCase(dominio)) {//Y le decimos que si un correo contiene ese dominio lo devuelva
			      return i;
			    }
			  }
			  return -1;
				
	}

	
/*f. La representaci�n textual de una agenda debe mostrar la secuencia de
contactos, separando cada uno de ellos con un gui�n.*/
	
	
	public String toString() {
		return(contactos.toString() + "-");
	}
	
	
	
}








	
	
	
	
	
	
	


