public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.process(new Number(0));
        chain.process(new Number(-1));
        chain.process(new Number(1));
    }
}