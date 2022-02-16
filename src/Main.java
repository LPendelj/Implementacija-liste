public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.insert(10);
        lista.insert(52);
        lista.insert(51);
        lista.insert(323);
        lista.insert(2);
        lista.insert(7);

        lista.show();

        lista.addFirst(1);
        lista.insertLast(6);


      // System.out.println("Head je " + lista.head.getData());

        lista.show();

        lista.insertAtStart(35);

        lista.show();

        System.out.println(System.getProperty("user.dir"));


    }
}
