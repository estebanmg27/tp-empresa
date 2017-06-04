package ar.basica2.tp3;

import java.util.Date;

public class Gerente extends Empleado{
	
	public Gerente(String nombre, Double salario, Date cumpleaños) {
		super(nombre, salario, cumpleaños);
	}
	
	private Integer numeroDeCochera;
	
	public String brindarDetalles(){
		return super.brindarDetalles() + "Número de cochera: " + this.numeroDeCochera;
	}
}

