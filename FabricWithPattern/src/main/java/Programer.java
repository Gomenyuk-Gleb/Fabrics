public class Programer {
    public static void main(String[] args) {
        Developer developer = new JavaDev();
        developer.writeCode();
        System.out.println(developer);

        DeveloperFactory developerFactory = developerFactory("JavA");
        Developer developer1 = developerFactory.create();

        int a = developer1.a;

        System.out.println(a);
    }

    public static DeveloperFactory developerFactory(String spec) {
        if (spec.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (spec.equalsIgnoreCase("c++")) {
            return new CPPFactory();
        } else {
            throw new RuntimeException("not");
        }
    }
}
