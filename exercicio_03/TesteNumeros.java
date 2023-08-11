package exercicio_03;
/**
 *
 * @author RafaelMR
 */
public class TesteNumeros {
    public static void main(String[] args) {
      numeros X = new numeros();
      X.umInt = 2;
      X.umDouble = 3.14;
        System.out.println(X.umInt);
        System.out.println(X.umDouble);
        System.out.println(X.calculaConta());
    }
}
