package test;
public class Auto {
	String modelo;
	int precio;
	Asiento asientos[] = new Asiento[4];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		return (this.asientos.length);
		
	}
	
	public String verificarIntegridad() {	
		for (Asiento i : this.asientos) {
			if (this.registro == i.registro && this.registro == this.motor.registro && this.motor.registro == i.registro)
				return "Auto original";
			else
				return "Las piezas no son originales";
			}
	}
}
