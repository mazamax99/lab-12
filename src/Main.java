interface MyStr {
    String getValue();
}

public class Main {
    public static void main(String args[]){
        MyStr myStr;
        myStr = ()->"Hello nigga";
        System.out.println(myStr.getValue());
        String word[]={"two22323","two","three","four"};
        myStr=()->word[2];
        System.out.println("Фраза первая: "+myStr.getValue());
        myStr=()->word[3];
        System.out.println("Фраза вторая: "+myStr.getValue());
    }
}
