package comparators;

public interface ComparatorStrategy<T> {
    public int compare( T element, T otherElement);
}
