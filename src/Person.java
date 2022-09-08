public class Person {

    public static void main(String[] arg) {

        int yob = 1990;

        System.out.println("If a person was born in " + yob + ", then his age is the difference between 2022 and " + yob + ".");

        yob = 1986;
        int currentYear = 2022;
        int yearsAgo = 2;
        int pastYear = currentYear - yearsAgo;
        int age = pastYear - yob;

        System.out.println("If a person was born in " + yob + ", then his age " + yearsAgo
                + " years ago was the difference between " + pastYear + " and " + yob + ". And it is " + age  + "." );

    }


}
