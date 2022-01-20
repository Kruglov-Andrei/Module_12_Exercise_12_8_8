import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static void printCollectionCompare(String title, List<ClassForSortCompare> listForSort1) {
        System.out.println(title);
        for (ClassForSortCompare a : listForSort1) {
            System.out.println("Фрукт: " + a);
        }
    }
    private static void printCollectionComparator(String title, List<ClassForSort> listForSort2){
        System.out.println(title);
        for (ClassForSort a : listForSort2){
            System.out.println("Овощ: " + a);
        }
    }
    public static void main(String[] args) {
        System.out.println("Сортировка коллекции через Compare");
        List<ClassForSortCompare> listForSort1 = new ArrayList<ClassForSortCompare>();
        listForSort1.add(new ClassForSortCompare("Яблоко"));
        listForSort1.add(new ClassForSortCompare("Персик"));
        listForSort1.add(new ClassForSortCompare("Вишня"));
        listForSort1.add(new ClassForSortCompare("Слива"));
        listForSort1.add(new ClassForSortCompare("Апельсин"));
        listForSort1.add(new ClassForSortCompare("Мандарин"));

        printCollectionCompare("Коллекция без сортировки", listForSort1);
        Collections.sort(listForSort1);
        printCollectionCompare("Коллекция после сортировки", listForSort1);

        System.out.println("Сортировка коллекции через Comparator");
        List<ClassForSort> listForSort2 = new ArrayList<ClassForSort>();
        listForSort2.add(new ClassForSort("Помидор"));
        listForSort2.add(new ClassForSort("Огурец"));
        listForSort2.add(new ClassForSort("Картошка"));
        listForSort2.add(new ClassForSort("Капуста"));
        listForSort2.add(new ClassForSort("Кабачок"));
        listForSort2.add(new ClassForSort("Морковь"));

        printCollectionComparator("Коллекция без сортировки", listForSort2);
        Collections.sort(listForSort2, new ClassForSortComparator());
        printCollectionComparator("Коллекция после сортировки", listForSort2);
    }
}
