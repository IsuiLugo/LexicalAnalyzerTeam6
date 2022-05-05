package Clases;

import java.util.ArrayList;

public class Tokens {
    //Variables globales
    String currentToken;
    ArrayList<String> Tokens = new ArrayList<String>();
    ArrayList<String> Lexema = new ArrayList<String>();
    ArrayList<String> Cadena = new ArrayList<String>();
    ArrayList<String> TokenError = new ArrayList<String>();
    ArrayList<String> TokenComentario = new ArrayList<String>();
    ArrayList<Integer> Linea = new ArrayList<Integer>();
    
    
    //TokenA
    public String TokenA(String currenteSymbol){
     currentToken = "";
        switch (currenteSymbol) {
            case "a":
                //Hace algo
                break;
            default:
               
        }
     
     return currentToken;
    }
}
