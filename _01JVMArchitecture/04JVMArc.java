class Kesar {
    static int PricePerKG = 50 ;
    int SellingPricePerKG = 75 ;

    void Price() {
        System.out.println("Price of Kesar mango per 1 Kg = " + PricePerKG) ;
    }

    void SellPrice() {
        System.out.println("Selling Price Of Kesar mango per 1 KG = "+ SellingPricePerKG) ;
    }
}

class Hapus {
    static int PricePerKG = 90 ;
    int SellingPricePerKG = 150 ;

    void Price() {
        System.out.println("Price of Hapus mango per 1 Kg = " + PricePerKG) ;
    }
    
    void SellPrice() {
        System.out.println("Selling Price Of Hapus mango per 1 KG = "+ SellingPricePerKG) ;
    }
}

class Mango {
    public static void main(String [] args) {

        Kesar Aurangabad = new Kesar() ;
        Aurangabad.SellingPricePerKG = 70 ;
        Aurangabad.Price() ;
        Aurangabad.SellPrice() ;

        Kesar Pune = new Kesar() ;
        Pune.SellingPricePerKG = 75 ;
        Pune.Price() ;
        Pune.SellPrice() ;

        Hapus Mumbai = new Hapus() ;
        Mumbai.SellingPricePerKG = 170 ;
        Mumbai.Price() ;
        Mumbai.SellPrice() ;

        Hapus Kolhapur = new Hapus() ;
        Kolhapur.SellingPricePerKG = 160 ;
        Kolhapur.Price() ;
        Kolhapur.SellPrice() ;

    }
}