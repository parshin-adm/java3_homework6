package homework6;

public class MethodTwo {
    public static void main(String[] args) {

    }
    public boolean method(int[] arrayIn) {
        int countOne = 0;
        int countFour = 0;
        for(int number : arrayIn) {
            if(number == 1) {
                countOne++;
            }
            else  {
                countFour++;
            }
        }
        return countOne != 0 && countFour != 0;
    }

}
