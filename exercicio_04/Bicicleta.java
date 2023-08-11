package exercicio_04;
/**
 *
 * @author RafaelMR
 */
public class Bicicleta {
    int velocidade;
    int marcha;
    
    Bicicleta(){
        velocidade = 0;
        marcha = 1;
    }
    Bicicleta(int v, int m) {
        velocidade = v;
        marcha = m;
    }
    
    public void aceleraBicicleta(){
        velocidade++;
    }
    public void freiaBicicleta() {
        velocidade--;
    }
    public void alteraMarcha(int novaMarcha){
        marcha = novaMarcha;
    }
    public int velocidadeAtual(){
        return velocidade;
    }
    public int marchaAtual(){
        return marcha;
    }
}
