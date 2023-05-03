
// Реализовать консольное приложение, которое:

// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
// Если введено exit, завершаем программу
package Homework4;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> lst = new LinkedList<>();

        while (true) {
            System.out.println("Введите строку ( или print/revert для выполнения команд):");
            String myImput = sc.nextLine();

            if (myImput.equals("print")) {
                System.out.println("Строки в обратном порядке:");
                while (!lst.isEmpty()) {
                    System.out.println(lst.removeLast());
                }
            } else if (myImput.equals("revert")) {
                if (!lst.isEmpty()) {
                    lst.removeLast();
                    System.out.println("Последняя введенная строка удалена из памяти.");
                } else {
                    System.out.println("Нет строк.");
                }
            } else {
                lst.addLast(myImput);
            }
        }
    }
}