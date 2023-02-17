
package test;
public class Auto {
	String modelo;
	int precio;
	Asiento asientos[] = new Asiento[10];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int length = 0;
		for(int i = 0; i < asientos.length; i++) {	
			if (asientos[i] != null) {
					length++;
			}
		}
		return (length);
	}

	String verificarIntegridad() {	
		String PS = "Las piezas no son originales";
		for (int i = 0; i < asientos.length; i++) {
			if(asientos[i] != null) {
				if (this.registro == asientos[i].registro && this.registro == motor.registro && motor.registro == asientos[i].registro)
					PS = "Auto original";
				}
			}
		return PS;
	}
}
