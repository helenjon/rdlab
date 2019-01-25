package lesson7;

import org.joda.time.DateTime;

public class JodaTimeData {


    public static void main(String [] args)  {
//         - дана дата в формате "2019-01-24" (естественно возможна и другая дата). создать метод для конертации ее в формат (кастомный который можно ввести например в форматах ниже):
//         - "dd-MM-yyyy";
//         - "dd/MM/yyyy";
//         - получить дату в формате long на начало дня;
//         - получить дату в формате long на конец дня;
//         - переконвертировать дату в формате long в формат String по шаблону (шаблон подается в метод);
//         - метод, который сравнивает две даты;
//         - метод возвращающий день недели (в текстовом формате например "Январь") из даты в формате long;
//

         DateTime dt = new DateTime();
        System.out.println(dt.toDateTime());


         System.out.println(dt.toString("dd-MM-yyyy"));
         System.out.println(dt.toString("dd/MM/yyyy"));
        System.out.println(dt.toString("dd/MM/yyyy 00:00:00"));





    }
}
