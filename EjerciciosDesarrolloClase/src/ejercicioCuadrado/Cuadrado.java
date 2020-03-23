package ejercicioCuadrado;

/**
 * date: 23.03.2020
 * This is a java code for geometric  Square figure
 * @author Laura
 *@version 1.0
 *
 */

public class Cuadrado 
{
	/**
	 * int value for the atributes
	 */
	private int x1, y1, x2, y2, x3, y3, x4, y4;
	/*
	 * Constructor Cuadrado
	 */
	
	/**
	 * This is a constructor method of the Cuadrado class
	 * @param _x1 firs int parameter
	 * @param _y1 second int parameter
	 * @param _x2 third int parameter
	 * @param _y2 forth int parameter
	 * @param _x3 fifth int parameter
	 * @param _y3 sexth int parameter
	 * @param _x4 seventh int parameter
	 * @param _y4 eighth int parameter
	 */
	public Cuadrado(int _x1, int _y1, int _x2, int _y2, int _x3, int _y3, int _x4, int _y4)
	{
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
		x3 = _x3;
		y3 = _y3;
		x4 = _x4;
		y4 = _y4;
	}
	
	/*
	 * Método modulo
	 */
	/**
	 * This method adds int parameters and returns the double results
	 * @param cx1 int
	 * @param cy1 int 
	 * @param cx2 int 
	 * @param cy2 int 
	 * @return returning the correctly rounded positive square root of double value
	 */
	private double distancia(int cx1, int cy1, int cx2, int cy2) {		 
		 return Math.sqrt((cx2-cx1)*(cx2-cx1) + (cy2-cy1)*(cy2-cy1));
	}
	
	/**
	 * @return returning the double value of one side of square
	 */
	public double lado() 
	{	
		// Asumimos que ya es un cuadrado y nos da lo mismo devolver cualquier lado
	    // teniendo en cuenta que tienen que ser correlativos
		return distancia(x1, y1, x2, y2);
	}
	
	/*
	 * Método esCuadrado
	*/
	/**
	 * @return boolean value, true or false
	 */
	public boolean esCuadrado() 
	{
		return ( distancia(x1,y1,x2,y2) == distancia(x2,y2,x3,y3) &&
			 distancia(x2,y2,x3,y3) == distancia(x3,y3,x4,y4) &&					
			 distancia(x3,y3,x4,y4) == distancia(x4,y4,x1,y1)  )  ? true : false;
	}
	
	/*
	 * Método dibujar
	 */
	/**
	 * This is a void method  and returns nothing and calculates the value of one side of square
	 */
	public void dibujar() 
	{
		// Calculamos el valor del lado de nuesto cuadrado:
		
			double lado = lado();
			
			
			//System.out.println("El lado vale lado " + lado);
			for (int i=0; i<lado;i++) 
				System.out.print("* ");
			
			System.out.println();
			
			for (int j=0; j<lado-2;j++)
			{
				System.out.print("*");
				
				for (int i=0; i<lado-2;i++) 
					System.out.print("  ");
				
				System.out.print(" *");
				System.out.println();
			}
			
			for (int i=0; i<lado;i++) 
				System.out.print("* ");
			
			System.out.println();
		
	}
	/*
	 * Método dibRellenando
	 */
	/**
	 *  This is a void method  and returns nothing and print the area of square 
	 */
	public void dibRellenando() 
	{
		
			double lado = lado();
				
			for (int j=0; j<lado;j++) 
			{ 			
				for (int i=0; i<lado;i++) 
					System.out.print("* ");	
				System.out.println();
			}
		
	}
	/*
	 * Método dibujarVertices
	 */
	/**
	 * This is a void method  and returns nothing and checks the equally of all sides.
	 */
	public void dibujarVertices() 
	{
		if (esCuadrado()) 
		{
			double lado = lado();
		
			System.out.printf("(%1d, %2d)", x2, y2);
			for (int i=1; i<lado-1;i++) 
				System.out.print("  ");
			System.out.printf("(%1d, %2d)%n", x3, y3);
			for (int j=0; j<lado-2;j++) 
			{		
				for (int i=0; i<lado;i++) 
					System.out.print("  ");
				
				System.out.println();
			}
			System.out.printf("(%1d, %2d)", x1, y1);
			for (int i=0; i<lado-2;i++) 
				System.out.print("  ");
			System.out.printf("(%1d, %2d)", x4, y4);
			System.out.println();
		}
		else System.out.println("¡No es un cuadrado!");
	}
	
	/**
	 * @return returning double valor of one side of square without any parameters .
	 */
	private double area() 
	{
		// Habría que plantearse un método que devuelva el lado sin
		// pasar parámetros, una vez comprobado que, efectivamente se trata de un cuadrado
		double l = lado();
		return l*l;
	}
	/*
	 * Método compara
	 */
	
	/**
	 * @param c type of Cuadrado
	 * @return returning int value result area compare
	 */
	public int compara(Cuadrado c) 
	{   
		int resultadoComp = 0;
		
		if (area() > c.area())
			resultadoComp = 1;
		else if (area() < c.area())
				resultadoComp = -1;
		
		return resultadoComp;
	}
	/*
	 * Método toString
	 */
	/**
	 * print the objects of the class
	 */
	public String toString() 
	{
		return "Cuadrado definido por los vértices: (" + x1 + "," + y1 + ") " + " (" + x2 + "," + y2 + ") " +" (" + x3 + "," + y3 + ") " +
				" (" + x4 + "," + y4 + ")";
	}
}
