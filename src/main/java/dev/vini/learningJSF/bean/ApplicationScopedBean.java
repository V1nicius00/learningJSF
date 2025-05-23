package dev.vini.learningJSF.bean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class ApplicationScopedBean {

    private String item;
    private List<String> applicationScopedList = new ArrayList<String>();

    public void addItem(){
        applicationScopedList.add(item);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public List<String> getApplicationScopedList() {
        return applicationScopedList;
    }

    public void setApplicationScopedList(List<String> applicationScopedList) {
        this.applicationScopedList = applicationScopedList;
    }
}
