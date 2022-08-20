class sattsd {
    int a ;
    static void hhh() {
    }
    void jjj() {
        System.out.println(a);
    }
}

class Nonstatic {
    void gun() {
        fun() ;
        sattsd.hhh() ;
    }

    void fun() {
        mun() ;
    } 

    static void mun() {
        // fun() ;
    }
    public static void main(String [] args) {
        Nonstatic nnn = new Nonstatic() ;
    }
}