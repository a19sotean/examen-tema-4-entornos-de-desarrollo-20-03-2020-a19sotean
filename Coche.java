/**
 * @author Andrea
 */
/*Refactorizaci√≥n
Extrae una superclase Veh√≠culo con los campos
	num_serie
	fabricante
	color
y los m√©todos
	getNum_serie(), setNum_serie()
	getFabricante(), setFabricante()
	getColor(), setColor()*/

/**
 * 
 * @author Andrea
 * Tenemos que color puede ser rojo, azul, verde, amarillo o naranja
 *
 */
enum Color {
	ROJO, AZUL, VERDE, AMARILLO, NARANJA
};

/**
 * 
 * @author Andrea
 * En coche tenemos una superclase extendida y es VehÌculo
 *
 */
public class Coche extends VehÌculo {
	private int cilindrada;
	protected Coche(int num_serie, int cilindrada, String fabricante, Color color) {
		this.num_serie = num_serie;
		this.cilindrada = cilindrada;
		this.fabricante = fabricante;
		this.color = color;
	}

	/**
	 * @author Andrea
	 * @return si es cilindrada o no
	 */
	public int getCilindrada() {
		return cilindrada;
	}

/**
 * @author Andrea
 * @param cilindrada
 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
