public class CPPFactory implements DeveloperFactory{

    @Override
    public Developer create() {
        return new CPP();
    }
}
