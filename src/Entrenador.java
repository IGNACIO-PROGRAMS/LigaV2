
public class Entrenador {
// ATRIBUTOS	
		private String nombre; 
		private int edad; 
		private int numtitulos;       	  			     			    
  	   
//  CONSTRUCTORES		
	public Entrenador() {}  //Constructor vacio
	public Entrenador (String nombre, int edad, int titulos) {
		this.nombre = nombre;	
		this.edad = edad;
		this.numtitulos = titulos;
	}
//  GETTERS
	public String getNombre() 				{return this.nombre;}
	public int    getEdad()					{return this.edad;}
	public int getNumtitulos() 				{return this.numtitulos;}
//  SETTERS	
	public void setNombre  (String nombre) 	{this.nombre=nombre;}
	public void setEdad    (int edad) 		{this.edad=edad;}
	public void setNumtitulos (int titulos) {this.numtitulos=titulos;}

	/* DE LA V1
//  METODOS
	public void info() {
		System.out.println ("");
		System.out.println ("INFO Entrenador ");
		System.out.println ("-----------------------------");
		System.out.println ("Nombre: "+this.nombre);
		System.out.println ("Edad: "+this.edad);
		System.out.println ("Titulos: "+this.titulos);
		System.out.println ("-----------------------------");
		System.out.println ("");
		
	}		*/
} //Cierra Class
