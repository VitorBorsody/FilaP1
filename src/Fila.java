public class Fila {

    private final int Capacidade;
    private int Tamanho;
    private int First;
    private int Last;
    private int [] fila;

    public Fila(int capacidade) {
        Capacidade = capacidade;
        Tamanho = 0;
        Last = -1;
        First = 0;
        this.fila = new int[capacidade];
    }
    public void Enqueue (int e1) {
        if (Tamanho == Capacidade) {
            System.out.println("A fila está cheia, portanto não dará para adicionar valores!");
        } else {
            Tamanho++;
            Last = (Last + 1) % Capacidade;
            fila[Last] = e1;

        }
    }
        public void Dequeue(){
            if(Tamanho==0){
                System.out.println("Não há elementos na fila!!!");

        }
            else {
                Tamanho--;
                First = (First + 1)%Capacidade;

            }


    }
    public void Exibir(){
        if(Tamanho==0){
            System.out.println("A fila está vazia!!!");

        }
        else {
            System.out.println("Elementos da fila: ");

            for(int i=0; i<Tamanho; i++){
                System.out.print(fila[(First + i)%Capacidade] + " ");
                System.out.println(" ");
            }

        }
    }
    public int getLast(){
        return fila[Last];
    }
    public int getFirst(){
        return fila[First];
    }
}
