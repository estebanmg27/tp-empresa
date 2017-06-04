package ar.basica2.tp3;

import java.util.Date;

public class Director extends Empleado {
	
	public Director(String nombre, Double salario, Date cumpleaños) {
		super(nombre, salario, cumpleaños);
	}
	
	private Integer numeroDeCochera;
	private Double ExtraSalario;
	
	public Integer getNumeroDeCochera() {
		return numeroDeCochera;
	}
	public void setNumeroDeCochera(Integer numeroDeCochera) {
		this.numeroDeCochera = numeroDeCochera;
	}
	public Double getExtraSalario() {
		return ExtraSalario;
	}
	public void setExtraSalario(Double extraSalario) {
		ExtraSalario = extraSalario;
	}	
}

