package ar.basica2.tp3;

public class ServicioImpuesto{
	
	private Empleado empleado;
	private Double salario;
	private Double salarioConDescuento;
	private Double topeSalarial = 30.000;
	private Double impuesto = 2.000;
	
	public Double obtenerImpuestos(Empleado empleado){
		
		if(this.salario>=this.topeSalarial){
			this.salarioConDescuento = this.salario - this.impuesto;
		}
		return salarioConDescuento;	
	}

	public Empleado getEmpleado() {
		return empleado;
	}
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
}

