public class B extends A{

    String meth(){
        super.meth();
        return "Method is overridden in Extendend class B";
    }
    public static void main(String[] args) {
        B b = new B();

        b.meth();

        B a = new B();
        a.meth();
    }
}
