package br.com.cdc.loja.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Preco {

	@Column(scale = 2)
	private BigDecimal valor;
	@Enumerated(EnumType.STRING)
	private TipoDeLivro tipoDeLivro;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoDeLivro getTipoDeLivro() {
		return tipoDeLivro;
	}

	public void setTipoDeLivro(TipoDeLivro tipoDeLivro) {
		this.tipoDeLivro = tipoDeLivro;
	}

}
