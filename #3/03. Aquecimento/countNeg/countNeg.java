import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class countNeg {

    static int countNeg(List<Integer> list){
        return list.stream().filter(x -> x < 0).collect(Collectors.toList()).size();
    }

    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList();
        List<Integer> lista2 = Arrays.asList(1,2,3,4,5);
        List<Integer> lista3 = Arrays.asList(1,-1,2,-3,4);
        List<Integer> lista4 = Arrays.asList(2,-2);
        List<Integer> lista5 = Arrays.asList(1,-1);
        List<Integer> lista6 = Arrays.asList(1,-3,-4,3,4,-5);
        System.out.println(countNeg(lista1) == 0);
        System.out.println(countNeg(lista2) == 0);
        System.out.println(countNeg(lista3) == 2);
        System.out.println(countNeg(lista4) == 1);
        System.out.println(countNeg(lista5) == 1);
        System.out.print(countNeg(lista6) == 3);
    }
    
}
