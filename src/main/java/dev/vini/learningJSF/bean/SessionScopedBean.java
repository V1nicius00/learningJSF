package dev.vini.learningJSF.bean;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class SessionScopedBean implements Serializable {

    private String item;
    private List<String> sessionScopedList = new ArrayList<String>();

    public void addItem(){
        sessionScopedList.add(item);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public List<String> getSessionScopedList() {
        return sessionScopedList;
    }

    public void setSessionScopedList(List<String> sessionScopedList) {
        this.sessionScopedList = sessionScopedList;
    }
}
