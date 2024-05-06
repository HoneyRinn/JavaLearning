package lr7.Example5;

public class SubAClass extends SuperClass{
    private int subANumField;

    SubAClass(String text, int num){
        super(text);
        this.subANumField = num;
    }

    public void toConsole() {
        System.out.printf("Class Name = " + this.getClass().getSimpleName() +
                "\nNumField = " + this.subANumField);
    }
}
