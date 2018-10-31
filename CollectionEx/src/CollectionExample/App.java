package CollectionExample;

import java.util.*;

public class App {
    Random rnd = new Random();
    FirstExercise firstExercise = new FirstExercise();

    public static void main(String[] args) {
        App app = new App();
//        app.makeList();
//        app.makeLinkedList();
//        app.makeSet();
        app.makeHashMap();
    }

    public void makeList(){

        int [] array;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i, rnd.nextInt(1000));
        }

        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
        }

//        System.out.println(list.toString());
    }

    public void makeLinkedList(){
        LinkedList<Character> linkedList = new LinkedList<Character>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(firstExercise.charGenerator());
        }
        System.out.println(linkedList.toString());
    }

    public void makeSet(){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 100; i++) {
            set.add(rnd.nextInt(10000));
        }

        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        for(Iterator iterator = set.iterator(); iterator.hasNext();){
            Object element = iterator.next();
            System.out.print(element + " ");
        }
    }

    public void makeHashMap(){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < 100; i++){
            map.put(firstExercise.charGenerator(), rnd.nextInt(1000));
        }

        for (Map.Entry<Character,Integer> pair : map.entrySet()){
            System.out.println("Key = " + pair.getKey() +
                    ", Value = " + pair.getValue());
    }

}

}
