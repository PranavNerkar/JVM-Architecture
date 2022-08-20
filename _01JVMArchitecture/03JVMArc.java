class CricketGround {
    static int noOfPlayers = 13 ;
    int TotalPlayers = 30 ;

    void OnGroundplayers () {
        System.out.println("No of Players On The Cricket Ground = " + noOfPlayers) ;
    }

    void TotalNoOfplayers () {
        System.out.println("Total no. of Players in Cricket = " + TotalPlayers) ;
    }
}

class FootballGround {
    static int noOfPlayers = 22 ;
    int TotalPlayers = 40 ;

    void OnGroundplayers () {
        System.out.println("No of Players On The Football Ground  = " + noOfPlayers) ;
    }

    void TotalNoOfplayers () {
        System.out.println("Total no. of Players in Football = " + TotalPlayers) ;
    }
}

class TypeOfGround {
    public static void main(String [] args) {

       CricketGround Cricket = new CricketGround() ;
       Cricket.TotalPlayers = 30 ;
       Cricket.OnGroundplayers() ;
       Cricket.TotalNoOfplayers() ;

       FootballGround Footbll = new FootballGround() ;
       Footbll.TotalPlayers = 40 ;
       Footbll.OnGroundplayers() ;
       Footbll.TotalNoOfplayers() ;
    }
}