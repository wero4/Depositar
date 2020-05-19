package depositar;

import java.math.BigDecimal;
import java.util.LinkedList;

public class CajaDeAhorroPesos {

	// private Tarjeta tarjeta;
	private BigDecimal saldo;
	private String alias;
	private LinkedList<Movimientos> movimientos;

	// Constructor
	public CajaDeAhorroPesos(String alias) {
		// this.tarjeta = tarjeta;
		this.alias = alias;
		saldo = BigDecimal.ZERO;
		movimientos = new LinkedList<Movimientos>();
	}

	// Metodos
	public String getAlias() {
		return alias;
	}

	public void ingresarEfectivo(BigDecimal montoIngresado) {
		saldo = saldo.add(montoIngresado);
	}

	public BigDecimal consultarSaldo() {

		return saldo;
	}

	public void consultarMovimientos() {

		for (Movimientos x : movimientos) {
			System.out.println(x.getFecha() + "," + " " + x.getConceptos() + "," + " " + x.getCuenta().getAlias() + ","
					+ " " + x.getImporte());
		}
	}

	public LinkedList<Movimientos> getMovimientos() {
		return movimientos;
	}

}
