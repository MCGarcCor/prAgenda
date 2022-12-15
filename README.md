# Proyecto Agenda
Ejercicio para implementar una agenda electrónica simple.

## INSTRUCCIONES
### Clase Contacto
La clase Contacto debe mantener información sobre un contacto. En
concreto, tendrá variables de instancia de tipo String para el nombre, los apellidos, el correo electrónico y el teléfono de un contacto. También, dispondrá del constructor y los métodos necesarios para:

1. Construir un objeto de la clase a partir del nombre, apellidos, email y teléfono de un contacto.
2. Métodos de consulta y modificación para cada uno de los campos de un contacto.
3. La representación como cadena de caracteres de un contacto con valores “nombre”, “apellido”, “email” y “teléfono” será del tipo:

    	APELLIDOS, NOMBRE <dirección@correoelectrónico> (123456789)

4. Dos objetos de la clase Contacto se consideran iguales si coinciden
sus nombres y apellidos, sin considerar mayúsculas ni minúsculas.

### Clase Agenda
La clase Agenda almacenará diferentes contactos e incluirá:

1.  Un constructor con un argumento que indique la capacidad máxima de contactos a almacenar y otro constructor sin argumentos que asumirá que esa capacidad máxima es de 500 contactos. En ambos casos, la agenda se construirá inicialmente sin contactos.
2. Un método Contacto buscaContacto(String nombre, String apellido) nos permite buscar en la agenda el contacto cuyos apellidos y nombre coinciden con los que se pasan como argumentos (sin tener en cuenta minúsculas o mayúsculas). Se devolverá el contacto encontrado en la agenda, y en caso de no localizar ninguno, se devolverá null.(Nota: Obsérvese que un contacto creado como del modo siguiente: new Contacto(nombre, apellidos, ”@”, ””) es considerado “igual” que cualquier otro contacto con ese nombre y apellidos).
3. Un método void agregaContacto(Contacto c) para añadir el contacto c al final de la agenda. Si en la agenda hubiera previamente un contacto igual al que se trata de añadir, éste no se añadirá, manteniendo el que ya existía.
4.  El método void eliminaTodos()elimina todos los contactos de la agenda.
5.  El método int nroContactosConEmail(String dominio) devuelve el número de contactos que tienen su dirección de correo electrónico en el dominio indicado por el argumento. Por ejemplo, el número de contactos que tienen su dirección en gmail.com”.
6. La representación textual de una agenda debe mostrar la secuencia de contactos, separando cada uno de ellos con un guión.

### Clase AgendaConMemoria

La clase AgendaConMemoria representará objetos similares a las agendas,
pero con un atributo que almacene el último contacto buscado en la agenda, de forma que incluya también un método Contacto ultimoContacto(), que devuelva el último contacto que se haya buscado.
