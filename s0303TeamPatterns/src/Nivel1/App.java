package Nivel1;

import static Nivel1.Floristeria.crearFloristeria;

public class App {

    public static void main(String[]args){


        Floristeria floristeria = new Floristeria("Floristeria 1");

        floristeria.crearStock("F");

        Stock stock = new StockArbol();

        stock.crearArticulo();
        stock.crearArticulo();

        stock.imprimirStock();
        stock.mostrarCantidadStock();
        stock.eliminarArticulo(1);
        stock.mostrarCantidadStock();
        stock.imprimirStock();
        System.out.println(stock.sumatoriaValorStock());

    }

}
