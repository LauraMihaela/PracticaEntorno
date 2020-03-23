package ejercicioDesarrolloFigura;


/**
 * This java code is about choosing colors according with characteristic of forms 
 * date: 23.03.2020
 * @author Laura
 * @version 1.0
 *
 */
public class Figura 
{
	/**
	 * first String atribute
	 */
	private String forma;
	/**
	 * second String atribute
	 */
	private String color;
	/**
	 * third String Array atribute
	 */
	private static final String ListaColores[] = {"rojo", "anaranjado", "amarillo", "verde", "azul",
			"violeta","rosa", "negro", "blanco", "oro", "plata", "bronce"};

	/**
	 * empty Constructor by default of the Class
	 */
	public Figura()
	{
		
	}
	/**
	 * Constructor of the class with two parameters
	 * @param forma String value
	 * @param color String value
	 */
	public Figura(String forma, String color)
	{
		this.forma ="";
		this.color ="";
	}
	/**
	 *  Constructor of the class with two parameters
	 * @param forma String value
	 * @param color int valeu
	 */
	public Figura(String forma, int color)
	{
		this.forma = forma;		
	}
	/**
	 * @return rerurning forma
	 */
	public String getForma() 
	{
		return forma;
	}
	/**
	 * @param forma the forma to set
	 */
	public void setForma(String forma) 
	{
		this.forma = forma;
	}
	/**
	 * @return color
	 */
	public String getColor() 
	{
		return color;
	}
	
	/**
	 * @param color int value
	 * @return returning true or false
	 */
	public static boolean validColor(int color)
	{
		return color > 0  && color < ListaColores.length;
	}

	/**
	 * @param color String value
	 * @return boolean value, true or false
	 */
	public static boolean  validColor(String color)
	{
		boolean isValid = false;
		for (int i = 0; i < ListaColores.length && !isValid; i++) 
		{
			isValid = ListaColores[i] == color;
		}
		return isValid;
	}
	/**
	 * @param color the color to set, String value 
	 */
	public void setColor(String color) 
	{
		if (validColor(color)) 
		{
			this.color = color;	
		}
			
	}
	/**
	 * @param color the color to set, int value
	 */
	public void setColor(int color) 
	{
		if(validColor(color))
		{
			this.color = colorToColor(color);
		}
	}
	/**
	 * @param color String value
	 * @return int value, if the color can be find in color list returns the position from array ListaColores
	 */
	private int colorToColor(String color)
	{
		int posicion = -1;
		for (int i = 0; i < ListaColores.length && posicion != -1; i++) 
		{
			if (ListaColores[i] == color)
			{
				posicion = i;
			}
		}
		return posicion;
	}
	
	/**
	 * @param color int value
	 * @return  String value, if color is inside of the list color
	 */
	private String colorToColor(int color)
	{
		return color > 0 && color < ListaColores.length ? ListaColores[color]: "";
	}
}
