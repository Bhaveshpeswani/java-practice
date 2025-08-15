public class Arrays {
    public static void main(String[] args) {

        int ages[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int length = ages.length; // Get the Length of the array 

        int lowestAge = ages[0];

        for(int age : ages){
            if(age < lowestAge){
                lowestAge = age;
                
            }
            
        }
        System.out.println("The lowest age is: "+ lowestAge);





}
}
