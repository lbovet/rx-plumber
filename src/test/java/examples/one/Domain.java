package examples.one;

import io.reactivex.Flowable;
import li.chee.rx.plumber.Box;

/**
 * Example domain
 */
public class Domain {

    public static Flowable<Integer> input() {
        return Flowable.range(1, 4);
    }

    public static void print(Object it) {
        System.out.println(it);
    }

    public static <T> Box<String> renderThread(Box<T> box) throws InterruptedException {
        return Box.wrap(box.getValue() + " ["+Thread.currentThread().getName() +"]");
    }

    public static <T> Box<String> renderSize(Box<T> box) {
        return Box.wrap(box.getValue() + " / " + box.getContext(Long.class));
    }
}
