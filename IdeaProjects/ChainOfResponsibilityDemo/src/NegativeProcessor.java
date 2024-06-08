public class NegativeProcessor extends Processor{

    NegativeProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(Number n){
        if( n.getVal() < 0){
            System.out.println("Executing number " + n.getVal() + " in negative processor");
        }else{
            super.process(n);
        }
    }
}
