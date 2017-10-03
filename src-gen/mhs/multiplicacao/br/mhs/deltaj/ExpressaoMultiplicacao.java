package mhs.multiplicacao.br.mhs.deltaj;

/*** added by dMultiplicacao
 */
public class ExpressaoMultiplicacao implements Expressao {
	private Expressao esquerda;
	private Expressao direita;
	public ExpressaoMultiplicacao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	public Valor avaliar() {
		Valor left = esquerda.avaliar();
		Valor right = direita.avaliar();
		return new ValorInteiro((( ValorInteiro ) left).valor() *(( ValorInteiro )
				right).valor());
	}
}