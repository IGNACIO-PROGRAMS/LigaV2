
public class Jugador {
// ATRIBUTOS	
		private String nombre;     			
		private Puesto posicion;       	  			
		private int numero;     			    
		private int edad;  	   
		private int golAVG = 0;
		private boolean activo;
		
//  CONSTRUCTORES		
	public Jugador() {
		this.numero = -1;
		this.activo=true;
	}
	public Jugador (String nombre, Puesto posicion, int numero, int edad, int Ngoles, boolean activo) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.numero = numero;
		this.edad = edad;
		this.golAVG = Ngoles;
		this.activo = activo;
	}
//  GETTERS
	public String  getNombre()					{return this.nombre;}
	public Puesto  getPosicion() 				{return this.posicion;}
	public int 	   getNumero() 					{return this.numero;}
	public int	   getEdad()					{return this.edad;}
	public int     getNgoles() 					{return this.golAVG;}
	public boolean getActivo()					{return this.activo;}
	
//  SETTERS	
	public void setNombre (String nombre) 		{this.nombre=nombre;}
	public void setPosicion (Puesto posicion) 	{this.posicion=posicion;}
	public void setNumero (int numero)			{this.numero=numero;}
	public void setEdad (int edad)				{this.edad=edad;}
	public void setNgoles (int Ngoles) 			{this.golAVG=Ngoles;}
	public void setActivo (boolean activo)		{this.activo=activo;}
	
	/* DE LA VERSION V1
//  METODOS
	public void info() {
		System.out.println ("");
		System.out.println ("INFO Jugador ");
		System.out.println ("-----------------------------");
		System.out.println ("Nombre: "+this.nombre);
		System.out.println ("Posicion: "+this.posicion);
		System.out.println ("Numero: "+this.numero);
		System.out.println ("Edad: "+this.edad);
		System.out.println ("NºGoles: "+this.golAVG);
		System.out.println ("Esta Activo: "+this.activo)
		System.out.println ("-----------------------------");
		System.out.println ("");	
	}			*/
} //Cierra Class
