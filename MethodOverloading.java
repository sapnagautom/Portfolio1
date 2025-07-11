class MethodOverloading {
    int add(int a , int b){
        return a + b;
    }
    double add(int a , int b ,int c){
        return a + b + c;
    }
}

class Demo {
    public static void main(String[] args){
        MethodOverloading obj1 = new MethodOverloading();
        System.out.println(obj1.add(2, 5));     
        System.out.println(obj1.add(3, 5, 7));  
    }
}