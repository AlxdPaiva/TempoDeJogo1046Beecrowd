/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempodejogo1046beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class TempoDeJogo1046Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int Hi = teclado.nextInt();
        int Hf = teclado.nextInt();
        int res = 0;
        
        if (Hi > Hf) {
            res = (24-Hi)+(Hf);
        }
        
        if (Hi < Hf) {
            res = (24-Hi)+(Hf-24);
        }
        
        if (Hi == Hf){
            res = 24;
        }
        System.out.println("O JOGO DUROU "+ res +" HORA(S)");
    }
    
}
