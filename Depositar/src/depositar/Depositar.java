package depositar;

import java.math.BigDecimal;

public class Depositar {

	private BigDecimal pesosDepositados;
	// private BigDecimal dolaresDepositados;
	private CajaDeAhorroPesos cuenta;
	private Movimientos movimiento;

	public Depositar(CajaDeAhorroPesos cuenta) {
		pesosDepositados = BigDecimal.ZERO;
		// dolaresDepositados = BigDecimal.ZERO;
		this.cuenta = cuenta;

	}

	public void depositarPesos(BigDecimal pesosDepositados) {
		this.pesosDepositados = pesosDepositados;
		cuenta.ingresarEfectivo(this.pesosDepositados);
		generarMovimiento();
	}

	private void generarMovimiento() {
		movimiento = new Movimientos("XXXX", this.pesosDepositados, cuenta);
		if (cuenta.getMovimientos().size() == 10) {
			cuenta.getMovimientos().removeFirst();
		}
		cuenta.getMovimientos().add(movimiento);
	}

}
