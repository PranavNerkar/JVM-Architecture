public class JVMArc01 {
    int count = 170000 ;
    JVMArc01() {
        
    }
    void precautions () {
        System.out.println("*** Take Care ***") ;
        System.out.println("Count = " + count) ;
    }
    void impDecisions() {                                               //Static
        System.out.println("CM'S - Decision") ;
    }
    public static void main(String [] args){

        JVMArc01 June19 = new JVMArc01() ;
        June19.precautions();
        June19.impDecisions() ;

        JVMArc01 June20 = new JVMArc01() ;
        June20.count = 180000 ;
        June20.precautions();
        June20.impDecisions() ;
    }
}