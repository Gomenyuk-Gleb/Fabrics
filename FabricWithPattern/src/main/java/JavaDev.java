public class JavaDev implements Developer {

    Integer a = 90;

    @Override
    public void writeCode() {
        System.out.println("Java dev");
    }

    public void writeCodes() {
        System.out.println("Java dev");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
