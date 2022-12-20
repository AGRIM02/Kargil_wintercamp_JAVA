//WAP to sorting string without using string Methods?

class A1Q1 {
    public static void main(String[] args) {
        String s = "gddfaabefgh";
        char[] sorted = s.toCharArray();
        char temp = 0;

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (sorted[j] > sorted[i]) {
                    temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i]);
        }

    }
}