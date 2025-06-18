//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.Enqueue(1);
        fila.Enqueue(3);
        fila.Enqueue(5);
        fila.Enqueue(7);
        fila.Enqueue(9);
        fila.Dequeue();
        fila.Enqueue(11);
        int First = fila.getFirst();
        int Last = fila.getLast();
        System.out.println("Primeiro da fila: " + First);
        System.out.println("Último da fila: " + Last);
        fila.Exibir();
    }
}


