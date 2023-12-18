package src.todo_list;


import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<TodoItem> list;// List<TodoItem> 타입의 list 필드 ( TodoItem 타입만 모아놓은 list )

    public TodoList(){
        this.list = new ArrayList<TodoItem>();
    }

    public void addItem(TodoItem t){
        list.add(t);
    }
    public void deleteItem(TodoItem t){
        list.remove(t);
    }

    public void editItem(TodoItem t, TodoItem updated){
        int index = list.indexOf(t);
        list.remove(index);
        list.add(updated);
    }

    public ArrayList<TodoItem> getList(){
        return new ArrayList<TodoItem>(list);
    }


}
