package exercicio_04;
/**
 *
 * @author RafaelMR
 */
public class TesteBicicleta {
    public static void main(String[] args) {
        Bicicleta b = new Bicicleta(0,1);
        b.aceleraBicicleta();
        b.aceleraBicicleta();
        b.aceleraBicicleta();
        b.aceleraBicicleta();
        System.out.println("A velocidade da bicicleta é: "+b.velocidadeAtual());
    }
}
