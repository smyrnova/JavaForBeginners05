public class Student {

    public static void main(String[] arg) {

        /**
         *17 - 18 Create and print 2 "objects"
         */
        int age1 = 10;
        String name1 = "Vova";
        String lastName1 = "Sidorov";
        String occupation = "Student of";
        int clas1 = 5;
        String addClas = "clas";

        int age2 = 14;
        String name2 = "Masha";
        String lastName2 = "Semenova";
        int clas2 = 9;

        String space = " ";
        String line = "___________";

        System.out.println("\t\t\t" + line + "\n"
                + "\t\t" + space + occupation + space + clas1 + space + addClas + "\n"
                + "\t\t" + space + space + space + name1 + space + lastName1 + "," + space + "\n"
                + "\t\t\t" + space + space + age1 + space + "лет" + "\n"
                + "\t\t\t" + line);

        System.out.println("\t\t\t" + line + "\n"
                + "\t\t" + space + occupation + space + clas2 + space + addClas + "\n"
                + "\t\t" + space + space + space + name2 + space + lastName2 + "," + space + "\n"
                + "\t\t\t" + space + space + age2 + space + "лет" + "\n"
                + "\t\t\t" + line);

    }

}
