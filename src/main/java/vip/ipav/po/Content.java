package vip.ipav.po;

import java.util.List;

/**
 * Created by 89003522 on 2017/12/13.
 */
public class Content {
    private int id;
    private String title;
    private String document;
    private User user;
    private List<Discuss> list;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Discuss> getList() {
        return list;
    }

    public void setList(List<Discuss> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", document='" + document + '\'' +
                ", user='" + user + '\'' +
                ", list=" + list +
                '}';
    }
}
