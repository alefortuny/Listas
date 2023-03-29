package listas;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci 
{	
    public List<Integer> generarSucesion() 
    {
        List<Integer> sucesion = new ArrayList<Integer>();
        int valorInicial = 0;
        int valorActual = 1;
        sucesion.add(valorInicial);
        sucesion.add(valorActual);
        int siguienteValor = valorInicial + valorActual;
        do
        {
        	sucesion.add(siguienteValor);
        	valorInicial = valorActual;
        	valorActual = siguienteValor;
        	siguienteValor = valorInicial + valorActual;
        	
        }
        while (siguienteValor < 1000000);
        sucesion.add(siguienteValor);
        return sucesion;
    }
}