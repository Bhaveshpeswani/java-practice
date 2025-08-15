public class MethodIfElse {

    static void checkAge(int age){
        if (age < 18) {
            System.out.println("Hey you are a minor, you cannot write code yet!");
        } else {
            System.out.println("Hey you are an adult, you can write the code now! ");

        }
        }

        public static void main(String[] args) {
            checkAge(16);
            checkAge(20);
            checkAge(18);
            
    }
    
}
