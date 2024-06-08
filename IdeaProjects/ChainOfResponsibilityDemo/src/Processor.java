public abstract class Processor {
    Processor nextProcessor;
    Processor(Processor nextProcessor){
        this.nextProcessor = nextProcessor;
    }

    void process(Number n){
        nextProcessor.process(n);
    }

}
