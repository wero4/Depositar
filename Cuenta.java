package atm;

import java.math.BigDecimal;
import java.util.LinkedList;

public abstract class Cuenta {

	private Cliente cliente;
	private BigDecimal saldo;
	private String alias;
	private LinkedList<Movimiento> movimientos;
}
