package service;

public class A {

    /*Atributo*/
    private B b;


    /*Constructor*/
    public A(B b){
        this.b = b;
    }

    public A() {
        this(new  B());
     }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }
}
