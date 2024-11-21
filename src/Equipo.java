import java.util.Arrays;

public class Equipo {
// ATRIBUTOS
	public final int TOT_JUGADORES=20;
	public final int TOT_ENTRENADORES=2;
	private String nombre;     			
	private String estadio;      	  			
	public Jugador [] jugadores; 		
	private Entrenador [] entrenadores;
	
	/*
	public Jugador [] arrayJugadores 		= new Jugador [TOT_JUGADORES];
	public Entrenador [] arrayEntrenadores  = new Entrenador [TOT_ENTRENADORES];
	 */
	
//  CONSTRUCTORES	
	public Equipo() {
		this.jugadores = new Jugador [TOT_JUGADORES];
		this.entrenadores = new Entrenador [TOT_ENTRENADORES];
		
	}
	
	public Equipo (String nombre, String estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
		this.jugadores = new Jugador [TOT_JUGADORES];
		this.entrenadores = new Entrenador [TOT_ENTRENADORES];
	}
	
	public Equipo (String nombre, String estadio, Jugador[] arrayJugadores, Entrenador[] arrayEntrenadores) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
		
		this.jugadores = arrayJugadores;
		this.entrenadores = arrayEntrenadores;
	}

//  GETTERS
	public String getNombre() {return this.nombre;}
	public String getEstadio() {return this.estadio;}
	public Jugador[] getarrayJugadores() {return this.jugadores;}
	public Entrenador[] getarrayEntrenadores() {return this.entrenadores;}
//  SETTERS	
	public void setNombre (String nombre) {this.nombre=nombre;}	
	public void setEstadio (String estadio) {this.estadio=estadio;}
	public void setarrayJugadores (Jugador[] arrayJugadores) {
		for (int i=0; i<arrayJugadores.length;i++) {
		this.jugadores[i]=arrayJugadores[i];
		}
	}
	public void setarrayEntrenadores (Entrenador[] arrayEntrenadores) {
		for (int i=0; i<arrayEntrenadores.length;i++) {
			this.entrenadores[i]=arrayEntrenadores[i];
			}
	}
	
	
//  METODOS
	public void ficharJugador(Jugador J) {
		boolean hueco = false;
		for (int i=0; i<this.jugadores.length;i++) {
			if (this.jugadores[i]==null) {
				this.jugadores[i]=J;
				hueco = true;
				break;
			}			
		}
		if (hueco == true) {System.out.println ("Jugador fichado!");}
		else {System.out.println ("Equipo completo!");}
	}
	public void ficharEntrenador(Entrenador E) {
		boolean hueco = false;
		for (int i=0; i<this.entrenadores.length;i++) {
			if (this.entrenadores[i]==null) {
				this.entrenadores[i]=E;
				hueco = true;
				break;
			}			
		}
		if (hueco == true) {System.out.println ("Entrenador fichado!");}
		else {System.out.println ("Equipo completo!");}
	}
	public void info() {
		System.out.println ("");
		System.out.println ("INFO Equipo ");
		System.out.println ("-----------------------------");
		System.out.println ("Nombre: "+this.nombre);
		System.out.println ("Estadio: "+this.estadio);
		
		System.out.println ("Jugadores: ");
		for (int i=0; i<this.jugadores.length;i++) {
	        if (this.jugadores[i]== null) {System.out.print ("Libre,");}
	        else {
	        System.out.print (this.jugadores[i].getNombre()); 
	        
			if (i<this.jugadores.length-1) {
	            System.out.print (","); 
	        }}
	    }
		System.out.println ("");
		System.out.println ("Entrenadores: ");
		for (int i=0; i<this.entrenadores.length;i++) {
	        if (this.entrenadores[i]== null) {System.out.print ("Libre,");}
	        else {
	        System.out.print (this.entrenadores[i].getNombre()); 
	        
			if (i<this.entrenadores.length-1) {
	            System.out.print (","); 
	        }}
	    }
		System.out.println ("");
		System.out.println ("-----------------------------");
		System.out.println ("");	
	}

	
	
} //Cierra Class
