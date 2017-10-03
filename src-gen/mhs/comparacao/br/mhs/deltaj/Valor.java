package mhs.comparacao.br.mhs.deltaj;

/*** added by dBase
 */
public abstract class Valor<T> implements Expressao {
	private T valor;
	public Valor(T valor) {
		this.valor = valor;
	}
	public T valor() {
		return valor;
	}
	public Valor<T> avaliar() {
		return this;
	}
}