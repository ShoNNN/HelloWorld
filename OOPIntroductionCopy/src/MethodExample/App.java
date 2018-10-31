package MethodExample;

public abstract class App implements ExtendsExample {
    public static void main(String[] args) {
//        App app = new App();
//        app.min(6,9);
        int c = sqr(6) + sqr(7);
        double d = sqr(7.8) + sqr(9.2);
        //int c = b + b
        System.out.println(c);
    }

    public void min(int a, int b){
        if(a > b) System.out.println("b наименьшее число");
        else if (b > a) System.out.println("a наименьшее число");
    }

    public static int sqr(int a){
        int b = a * a;
       return b;
    }

    public static double sqr(double d){
        double b = d * d;
        return b;
    }

    public abstract int sqr(int a, int b);

    @Override
    public double method(int a, int b) {
        return 0;
    }

}
