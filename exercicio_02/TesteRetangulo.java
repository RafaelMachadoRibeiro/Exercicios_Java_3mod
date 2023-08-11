package exercicio_02;
/**
 *
 * @author RafaelMR
 */
public class TesteRetangulo {

    public static void main(String[] args) {
        retangulo meuRetangulo = new retangulo();
        meuRetangulo.base = 30;
        meuRetangulo.altura = 40;
        System.out.println("A área do retângulo é:"+meuRetangulo.area());
    }
    
}
