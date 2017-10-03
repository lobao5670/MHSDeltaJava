package mhs.multiplicacao.br.mhs.deltaj;

/*** added by dMultiplicacao
 */
public class Main {
	public static void main(String args []) {
		ValorInteiro n1 = new ValorInteiro(3);
		ValorInteiro n2 = new ValorInteiro(2);
		ExpressaoMultiplicacao teste = new ExpressaoMultiplicacao(n1, n2);
		System.out.println(teste.avaliar().valor());
	}
}