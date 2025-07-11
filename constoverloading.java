class constoverloading {
    String color;
    constoverloading() {
        color = "Red";
    }
    constoverloading(String c) {
        color = c;
    }
    public static void main(String[] args) {
        constoverloading obj1 = new constoverloading();        
        System.out.println("Color 1: " + obj1.color);         
        constoverloading obj2 = new constoverloading("Blue");  
        System.out.println("Color 2: " + obj2.color);           
    }
}