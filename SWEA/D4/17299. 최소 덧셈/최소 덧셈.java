import java.util.Scanner;
//import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int input = sc.nextInt();
            String number = Integer.toString(input); // 오타 수정
            int length = number.length(); // 문자열 길이를 저장하는 변수 추가

            if(length % 2 == 0)
            {
                String firstHalf = number.substring(0, length / 2);
                String secondHalf = number.substring(length / 2);
                int firstNumber = Integer.parseInt(firstHalf);
                int secondNumber = Integer.parseInt(secondHalf);
                int sum = firstNumber + secondNumber;
                System.out.println("#" + test_case + " " + sum);
            }
            else
            {
                String firstHalf = number.substring(0, (length + 1) / 2);
                String secondHalf = number.substring((length + 1) / 2);
                int firstNumber = Integer.parseInt(firstHalf);
                int secondNumber = Integer.parseInt(secondHalf);
                int sum = firstNumber + secondNumber;
                
                String firstHalf2 = number.substring(0, (length - 1) / 2);
                String secondHalf2 = number.substring((length - 1) / 2);
                int firstNumber2 = Integer.parseInt(firstHalf2); // 변수 이름 수정
                int secondNumber2 = Integer.parseInt(secondHalf2); // 변수 이름 수정
                
                int sum2 = firstNumber2 + secondNumber2;
                if(sum > sum2)
                    System.out.println("#" + test_case + " " + sum2);
                else
                    System.out.println("#" + test_case + " " + sum);
            }
        }
    }
}
