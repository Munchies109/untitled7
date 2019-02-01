import java.util.Arrays;

public final class MyClass {



    public final static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        Arrays.stream(myNumbers).flatMapToInt(Arrays::stream).forEach(System.out::println);
            }
        }

