package day34;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Lambda03 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);
        System.out.println(maxEl1(list));
        maxEl2(list);
        maxEl3(list);
        maxEl4(list);
        maxEl5(list);
        minEl1(list);
        minEl2(list);
        minSevenEvenEl(list);
        printAllSorted(list);
        System.out.println();
        maxWithSort(list);
        minWithSort(list);
    }
    //Create a method to find the maximum value from the list, use "Structured Programming"
    public static int maxEl1(List<Integer> list){
        Collections.sort(list);
        int max = list.get(list.size()-1);
        return max;
    }
    //Create a method to find the maximum value from the list, use "Functional Programming"
    //Lambda Expression
    public static void maxEl2(List<Integer> list){
        int max = list.
                     stream().
                     reduce(Integer.MIN_VALUE,(x,y)->x>y ? x : y);
        System.out.println(max);
    }
    //Method Reference
    public static void maxEl3(List<Integer> list){
        int max = list.
                stream().
                reduce(Integer.MIN_VALUE,Integer::max);
        System.out.println(max);
    }
    //Method Reference
    public static void maxEl4(List<Integer> list){
        int max = list.
                stream().
                reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(max);
    }
    //Method Reference
    public static void maxEl5(List<Integer> list){
        int max = list.
                stream().
                reduce(Integer.MIN_VALUE,Lambda03::maxEl6);
        System.out.println(max);
    }
    public static int maxEl6(int x, int y){
        return x>y ? x : y;
    }

    //Create a method to find the minimum value from the list, use "Functional Programming"
    //Lambda Expression
    public static void minEl1(List<Integer> list){
        int min = list.stream().reduce(Integer.MAX_VALUE, (x,y)->x<y ? x : y);
        System.out.println(min);
    }
    //Method Reference
    public static void minEl2(List<Integer> list){
        int min = list.stream().reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(min);
    }

    //Create a method to find the minimum value which is greater than 7 and even from the list, use "Functional Programming"
    public static void minSevenEvenEl(List<Integer> list){
        int min = list.stream().filter(t->(t>7 && t%2==0)).reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }

    //Create a method to print the list elements in natural order
    public static void printAllSorted(List<Integer> list){
        list.stream().sorted().forEach(Lambda01::print);
    }

    //Create a method to find the maximum value by sorting
    public static void maxWithSort(List<Integer> list){
        Optional<Integer> max = list.stream().sorted().reduce((x, y)->y);
        System.out.println(max);
    }
    //Create a method to find the minimum value by sorting
    public static void minWithSort(List<Integer> list){
        Optional<Integer> max = list.stream().sorted().reduce((x, y)->x);
        System.out.println(max);
    }

}
