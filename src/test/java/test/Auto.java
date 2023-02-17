
package test;
public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		return (this.asientos.length);
		
	}
	
	String verificarIntegridad() {	
		String PS = "Las piezas no son originales";
		for (Asiento i : this.asientos) {
			if (this.registro == i.registro && this.registro == this.motor.registro && this.motor.registro == i.registro)
				PS = "Auto original";
			}
		return PS;
	}
}
