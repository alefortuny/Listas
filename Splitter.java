package listas;

import java.util.ArrayList;
import java.util.List;

public class Splitter 
{
	
	public static Fibonacci serieFibonacci = new Fibonacci();
	
	//separa los números pares para cualquier lista
    public static List<Integer> soloPares(List<Integer> lista) 
    {
        List<Integer> listaPares = new ArrayList<>();

        for (Integer numero : lista) 
        {
            if (numero % 2 == 0) 
            {
                listaPares.add(numero);
            }
        }

        return listaPares;
    }
    
  //separa los números impares para cualquier lista
    public static List<Integer> soloImpares(List<Integer> lista) 
    {
        List<Integer> listaImpares = new ArrayList<>();

        for (Integer numero : lista) 
        {
            if (numero % 2 != 0) 
            {
                listaImpares.add(numero);
            }
        }

        return listaImpares;
    }
    
    //separa los números pares para la serie creada por la clase fibonacci
    public List<Integer> soloParesFibonacci() 
    {
        List<Integer> listaSerie = serieFibonacci.generarSucesion();
        List<Integer> listaPares = new ArrayList<>();
        
        for (Integer numero : listaSerie) 
        {
            if (numero % 2 == 0) 
            {
                listaPares.add(numero);
            }
        }

        return listaPares;
    }
    
  //separa los números impares para la serie creada por la clase fibonacci
    public List<Integer> soloImparesFibonacci() 
    {
        List<Integer> listaSerie = serieFibonacci.generarSucesion();
        List<Integer> listaPares = new ArrayList<>();
        
        for (Integer numero : listaSerie) 
        {
            if (numero % 2 != 0) 
            {
                listaPares.add(numero);
            }
        }

        return listaPares;
    }
}