package mhs.subtracao.br.mhs.deltaj;

/*** added by dSubtracao
 */
public class Main {
	public static void main(String args []) {
		ValorInteiro n1 = new ValorInteiro(1);
		ValorInteiro n2 = new ValorInteiro(2);
		ExpressaoSubtracao teste = new ExpressaoSubtracao(n1, n2);
		System.out.println(teste.avaliar().valor());
	}
}