class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    num += (num >= 5) ? -1 : 1;
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    num += (num >= 50) ? -10 : 10;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    num += (num >= 500) ? -100 : 100;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
        }
        return num;
    }
}
