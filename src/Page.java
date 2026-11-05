import java.util.ArrayList;
public class Page {
    private String data;
    private ArrayList<Page> connectedPages;
    public Page (String content){
        data = content;
    }
    public String getData() {
        return data;
    }
    public void connectPage(Page page){
        connectedPages.add(page);
    }
    public void removePage(Page page){
        connectedPages.remove(page);
    }

}

