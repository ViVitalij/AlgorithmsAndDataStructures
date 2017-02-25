package structures.myList;

/**
 * Created by m.losK on 2017-02-16.
 */
public interface MyListInterface {

    void add(int value);

    void add(int index, int value);

    int get(int index);

    void set(int index, int value);

    void addAll(MyListInterface myList);

    void addAll(int index, MyListInterface myList);

    void delete(int index);

    MyListInterface clone();

    int getSize();
}
