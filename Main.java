package listas;

public class Main 
{

    public static void main(String[] args) 
    {
        Fibonacci fibonacci = new Fibonacci();
        Splitter splitter = new Splitter();
        System.out.println("Sucesion de Fibonacci hasta el primer valor por encima de 1,000,000:");
        System.out.println(fibonacci.generarSucesion());
        System.out.println(splitter.soloParesFibonacci());
        System.out.println(splitter.soloImparesFibonacci());
    }

}