package dev.vini.learningJSF.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class RequestScopedBean {

    private String item;
    private List<String> requestScopedList = new ArrayList<String>();

    public void addItem(){
        requestScopedList.add(item);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public List<String> getRequestScopedList() {
        return requestScopedList;
    }

    public void setRequestScopedList(List<String> requestScopedList) {
        this.requestScopedList = requestScopedList;
    }
}
