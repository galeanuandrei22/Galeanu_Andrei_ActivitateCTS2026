public interface OrderState {
    void next(Order context);
    void printStatus();
}
