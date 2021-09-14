import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        for ( int i : array ) {
            if (i > 0 && i % 2 == 0) {
                System.out.println(i);
            }
            Arrays.sort( array );

        }

        class MainStream {

            List<Integer> intList = Arrays.asList( 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4 );

            Stream<Integer> stream = intList.stream();

            void MainStream () {
                stream
                        .filter( s -> s > 0 )
                        .filter( s -> s % 2 == 0 )
                        .sorted( Comparator.naturalOrder() )
                        .forEach( System.out::println );
            }
        }

    }
}






