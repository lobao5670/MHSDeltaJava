package mhs.ite.br.mhs.deltaj;

/*** added by dITE
 */
public class Main {
	public static void main(String args []) {
		ValorBooleano cond = new ValorBooleano(true);
		ValorInteiro n1 = new ValorInteiro(1);
		ValorInteiro n2 = new ValorInteiro(2);
		ExpressaoITE teste = new ExpressaoITE(cond, n1, cond);
		System.out.println(teste.avaliar().valor());
	}
}