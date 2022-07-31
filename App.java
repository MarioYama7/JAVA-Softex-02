
package Softex02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {

    
     
    public static void main(String[] args) throws Exception{
        criarArquivoBinarioSerializado();
    }
    
    private static void criarArquivoBinarioSerializado() throws FileNotFoundException, IOException{
        Pessoa p1 = new Pessoa(1, "Fulano de Tal", 2000, "123456");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("arquivo.bin");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo.");
        } finally {
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e ) {
                    System.out.println("Erro ao fechar o arquivo");
                }
                
        }
            
    }
}
}
