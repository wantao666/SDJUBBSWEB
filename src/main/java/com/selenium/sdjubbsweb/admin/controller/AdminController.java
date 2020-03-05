package com.selenium.sdjubbsweb.admin.controller;

import com.selenium.sdjubbsweb.admin.api.AdminApi;
import com.selenium.sdjubbsweb.admin.pages.AdminPage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * description:后台页面跳转
 */
@Controller
@Slf4j
@RequestMapping("/admin")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
public class AdminController {

    /**
     * method: get
     * url: /
     * description: 首页
     */
    @GetMapping(AdminApi.ADMIN_REQUEST_INDEX)
    public String index() {
        return AdminPage.ADMIN_PAGE_INDEX;
    }

    /**
     * method: get
     * url: /login
     * description: 登录
     */
    @GetMapping(AdminApi.ADMIN_REQUEST_LOGIN)
    public String login() {
        return AdminPage.ADMIN_PAGE_LOGIN;
    }

    /**
     * method: get
     * url: /user
     * description: 用户信息
     */
    @GetMapping(AdminApi.ADMIN_REQUEST_USER)
    public String showUsers() {
        return AdminPage.ADMIN_PAGE_USERS;
    }

    /**
     * method: get
     * url: /article
     * description: 文章信息
     */
    @GetMapping(AdminApi.ADMIN_REQUEST_ARTICLE)
    public String showArticles() {
        return AdminPage.ADMIN_PAGE_ARTICLE;
    }

    /**
     * method: get
     * url: /md
     * description: markdown编辑
     */
    @GetMapping(AdminApi.ADMIN_REQUEST_MD)
    public String showMDEditor() {
        return AdminPage.ADMIN_PAGE_MD;
    }

    @GetMapping(AdminApi.ADMIN_REQUEST_FEATURE_MESSAGE)
    public String showMessages() {
        return AdminPage.ADMIN_PAGE_FEATURE_MESSAGE;
    }

    @GetMapping(AdminApi.ADMIN_REQUEST_COMMENT)
    public String showComments() {
        return AdminPage.ADMIN_PAGE_COMMENT;
    }
}
