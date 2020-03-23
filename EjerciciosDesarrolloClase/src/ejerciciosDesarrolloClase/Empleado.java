package ejerciciosDesarrolloClase;


/**
 * date:23.03.2020
 * This java code is about to manage employers list
 * @author Laura
 * @version 1.0
 *
 */
public class Empleado 
{
	/**
	 * first String atribute
	 */
	private String DNI;
	/**
	 * second String atribute
	 */
	private String nombre;
	/**
	 * third String atribute
	 */
	private String fechaAlta;
	/**
	 * fourth int atribute
	 */
	private int codigoEmpleado;


	/**
	 * the empty Constructor by default 
	 */
	public Empleado()
	{
		
	}
	/**
	 * the Constructor with all parameters
	 * @param DNI String value
	 * @param nombre String value
	 * @param fecha String value
	 * @param codigoEmpleado int value
	 */
	public Empleado (String DNI, String nombre, String fecha, int codigoEmpleado)
	{
		this.DNI = DNI;
		this.nombre = nombre;
		this.fechaAlta = fecha;
		this.codigoEmpleado = codigoEmpleado;
	}
	/**
	 *toString method to print the class objects
	 */
	public String	toString()
	{
		String aux;
		aux = ("DNI: "+this.DNI+" Nombre: "+this.nombre+" Fecha Alta: "
						+this.fechaAlta+ " Tipo Empleado:"+getTipoEmpleado()+" Código empleado: "+this.codigoEmpleado);
		return aux;
	}
	/**
	 * @param e type Empleado
	 * @return boolean value, true o false
	 */
	public boolean	equals(Empleado e) 
	{
		return this.DNI == e.getDNI();
	}

	/**
	 * @return  the nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}
	/**
	 * @param nombre String value, the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	/**
	 * @return the fechaAlta
	 */
	public String getFechaAlta()
	{
		return fechaAlta;
	}
	/**
	 * @param fechaAlta String value, the fechaAlta to set
	 */
	public void setFechaAlta(String fechaAlta)
	{
		this.fechaAlta = fechaAlta;
	}
	
	/**
	 * set el codigoEmpleado
	 * @param tipoEmpleado String value
	 */
	public void setCodigoEmpleado(String tipoEmpleado) 
	{
		
		if (tipoEmpleado.toLowerCase().contains("analista"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("programador") ? 1299 : 1255;
		}else if (tipoEmpleado.toLowerCase().contains("programador"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("senior") ? 1555 : 1599;
		}else if (tipoEmpleado.toLowerCase().contains("administrador"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("senior") ? 1955 : 1999;
		}
		
	};
	/**
	 * @return String value
	 */
	public String getTipoEmpleado()
	{
		String aux  = "";
		switch (this.codigoEmpleado)
		{
			case 1255:
				aux = "ANALISTA";
			break;
			case 1299:
				aux = "ANALISTA-PROGRAMADOR";
			break;
			case 1555:
				aux = "PROGRAMADOR SENIOR";
			break;
			case 1599:
				aux = "PROGRAMADOR JUNIOR";
			break;
			case 1955:
				aux = "ADMINITRADOR JUNIOR";
			break;
			case 1999:
				aux = "ADMINITRADOR JUNIOR";
			break;
		}
		return aux;
	}
	public int getCodigoEmpleado() 
	{
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(int codigooEmpleado) {
		this.codigoEmpleado = codigooEmpleado;
	}

	public void setDNI(String DNI)
	{
		this.DNI = DNI;
	}
	public String getDNI() 
	{
		return DNI;
	}
	/**
	 * @param fecha String value
	 * @return returning the int value of lenght comparation
	 */
	public int	compareTo(String fecha)
	{   
		int dif;
		int f1 = this.getDNI().length();
		int f2 = fecha.length();
		dif = (f1 != f2) ? f1 - f2 : 0;  
		return dif;  
	}

}
