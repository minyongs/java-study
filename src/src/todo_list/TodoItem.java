package src.todo_list;

public class TodoItem {//TodoItem 객체

    private String title;//제목
    private String article;//내용

    public TodoItem(String title, String article){//생성자
        this.title = title;
        this.article =article;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public String toString(){
        return title + article;
    }
}
