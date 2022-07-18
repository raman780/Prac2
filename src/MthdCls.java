class MthdCls1 {
    void test() {
        System.out.println("No Parameter");
    }

    //Overload test for one integer parameter
    void test(int a) {
        System.out.println("a: " + a);
    }

    //Overload test for two interger parametes.
    void test(int a, int b) {
        System.out.println("a and b:" + a + " " + b);
    }

    //overload test for a double parameters
    double test(double a) {
        System.out.println("double a :" + a);
        return a * a;
    }
}

class MthdClsRun {
    public void main(String[] args) {
        MthdCls1 md = new MthdCls1();
        double result;

        //call all versions of test()
        md.test();
        md.test(10);
        md.test(10, 20);
        result = md.test(132.52);
        System.out.println("Result of md.test(132.52) : " + result);
    }
}

