package lr7.Example4;

public class SuperClass {
    public String textField;

    SuperClass(String text){
        this.textField = text;
    }

    SuperClass(SuperClass obj){
        this.textField = obj.textField;
    }
}
