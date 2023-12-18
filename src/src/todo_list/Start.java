package src.todo_list;
import java.util.Scanner;
public class Start {

    public void start(){
        Menu menu = new Menu();
        TodoList l = new TodoList();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        menu.displayMenu();
        do {
            String choice = sc.next();

            switch (choice) {
                case "입력":
                    TodoUtil.createItem(l);
                    break;

                case "삭제":
                    TodoUtil.deleteItem(l);
                    break;
                case "종료":
                    quit = true;
                    System.out.println("종료합니다.");
                    break;
                case"확인":
                    TodoUtil.listAll(l);
                    break;





            }
        }while (!quit);


    }
}
