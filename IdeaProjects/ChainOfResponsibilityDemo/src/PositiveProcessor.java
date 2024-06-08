public class PositiveProcessor extends Processor{

    PositiveProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(Number n){
        if( n.getVal() > 0){
            System.out.println("Executing  " + n.getVal() + " in positive processor");
        }else{
            super.process(n);
        }
    }
}