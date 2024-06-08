public class Chain {
    Processor processor;
    Chain(){
        processor = new PositiveProcessor(new NegativeProcessor(new ZeroProcessor(null)));
    }

    public void process(Number n){
        processor.process(n);
    }
}
