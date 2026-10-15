package bai7;

@FunctionalInterface
public interface Operation<T> {
    T execute(T a, T b);
}
