public class JavaDeveloperFactory implements DeveloperFactory {
    int a = 9;

    @Override
    public Developer create() {
        return new JavaDev();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
