class Core2web {
    static int totalStudentCount = 2500 ;
    int BatchStudentCount = 0 ;

    void dispStudCount () {
        System.out.println("Total Student Count = " + totalStudentCount) ;
        System.out.println("batch Student Count = " + BatchStudentCount) ;
    }
}

class AppAdmin {
    static int TotallogInCount = 1200 ;
    int VideoCount = 0 ;

    void displayStat() {
        System.out.println("Total LogIn Count = " + TotallogInCount) ;
        System.out.println("Video Count = " + VideoCount) ;
    }
}

class Mentor {
    public static void main (String[] args) {
        Core2web Java_11 = new Core2web() ;
        Java_11.BatchStudentCount = 370 ;
        Java_11.dispStudCount() ;

        Core2web Cpp_6 = new Core2web() ;
        Cpp_6.BatchStudentCount = 282 ;
        Cpp_6.dispStudCount() ;

        AppAdmin python01 = new AppAdmin() ;
        python01.VideoCount = 25 ;
        python01.displayStat() ;

        AppAdmin.TotallogInCount = 1000 ;
        AppAdmin OS01 = new AppAdmin() ;
        OS01.VideoCount = 65 ;
        OS01.displayStat() ;
    }
}
