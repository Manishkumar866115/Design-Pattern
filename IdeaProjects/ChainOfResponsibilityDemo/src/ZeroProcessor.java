public class ZeroProcessor extends Processor{

    ZeroProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(Number n){
        if( n.getVal() == 0){
            System.out.println("Executing " + n.getVal() + " in zero processor");
        }else{
            super.process(n);
        }
    }
}
