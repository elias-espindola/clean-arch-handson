package abr.usecases;

public interface UseCase<I,O> {
    O execute(I input);
}
