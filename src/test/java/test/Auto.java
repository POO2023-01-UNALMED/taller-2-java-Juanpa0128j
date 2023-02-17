
package test;
public class Auto {
	String modelo;
	int precio;
	Asiento asientos[] = new Asiento[10];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int cantidadAsientos() {
		return (this.asientos.length);
		
	}
	
	public String verificarIntegridad() {	
		String PS = "Las piezas no son originales";
		for (Asiento i : this.asientos) {
			if (this.registro == i.registro && this.registro == this.motor.registro && this.motor.registro == i.registro)
				PS = "Auto original";
			}
		return PS;
	}
}
