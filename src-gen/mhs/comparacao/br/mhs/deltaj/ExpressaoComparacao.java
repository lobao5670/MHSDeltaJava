package mhs.comparacao.br.mhs.deltaj;

/*** added by dCompare
 */
public class ExpressaoComparacao implements Expressao {
	private Expressao esquerda;
	private Expressao direita;
	private String operacao;
	public ExpressaoComparacao(Expressao esquerda, Expressao direita, String
		operacao) {
		this.esquerda = esquerda;
		this.direita = direita;
		this.operacao = operacao;
	}
	public Valor avaliar() {
		Valor left = esquerda.avaliar();
		Valor right = direita.avaliar();
		boolean result = true;
		switch(operacao) {
			case "==" : {
				if((( ValorInteiro ) esquerda).valor() ==(( ValorInteiro )
						direita).valor()) result = true;
				else result = false;
				break;
			}
			case ">" : {
				if((( ValorInteiro ) esquerda).valor() >(( ValorInteiro ) direita).valor())
				result = true;
				else result = false;
				break;
			}
			case "<" : {
				if((( ValorInteiro ) esquerda).valor() <(( ValorInteiro ) direita).valor())
				result = true;
				else result = false;
				break;
			}
			case ">=" : {
				if((( ValorInteiro ) esquerda).valor() >=(( ValorInteiro )
						direita).valor()) result = true;
				else result = false;
				break;
			}
			case "<=" : {
				if((( ValorInteiro ) esquerda).valor() <=(( ValorInteiro )
						direita).valor()) result = true;
				else result = false;
				break;
			}
			case "!=" : {
				if((( ValorInteiro ) esquerda).valor() !=(( ValorInteiro )
						direita).valor()) result = true;
				else result = false;
				break;
			}
		}
		return new ValorBooleano(result);
	}
}