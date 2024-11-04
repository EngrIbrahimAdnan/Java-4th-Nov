import java.util.List;

public class SummationPractice{

    public static void main(String[] args){
        int value =SummationPractice.calculate(List.of(1,42,17,2,10,50,12));
        System.out.println(value);
    }

    public static int calculate(List<Integer> test){
        int accum = 0;

        for (int j: test){
            accum+=j;
        }
        return accum;
    }
}