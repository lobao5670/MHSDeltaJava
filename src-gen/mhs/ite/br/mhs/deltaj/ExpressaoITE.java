package mhs.ite.br.mhs.deltaj;

/*** added by dITE
 */
public class ExpressaoITE implements Expressao {
	private Expressao condicao;
	private Expressao clausThen;
	private Expressao clausElse;
	public ExpressaoITE(Expressao condicao, Expressao clausThen, Expressao
		clausElse) {
		this.condicao = condicao;
		this.clausThen = clausThen;
		this.clausElse = clausElse;
	}
	public Valor avaliar() {
		Valor cond = condicao.avaliar();
		Valor cThen = clausThen.avaliar();
		Valor cElse = clausElse.avaliar();
		if((( ValorBooleano ) cond).valor()) {
			if(cThen instanceof ValorInteiro) return new ValorInteiro((( ValorInteiro )
					cThen).valor());
			else return new ValorBooleano((( ValorBooleano ) cThen).valor());
		}
		else {
			if(cElse instanceof ValorInteiro) return new ValorInteiro((( ValorInteiro )
					cElse).valor());
			else return new ValorBooleano((( ValorBooleano ) cElse).valor());
		}
	}
}