package example;

public class Object2 {
    private int tmp;
    private String name;

    public Object2() {
    }

    public Object2(int a, String b){
        this.tmp = a;
        this.name = b;
    }

    public int getTmp() {
        return tmp;
    }

    public String getName() {
        return name;
    }

    public void setTmp(int tmp) {
        this.tmp = tmp;
    }

    public void method1 (int a, String b){
        a = a+5;
        b.toUpperCase();
    }

    public Object2 getIstance(){
        return this;
    }
}