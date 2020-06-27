import java.util.ArrayList;
import java.util.List;

class ListaNomes {

    public List<String> nomes = new ArrayDeque<>();

    public void add(){
        nomes.add("Geovani");
    }

    public void getPrimeiro(){
        
        nomes.poll();
    };
}

public class Sincronismo{
    public static void main(String[] args) {

        ListaNomes lista = new ListaNomes();
        lista.add();

        Runnable task = () -> lista.getPrimeiro();

        new Thread(task).start();
        new Thread(task).start();

    }
}