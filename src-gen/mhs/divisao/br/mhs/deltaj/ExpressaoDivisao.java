package mhs.divisao.br.mhs.deltaj;

/*** added by dDivisao
 */
public class ExpressaoDivisao implements Expressao {
	private Expressao esquerda;
	private Expressao direita;
	public ExpressaoDivisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	public Valor avaliar() {
		Valor left = esquerda.avaliar();
		Valor right = direita.avaliar();
		return new ValorInteiro((( ValorInteiro ) left).valor() /(( ValorInteiro )
				right).valor());
	}
}