package EDE_A9;

import java.util.List;

public class Profesor extends Persona{
	
	private String nombre;
	private int edad;
	
	List <Prestamo> prestamos;
	
	public Profesor(String numeroDeTelefono){
		super(numeroDeTelefono);
	}
	
	public void printInformacionPersonal(){
		
		System.out.println("Nombre" + nombre);
		System.out.println("Edad:" + edad);
		System.out.println("Telefono" + numeroDeTelefono);
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNumeroDeTelefono() {
		return numeroDeTelefono;
	}

	public void setNumeroDeTelefono(String numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public void printTodaLaInformacionPersonal(){
		this.printInformacionPersonal();
		for(Prestamo p: prestamos){
			System.out.println(p);
		}
	}
	
	
	
	
	
	
}
