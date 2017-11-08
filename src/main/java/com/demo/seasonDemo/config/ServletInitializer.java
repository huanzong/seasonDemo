package com.demo.seasonDemo.config;

import com.season.core.spring.SeasonServletInitializer;

/**
 * @author joy
 *         2015年12月02日 23:10
 */
public class ServletInitializer extends SeasonServletInitializer {

    @Override
    protected Class<?> getAppClass() {
        return DemoApp.class;
    }
}
