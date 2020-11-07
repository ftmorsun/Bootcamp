package day34;
import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);

        squareEl1(list);
        System.out.println();
        squareEl2(list);
        System.out.println();
        squareEl3(list);
        System.out.println();
        squareOddEl(list);
        System.out.println();
        cubeOfEven1(list);
        System.out.println();
        cubeOfEven2(list);
        System.out.println();
        System.out.println(sumOfAll1(list));
        System.out.println(sumOfAll2(list));
        System.out.println(sumOfAll3(list));
        System.out.println(sumOfSqrtEvenEl(list));
        System.out.println(multiplyOdd1(list));
        System.out.println(multiplyOdd2(list));
        System.out.println(multiplyOdd3(list));
    }

    //Create a method to print the squares of every element on the console in the same line with a space between the elements
    //Lambda Expresssion
    public static void squareEl1(List<Integer> list){
        list.stream().map(t->t*t).forEach(t-> System.out.print(t + " "));
    }
    //Method Reference with my own method
    public static void squareEl2(List<Integer> list){
        list.stream().map(Lambda02::findSquare).forEach(Lambda01::print);
    }
    public static int findSquare(int t){
        return t*t;
    }
    //Method Reference with Java method
    public static void squareEl3(List<Integer> list){
        list.stream().map(Lambda02::findSquare).forEach(System.out::print);
    }

    //Create a method to print the squares of odd elements on the console in the same line with a space between the elements
    public static void squareOddEl(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(Lambda02::findSquare).forEach(Lambda01::print);
    }

    //Create a method to print the cubes of even elements on the console like "The cube of 4 is 64"
    //Lambda Expression
    public static void cubeOfEven1(List<Integer> list){
        list.stream().filter(t->t%2==0).map(t->"The cube of " + t + " is " + t*t*t).forEach(System.out::println);
    }
    //Method Reference
    public static void cubeOfEven2(List<Integer> list){
        list.stream().filter(t->t%2==0).map(Lambda02::findCube).forEach(System.out::println);
    }
    public static String findCube(int t){
        return "The cube of " + t + " is " + t*t*t;
    }

    //Find the sum of all elements in the given list
    //Lambda Expression
    public static int sumOfAll1(List<Integer> list){
        return list.stream().reduce(0,(x,y)->x+y);
    }
    //Method Reference
    public static int sumOfAll2(List<Integer> list){
        return list.stream().reduce(0,Integer::sum);
    }
    //Method Reference
    public static int sumOfAll3(List<Integer> list){
        return list.
                stream().
                reduce(0,Math::addExact);
    }

    //Find the sum of square roots of even elements in the given list
    public static double sumOfSqrtEvenEl(List<Integer> list){
        return list.
                stream().
                filter(t->t%2==0).
                map(Math::sqrt).
                reduce(0.0,Double::sum);
    }

    //Find the multiplication of all odd elements int given list
    //Lambda Expression
    public static int multiplyOdd1(List<Integer> list){
        return list.
                stream().
                filter(t->t%2!=0).
                reduce(1,(x,y)->x*y);
    }
    //Method Reference
    public static int multiplyOdd2(List<Integer> list){
        return list.
                stream().
                filter(t->t%2!=0).
                reduce(1,Math::multiplyExact);
    }
    //Method Reference by your own multiplication method
    public static int multiplyOdd3(List<Integer> list){
        return list.
                stream().
                filter(t->t%2!=0).
                reduce(1,Lambda02::multiply);
    }
    public static int multiply(int x, int y){
        return x*y;
    }

}
