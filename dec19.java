class dec19 {
    public static void checknum(int num) {
        if (num < 1) {
            throw new ArithmeticException("\n number is -ve,can not calculate square");
        } else {
            System.out.println("square of" + num + "is" + (num * num));
        }
    }

    public static void main(String[] args) {
        dec19 obj = new dec19();
        obj.checknum(3);
        System.out.println("rest of code....");

    }
}