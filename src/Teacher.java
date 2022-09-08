public class Teacher {

    public static void main(String[] arg) {

        /** 12. create "object" Учитель математики Иван Петрович Серебряков, 55 лет
         */
        int age = 35;
        String name = "Иван";
        String middleName = "Петрович";
        String lastName = "Серебряков";
        String subject = "математики";
        String occupation = "Учитель";

        String space = " ";
        String line = "___________";


        /**13.Создать и распечатать карточку учителя математики (постарайтесь придумать свой “дизайн”, но можно распечатать
         * так же, как карточку Марь Иванны с урока)
         */
        System.out.println("\t\t\t" + line + "\n"
                + "\t\t" + occupation + space + subject + "\n"
                + "\t" + space + name + space + middleName + space + lastName + "," + space + "\n"
                + "\t\t\t" + space + space + space + age + space + "лет" + "\n"
                + "\t\t\t" + line);

    }
}
