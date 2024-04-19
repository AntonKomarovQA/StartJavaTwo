package Lesson16String;

class Email {
    void email1(String email) {
        int starIndex = email.indexOf("@");
        int endIndex = email.indexOf(".");
        if (starIndex != -1 && endIndex != -1) {
            System.out.println("Почта которой пользуется пользователь  " + email.substring(starIndex + 1, endIndex));
        }
    }

    void email2(String email) {
        String[] part = email.split(";"); // разделяю слова ; и записываю их в массив
        for (int i = 0; i < part.length; i++) { // прохожу по массиву и записываю слова
            int starIndex = part[i].indexOf("@");
            int endIndex = part[i].indexOf(".");
            if (starIndex != -1 && endIndex != -1) {
                System.out.println("Почта которой пользуется пользователь  " + part[i].substring(starIndex+1,endIndex));
            }
        }
    }
}


class EmailTest{
    public static void main(String[] args) {
        Email email = new Email();
        email.email1("ya@yahoo.com; on@mail.ru; ona@gmail.com ");
        email.email2("ya@yahoo.com; on@mail.ru; ona@gmail.com");
        email.email2("ona@rambler.ru.com");
        String email1 =new String( "");
        System.out.println(email1.isEmpty());
    }
}
