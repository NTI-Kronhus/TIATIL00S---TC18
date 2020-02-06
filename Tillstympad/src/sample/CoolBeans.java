package sample;

public class CoolBeans {

    private String _name;

    public CoolBeans(){
        _name = "default value";
    }

    public CoolBeans(String name){

        _name = name;

    }

    public static void bajs()
    {
        System.out.println("bajs!");
    }

    public void bajsApa()
    {
        System.out.println(_name);
    }
}
