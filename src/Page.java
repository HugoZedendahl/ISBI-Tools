import java.util.ArrayList;
public class Page {
    private string data;
    private ArrayList connectedPages;
    page (String content){
        data = string;
    }
    public string getData() {
        return data;
    }
    public void connectPage(Page page){
        connectedPages.add(page);
    }
    public void removePage(Page page){
        connectedPages.remove(page);
    }

}

