package vip.ipav.dao;

import vip.ipav.po.Discuss;
import vip.ipav.po.User;
import vip.ipav.vo.DiscussInfo;

import java.util.List;

/**
 * Created by 89003522 on 2017/12/12.
 */
public interface DiscussMapper {
    public List<Discuss> findDiscussByUid (int id) throws Exception;

    public List<Discuss> findDiscussByUser (User user) throws Exception;

    public List<Discuss> findDiscussByArray (int[] array) throws Exception;

    public List<DiscussInfo> findDiscussList() throws Exception;

    public List<DiscussInfo> findDiscussResultMap() throws Exception;

}
