/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author eduar
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //for (int cc=0; cc<=100; cc+=10) {
        for (int cc=5; cc<=15; cc+=2) {
          //System.out.println("Camablota");
            System.out.println(cc);
        }
        /*
        O código acima, é a mema coisa que o código abaixo.
        int cc=0;
        while (cc<4) {
          System.out.print("Cambalhota");
            cc++;
        }
        
        */
    }
    
    /*for (int cc=5; cc<=15; cc+=2){
        System.out.println(cc);
}
    for (int cc=5; cc<=15; cc-=2) {
        System.out.print(cc);
    }
    */
}
