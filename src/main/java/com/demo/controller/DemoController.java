package com.demo.controller;

import com.demo.controller.base.BaseController;
import com.demo.pojo.BBSThread;
import com.demo.service.QueryForumService;
import com.season.core.ControllerKey;
import com.season.core.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Title:
 * Description:
 * Copyright: 2017 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: seasonDemo
 * Author: Joy
 * Create Time:2017/11/1 09:29
 */
@ControllerKey(value = "/seasonDemo")
public class DemoController extends BaseController {

    @Autowired
    private QueryForumService queryForumService;

    /**
     * test
     *
     * @throws Exception
     */

    public void queryThread() throws Exception {
        Result result = Result.success();
        BBSThread oBBSThread = queryForumService.findById(114226);
        result.setData(oBBSThread);
        renderJson(result);
    }

    /**
     * test
     *
     * @throws Exception
     */

    public void queryThreadPage() throws Exception {
        BBSThread oBBSThread = queryForumService.findById(114226);
        setAttr("oBBSThread", oBBSThread);
        render("index.html");
    }
}
