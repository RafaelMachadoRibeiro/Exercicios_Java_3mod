/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_01;

/**
 *
 * @author 20222TPMI0183
 */
public class TesteConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta minhaConta, contaPaulo;
        minhaConta = new Conta();
        contaPaulo = new Conta();
        minhaConta.dono = "Duke";
        minhaConta.saldo = 1000.0;
        contaPaulo.saldo = 13000.00;
        System.out.println("Saldo atual R$" + minhaConta.saldo);
    }
    
}
