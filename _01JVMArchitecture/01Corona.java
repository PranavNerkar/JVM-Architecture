class CoronaMaha {
    static int _case = 10000 ;
    int count = 17000 ;
    void precautions() {

    }
    void impDecisions() {

    }
    public static void main(String[] args) {
        CoronaMaha cm = new CoronaMaha() ;
        System.out.println(cm.count) ;
        cm.count = 50000 ;
        System.out.println(cm.count) ;
        _case = 20000 ;
        System.out.println(cm.count) ; 

        CoronaMaha cm1 = new CoronaMaha() ;
        System.out.println(cm1.count) ;
        cm1.count = 30000 ;
        System.out.println(cm1.count) ; 

        System.out.println(cm.count) ; 
    }
}