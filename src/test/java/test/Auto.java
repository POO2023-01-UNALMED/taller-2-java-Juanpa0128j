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
		String PS = null;
		for (Asiento i : this.asientos) {
			if (this.registro == i.registro && this.registro == this.motor.registro && this.motor.registro == i.registro)
				PS = "Auto original";
			else
				PS = "Las piezas no son originales";
			}
		
		return PS;
	}
}
