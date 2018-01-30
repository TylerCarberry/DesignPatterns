package nocoupling;

public interface Observer<K> {
    void update(K value);
}
