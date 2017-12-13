package vip.ipav.po;

import java.util.Date;

/**
 * Created by 89003522 on 2017/12/12.
 */
public class Discuss {
    private Content content;
    private String commit;
    private Date createTime;

    public Content getContent() {
        return content;
    }

    public void setContent(Content desc) {
        this.content = content;
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
                "content=" + content +
                ", commit='" + commit + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
