class Solution {
    public String solution(String polynomial) {
        String[] input = polynomial.split(" ");
        int x = 0;
        int num = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("+")) {
                continue;
            }

            if (input[i].contains("x")) {
                String coefficient = input[i].replace("x", "");

                if (coefficient.equals("")) {
                    x += 1;
                } else {
                    x += Integer.parseInt(coefficient);
                }
            } else {
                num += Integer.parseInt(input[i]);
            }
        }

        if (x == 0) {
            return String.valueOf(num);
        }

        if (num == 0) {
            if (x == 1) {
                return "x";
            }
            return x + "x";
        }

        if (x == 1) {
            return "x + " + num;
        }

        return x + "x + " + num;
    }
}