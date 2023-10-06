public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        // Coin
        /*
        Coin coin = new Coin();
        System.out.println(coin);
        */
        // Variables primitivas
        int num1 = 5;
        int num2 = 12;

        num2 = num1;
        num1 = 10;

        System.out.println("***Variables primitivas");
        System.out.println(num1);
        System.out.println(num2);

        // Variables de objeto
        Numero n1 = new Numero();
        n1.numero = 5;

        Numero n2 = new Numero();
        n2.numero = 12;
        n2 = n1;

        n1.numero = 10;

        System.out.println(n1.numero);
        System.out.println(n2.numero);
    }
}

class Numero {
    int numero;
}

