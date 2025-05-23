package dev.vini.learningJSF.bean;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class ViewScopedBean implements Serializable {

    private String item;
    private List<String> viewScopedList = new ArrayList<String>();

    public void addItem(){
        viewScopedList.add(item);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public List<String> getViewScopedList() {
        return viewScopedList;
    }

    public void setViewScopedList(List<String> viewScopedList) {
        this.viewScopedList = viewScopedList;
    }
}
