package ar.basica2.tp3;

import java.util.Date;

public class Gerente extends Empleado{
	
	public Gerente(String nombre, Double salario, Date cumplea�os) {
		super(nombre, salario, cumplea�os);
	}
	
	private Integer numeroDeCochera;
	
	public String brindarDetalles(){
		return super.brindarDetalles() + "N�mero de cochera: " + this.numeroDeCochera;
	}
}

