
package procesadordelenguaje;

import java.io.*;

public class usaProcesador {
    
    public static void main(String[] args)throws IOException{
        
        ProcesadorDeLenguaje p = new ProcesadorDeLenguaje();
        
        File file = new File("/home/alessaurio/Documents/textos/1ARAH.txt");
        File file2 = new File("/home/alessaurio/Documents/textos/2ARAH.txt");
        File file3 = new File("/home/alessaurio/Documents/textos/3arah.txt");
        
        System.out.println("+--------------Palabras repetidas --------------+");
        System.out.println(p.totalPalabras(file));
        System.out.println(p.totalPalabras(file2));
        System.out.println(p.totalPalabras(file3));
        
        System.out.println("\n+--------------Palabras sin repetir-------------+");
        System.out.println(p.palabrasSinRepetir(file));
        System.out.println(p.palabrasSinRepetir(file2));
        System.out.println(p.palabrasSinRepetir(file3));
        
        System.out.println("\n+--------------Sílabas--------------------------+");
        System.out.println(p.totalSilabas(file));
        System.out.println(p.totalSilabas(file2));
        System.out.println(p.totalSilabas(file3));
        
        System.out.println("\n+-------------Caracteres------------------------+");
        System.out.println(p.totalCaracteres(file));
        System.out.println(p.totalCaracteres(file2));
        System.out.println(p.totalCaracteres(file3));
        
        File[] files ={file, file2, file3};
        
        System.out.println("\n+------- Palabras sin repetir en "+files.length+" escritos -----+");
        p.totalPalabrasSinRepetir(files);
        
    }
}
