package ejercicioAlumno;



/**
 * 
 * date: 22.03.2020
 * This java code defines some methods about selective process   
 * @author Laura
 * @version 1.0
 *
 */
public class Alumno 
{
	
	/**
	 * int value for numExpediente
	 */
	private int numExpediente;
	/**
	 * String value for nombre
	 */
	private String nombre;
	/**
	 * String Array for asignaturas
	 */
	private String[] asignaturas;
	/**
	 * int Array for notas
	 */
	private int[] notas;

	/**
	 * this method is an constructor of class Alumno
	 */
	public Alumno() 
	{
		asignaturas = new String[11];
		asignaturas[0] = new String("Desarrollo de aplicaciones en el servidor");
		asignaturas[1] = new String("Desarrollo de aplicaciones web en el cliente");
		asignaturas[2] = new String("Despliegue de aplicaciones");
		asignaturas[3] = new String("Diseño de interfaces");
		asignaturas[4] = new String("Acceso a datos");
		asignaturas[5] = new String("Programación de servicios y procesos");
		asignaturas[6] = new String("Programación multimedia y de móviles");
		asignaturas[7] = new String("Sistemas de gestión empresarial");
		asignaturas[8] = new String("Desarrollo de interfaces");
		asignaturas[9] = new String("Iniciativa emprendedora");
		asignaturas[10] = new String("Inglés");
		notas = new int [10];
	}
	/**
	 * This method adds asignatura as parameter and returns true o false
	 * @param asignatura String value
	 * @return returning existe
	 */
	private boolean existeMateria (String asignatura) 
	{
		boolean existe = false;
		for (int i = 0; i < asignaturas.length && !existe; i++) 
		{
			existe = this.asignaturas[i] == asignatura;
		}
		return existe;
	}
	/**
	 * This method adds asignatura as parameter and returns int posicion
	 * @param asignatura String value
	 * @return returning position value result from for loop
	 */
	private int getIndexMateria (String asignatura) 
	{
		int posicion = -1;
		for (int i = 0; i < asignaturas.length && posicion == -1; i++) 
		{
			if (this.asignaturas[i] == asignatura)
			{
			 posicion = i;	
			}
			
		}
		return posicion;
	}
	/**
	 * This method adds nota and asignatura as parameters and returns boolean value true or false
	 * @param nota first int value
	 * @param asignatura second String value 
	 * @return returning boolean value result from if method
	 */
	public	boolean ponerNota (int nota, String asignatura)
	{
		boolean validNota = false;
		if (existeMateria(asignatura))
		{
			notas[getIndexMateria(asignatura)] = nota;
			validNota = true;
		}
		return validNota;
	}
	
	/**
	 * This method adds asignatura as parameter and returns int result as nota
	 * @param asignatura String value
	 * @return returning int value result from if method
	 */
	public	int dameNota( String asignatura) 
	{
		int nota = -1;
		if (existeMateria(asignatura))
		{
		  nota = this.notas[getIndexMateria(asignatura)];	
		}
		return nota;
	}
	
	/**
	 * 
	 * @return the numExpediente
	 */
	public int getNumExpediente() {
		return numExpediente;
	}

	/**
	 * @param numExpediente the numExpediente to set
	 */
	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the asignaturas
	 */
	public String[] getAsignaturas() {
		return asignaturas;
	}

	/**
	 * @param asignaturas the asignaturas to set
	 */
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * @return the notas
	 */
	public int[] getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(int[] notas) {
		this.notas = notas;
	}


}
