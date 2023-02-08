public class Main {
    //1
    //2
    public static void main(String[] args) {
        //3
        int result = add(3, 8);
        System.out.println(result);

        //4
        int newResult = add(3, 8, 4, 9);
        System.out.println(newResult);

        //5
        String addisonsAllWeDoIsAdvertise = morningGreeting("Toby Fox");
        System.out.println(addisonsAllWeDoIsAdvertise);

        //6
        String macMiller = morningGreeting("Mac Miller");
        System.out.println(macMiller);

        //7
        String oohYeahWhat = triple("oohbaby");
        System.out.println(oohYeahWhat);

        //8
        int halved = half(8);
        System.out.println(halved);

        //9
        int wowWhatALongMethodName = roundPositiveValueToNearestInteger(8.49);
        System.out.println(wowWhatALongMethodName);

        //10
        int wowWhatALongerMethodName = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(wowWhatALongerMethodName);


    }

    public static int add(int a, int b) {
        return a + b;
    }


    public static int add(int a, int b, int c, int d) {
        return add(a, b) + add(c, d);
    }
    public static String morningGreeting(String name) {
        return "早上好，"+name+"!";
    }
    public static String afternoonGreeting(String name) {
        return "下午好，" + name + "!";
    }
    public static String triple(String name) {
        return ""+ name +""+name +""+ name +"";
    }

    public static int half(int a) {
        return (a/2);
    }

    public static int roundPositiveValueToNearestInteger(double a) {

        return (int)a;
    }

    public static int roundNegativeValueToNearestInteger(double a) {
        return roundPositiveValueToNearestInteger(a);
    }





}
