public class Codewars {
    public static void main(String[] args) {
        System.out.println(squareSum(new  int[] {1, 2, 2}));

    }
    public static String  switchItUp(int number)
    {
        String result = "";
        switch (number){
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
            case 9:
                result = "Nine";
                break;

        }
        return result;
    }

    public static int cockroachSpeed(double x){
       int result = (int) (x * 100000) / 3600;
       return result;
    }

    public static String greet(String name)
    {
        return "Hello, " + name + " how are you doing today?";
    }

    public static int squareSum(int[] n)
    {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * n[i];
            sum += n[i]; //sum = sum = n[i];

        }
        return sum;
    }
}

