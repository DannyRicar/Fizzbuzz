import java.util.Iterator;

public class FizzIterable {

    public class FizzbuzzIterable implements Iterable<String> {
        @Override
        public Iterator<String> iterator() {
            return new FizzbuzzIterable();
        }
    }

}
