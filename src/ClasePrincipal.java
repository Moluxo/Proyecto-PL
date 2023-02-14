import java.io.*;
import org.antlr.v4.runtime.*;
/*
El nombre ClasePrincipal es arbitrario, escoge el que prefieras.
Sustituye Numbers por el nombre del fichero que contiene la especificación de la gramática ANTLR
(extensión .g4)
*/
public class ClasePrincipal {
    public static void main(String[] args) {
        try{
// Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
// Crear el objeto correspondiente al analizador léxico con el fichero de
// entrada
            NumbersLexer analex = new NumbersLexer(input);
// Identificar al analizador léxico como fuente de tokens para el
// sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);
// Crear el objeto correspondiente al analizador sintáctico
            NumbersParser anasint = new NumbersParser(tokens);
/*
Si se quiere pasar al analizador algún objeto externo con el que trabajar,
este deberá ser de una clase del mismo paquete
Aquí se le llama "sintesis", pero puede ser cualquier nombre.
NumbersParser anasint = new NumbersParser(tokens, new sintesis());
*/
/*
Comenzar el análisis llamando al axioma de la gramática
Atención, sustituye "AxiomaDeLaGramatica" por el nombre del axioma de tu
gramática
*/          //arriba pongo el codigo de inicio
            System.out.print("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<title>Twitter format</title>\n" +
                    "<style>\n" +
                    ".usr {color:rgb(19,189,72);}\n" +
                    ".link {color:rgb(55,40,244);}\n" +
                    ".hashtag {color:rgb(107,103,189);}\n" +
                    ".sobrante {color:rgb(255,0,0);}\n" +
                    "</style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<p>");
            anasint.r();//el analizador sintactico empieza -->
        } catch (org.antlr.v4.runtime.RecognitionException e) {
//Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
//Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
//Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}