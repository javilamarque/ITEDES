import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Ejercicio2{

    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            vector.add(ThreadLocalRandom.current().nextInt(0, 10 + 1));
        }
        for(int i = 0; i < vector.size()-1; i++){
            for(int k = i; k < vector.size(); k++){
                if(vector.get(i) < vector.get(k)){
                    Integer aux = vector.get(k);
                    vector.set(k, vector.get(i));
                    vector.set(i, aux);
                }
            }
        }
        System.out.println(vector);
        System.out.println();
        System.out.println();

        for(int i = 0; i < 100; i++){
            vector.add(ThreadLocalRandom.current().nextInt(0, 100 + 1));
        }

        for(int i = 0; i < vector.size()-1; i++){
            for(int k = i; k < vector.size(); k++){
                if(vector.get(i) < vector.get(k)){
                    Integer aux = vector.get(k);
                    vector.set(k, vector.get(i));
                    vector.set(i, aux);
                }
            }
        }
        System.out.println(vector);
        System.out.println();
        System.out.println();

        for(int i = 0; i < 1000; i++){
            vector.add(ThreadLocalRandom.current().nextInt(0, 1000 + 1));
        }

        for(int i = 0; i < vector.size()-1; i++){
            for(int k = i; k < vector.size(); k++){
                if(vector.get(i) < vector.get(k)){
                    Integer aux = vector.get(k);
                    vector.set(k, vector.get(i));
                    vector.set(i, aux);
                }
            }
        }
        System.out.println(vector);
        System.out.println();
        System.out.println();

        for(int i = 0; i < 10000; i++){
            vector.add(ThreadLocalRandom.current().nextInt(0, 10000 +1));
        }

        for(int i = 0; i < vector.size()-1; i++){
            for(int k = i; k < vector.size(); k++){
                if(vector.get(i) < vector.get(k)){
                    Integer aux = vector.get(k);
                    vector.set(k, vector.get(i));
                    vector.set(i, aux);
                }
            }
        }
        System.out.println(vector);
    }
}