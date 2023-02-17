
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
		return (asientos.length);
		
	}
	
	String verificarIntegridad() {	
		String PS = "Las piezas no son originales";
		for (Asiento i : asientos) {
			if (this.registro == i.registro && this.registro == motor.registro && motor.registro == i.registro)
				PS = "Auto original";
			}
		return PS;
	}
}
