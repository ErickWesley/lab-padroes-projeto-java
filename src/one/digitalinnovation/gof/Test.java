package one.digitalinnovation.gof;

public class Test {

    public static void main (String [] args) {
        //Testes relacionados ao Design Pattern Singleton:
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonHolder holder = SingletonHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonHolder.getInstancia();
        System.out.println(holder);

    }
}
