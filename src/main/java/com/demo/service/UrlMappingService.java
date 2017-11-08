package com.demo.service;

import com.season.core.db.SlaverDao;
import org.springframework.stereotype.Service;
import com.demo.pojo.UrlMapping;

import java.util.List;

/**
 * @author joy
 *         2015年12月25日 19:02
 */
@Service
public class UrlMappingService {

    /**
     * 获取所有映射
     *
     * @return
     */
    public List<UrlMapping> getUrlMappings() {
        return SlaverDao.findAll(UrlMapping.class);
    }
}
