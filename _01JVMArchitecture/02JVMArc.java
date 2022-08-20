class CapGemini {
    static int noOfEmployee = 200000 ;
    int projectCount = 200 ;

    void displayProject () {
        System.out.println("CapGemini Project Count = " + projectCount ) ;
    }
    void empInfo() {
        System.out.println("CapGemini Total Employee = " + noOfEmployee) ;
    }
}

class TCS {
    static int noOfEmployee = 300000 ;
    int projectCount = 350 ;

    void displayProject () {
        System.out.println("TCS Project Count = " + projectCount ) ;
    }
    void empInfo() {
        System.out.println("TCS Total Employee = " + noOfEmployee) ;
    }
}

class ITCompanies {
    public static void main(String [] args) {
        CapGemini pune = new CapGemini() ;
        pune.projectCount = 130 ;
        pune.displayProject() ;
        pune.empInfo() ;

        CapGemini chennai = new CapGemini() ;
        chennai.projectCount = 70 ;
        chennai.displayProject() ;
        chennai.empInfo() ;

        TCS Mumbai = new TCS() ;
        Mumbai.projectCount = 250 ;
        Mumbai.displayProject() ;
        Mumbai.empInfo() ;

        TCS Banglore = new TCS() ;
        Banglore.projectCount = 100 ;
        Banglore.displayProject() ;
        Banglore.empInfo() ;
    }
}