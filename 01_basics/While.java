public class While {
    public static void main(String[] args) {
        int dice = 6;

        while(dice <= 6){
            if(dice < 6){
                System.out.println("Print no Yatzee " + dice);
            } else {
                System.out.println("Yay! Yatzee " + dice);
            }
            dice = dice + 1;
        }

    }
    }