package clienteservidorlaboratorio;

import java.io.IOException;

/**
 *
 * @author Hawer Forero
 */
public class MainCliente {
    
    public static void main(String[] args) throws IOException
    {
        Cliente cli = new Cliente(); //Se crea el cliente

        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente
    }
    
}