package ar.basica2.tp3;

import java.util.Date;

public class Empleado {

	protected String nombre;
	protected Double salario;
	protected Date cumplea�os;
	
	public Empleado(String nombre, Double salario, Date cumplea�os){
		
		this.nombre = nombre;
		this.salario = salario;
		this.cumplea�os = cumplea�os;
	}
	
	public String brindarDetalles(){
		
		return "Nombre: " + this.nombre + "Salario: " + this.salario + "Cumplea�os: " + this.cumplea�os;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
