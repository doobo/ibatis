package vip.ipav.dao;

import vip.ipav.po.Content;
import vip.ipav.po.User;
import vip.ipav.vo.ContentInfo;

import java.util.List;

/**
 * Created by 89003522 on 2017/12/12.
 */
public interface ContentMapper {
    public List<Content> findContentByUid (int id) throws Exception;

    public List<Content> findContentByUser (User user) throws Exception;

    public List<Content> findContentByArray (int[] array) throws Exception;
    public List<Content> findContentByArray2 (int[] array) throws Exception;

    public List<ContentInfo> findContentList() throws Exception;

    public List<Content> findContentResultMap() throws Exception;

    public List<Content> findMoreMap() throws Exception;

}
