import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        System.out.println("Prueba 1");
        ArrayList<Object> vector= new ArrayList<>();

        for(int x=0;x<10;x++){
            vector.add(x);
        }

        for(int x=0;x<vector.size();x++){
            System.out.println(vector.get(x));
        }
    }
}
