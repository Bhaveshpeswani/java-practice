public class Method {
    static void MyMethod(){
        System.out.println("I just fot executed MyMethod!");
    }

    public void PublicMethod()
    {
        System.out.println(" I just Executed a Public Method! ");

    }

    public static void main(String[] args){
        MyMethod();

        Method obj = new Method();
        obj.PublicMethod();
    }
}

