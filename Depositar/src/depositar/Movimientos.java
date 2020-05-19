package depositar;

import java.time.LocalDate;
import java.math.BigDecimal;

public class Movimientos {

	private LocalDate fecha;
	private String conceptos;
	private BigDecimal importe;
	private CajaDeAhorroPesos cuenta;
	
	public Movimientos(String conceptos, BigDecimal importe, CajaDeAhorroPesos cuenta) {
		fecha = LocalDate.now();
		this.conceptos = conceptos;
		this.importe = importe;
		this.cuenta = cuenta;
		
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getConceptos() {
		return conceptos;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public CajaDeAhorroPesos getCuenta() {
		return cuenta;
	}

	
	
	
}
