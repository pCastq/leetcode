package example;

public class Object1 {
    private int number1;
    private boolean isEnabled;

    public Object1(){
        Object2 obj2 = new Object2(3,"ciao");

        obj2.method1(3,"ciao");
        System.out.println(obj2.getTmp() + " " + obj2.getName());
    }

    public static void main(String[] args) {
        Object1 obj1 = new Object1();

        Object2 obj2 = new Object2(7,"ciaooo!!!");
        obj2.getIstance().setTmp(8);
        System.out.println(obj2.getTmp());
    }
}
