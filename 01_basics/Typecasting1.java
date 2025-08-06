public class Typecasting1 {
    int maxScore = 500; // Set the maximum score Limit to 500
    int userScore = 250; // Acutal User Score
    float percentage = (float) userScore / maxScore * 100; //Calculate percentage

    public static void main(String[] args) {
        Typecasting1 type = new Typecasting1();
        System.out.println("UserSCore: " + type.userScore);
        System.out.println("Percentage is : "+ type.percentage + "%");
        
    }
    
}
