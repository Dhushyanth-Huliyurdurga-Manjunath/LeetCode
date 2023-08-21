import java.util.*;

class OrderedStream {
    public String[] stream;
    private int pointer;

    public OrderedStream(int n) {
        stream = new String[n];
        pointer = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        stream[idKey - 1] = value;
        List<String> result = new ArrayList<>();

        while(pointer < stream.length && stream[pointer] != null){
            result.add(stream[pointer++]);
        }
        return result;
    }
}
        