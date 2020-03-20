/**
 * 
 * @author Andrea
 * 
 */
public class Veh�culo {

	/**
	 * @author Andrea
	 * @param num_serie
	 * @param fabricante
	 * @param color
	 */
	protected int num_serie;
	protected String fabricante;
	protected Color color;

	
	public Veh�culo() {
		super();
	}

/**
 * @author Andrea
 * @return el color del veh�culo
 */
	public Color getColor() {
		return color;
	}

/**
 * @author Andrea
 * @param color
 */
	public void setColor(Color color) {
		this.color = color;
	}

/**
 * @author Andrea
 * @return el n�mero de la serie
 */
	public int getNum_serie() {
		return num_serie;
	}

/**
 * @author Andrea
 * @param num_serie
 */
	public void setNum_serie(int num_serie) {
		this.num_serie = num_serie;
	}

/**
 * @author Andrea
 * @return el fabricante del coche
 */
	public String getFabricante() {
		return fabricante;
	}

/**
 * @author Andrea
 * @param fabricante
 */

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}