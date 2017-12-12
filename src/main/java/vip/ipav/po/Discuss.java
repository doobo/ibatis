package vip.ipav.po;

import java.util.Date;

/**
 * Created by 89003522 on 2017/12/12.
 */
public class Discuss {
    private User user;
    private String commit;
    private Date createTime;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Discuss{" +
                "user=" + user +
                ", commit='" + commit + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
