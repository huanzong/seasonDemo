package com.demo.service;


import com.demo.pojo.BBSThread;
import com.demo.service.base.BaseService;
import com.season.common.StrKit;
import com.season.core.db.SlaverDao;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查询帖子相关的
 * 都必须从这查询
 *
 * @author joy
 *         2015年12月17日 20:56
 */
@Service
public class QueryForumService extends BaseService {


    /**
     * 根据帖子id,查询帖子
     *
     * @param id
     * @return 帖子实体类
     */
    public BBSThread findById(Integer id) {
        BBSThread oThread = SlaverDao.findById(BBSThread.class, id);

        if (null == oThread) {
            return oThread;
        }
        //根据帖子id查询post表
        Map<String, Object> oParamMap = new HashMap<String, Object>();
        oParamMap.put("tid", oThread.getTid());
        String sQueryPostSql = "select CONVERT (message,char) as message from trs_forum_post where tid=:tid";
        List<Map<String, Object>> oPostList = SlaverDao.query(oParamMap, sQueryPostSql);
        if (oPostList.size() > 0) {
            Map<String, Object> oPostMap = oPostList.get(0);
            String threadContent = StrKit.toSafeString(oPostMap.get("message"));
            oThread.setMessage(threadContent);
        }

        if (null == oThread.getZan()) {
            oThread.setZan(0);
        }
        return oThread;
    }
}
