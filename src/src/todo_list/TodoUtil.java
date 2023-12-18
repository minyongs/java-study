package src.todo_list;
import java.util.Scanner;
public class TodoUtil {

    public static void createItem(TodoList list){
        String title;
        String article;

        Scanner sc = new Scanner(System.in);
        System.out.println("제목>");
        title = sc.next();

        sc.nextLine();

        System.out.println("내용>");
        article = sc.next();

        TodoItem t = new TodoItem(title,article);
        list.addItem(t);
        System.out.println("추가되었답니다.");

    }

    public static void deleteItem(TodoList list){
        Scanner sc = new Scanner(System.in);
        System.out.println("항목 삭제");
        String title = sc.next();

         for(TodoItem item : list.getList()){
             if(title.equals(item.getTitle())){
                 list.deleteItem(item);
                 System.out.println("삭제되었습니다.");
                 break;
             }

        }
    }
    public static void listAll(TodoList l){
        System.out.println("전체 목록");
        for(TodoItem item : l.getList()){
            System.out.println(item.toString());
        }
    }
}
