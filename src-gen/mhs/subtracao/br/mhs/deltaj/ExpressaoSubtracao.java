package mhs.subtracao.br.mhs.deltaj;

/*** added by dSubtracao
 */
public class ExpressaoSubtracao implements Expressao {
	private Expressao esquerda;
	private Expressao direita;
	public ExpressaoSubtracao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	public Valor avaliar() {
		Valor left = esquerda.avaliar();
		Valor right = direita.avaliar();
		return new ValorInteiro((( ValorInteiro ) left).valor() -(( ValorInteiro )
				right).valor());
	}
}