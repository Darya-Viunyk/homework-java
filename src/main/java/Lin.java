import java.util.LinkedList;

public class Lin {
    public static void main(String[] ards){
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.66f);
        numbers.add(47.3f);
        numbers.add(13.7f);

        for(Float el : numbers)
            System.out.println(el);
    }
}
