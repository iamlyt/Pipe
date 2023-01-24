import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pipe<T> {

    private List<T> pipeList;
    // parameterless constructor
    public Pipe() {
        pipeList = new ArrayList<>();
    }

    // puts object into pipe
    public void putIntoPipe(T value) {
        pipeList.add(value);
    }

    // take out value that's been in there the LONGEST
    public T takeFromPipe() {
        // return T type parameter
        // returns value that's been in pipe LONGEST
        Iterator<T> itr = pipeList.iterator();
        while (itr.hasNext()) {
            T next = itr.next();
            if (next.equals(pipeList.get(0))) {
                itr.remove();
            }
            return next;
        }
        return null;
    }

    public boolean isInPipe() {
        if (!(pipeList.isEmpty())) {
            return true;
        }
        return false;
    }

    public void printAll() {
        int count = 0;
        for (T i : pipeList) {
            System.out.println(i + " - index: " + count);
            count++;
        }
    }
}
