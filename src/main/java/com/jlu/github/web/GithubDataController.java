package com.jlu.github.web;

import com.jlu.github.service.IGithubDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by niuwanpeng on 17/3/24.
 */
@Controller
@RequestMapping("/github")
public class GithubDataController {

    @Autowired
    private IGithubDataService githubDataService;

    /**
     * 根据用户名获得GitHub代码仓库信息并保存
     * 注册时调用
     * @param userame
     * @return
     */
    @RequestMapping("/syncReposByUser")
    @ResponseBody
    public boolean syncReposByUser(@RequestParam(value = "username") String userame) {
        return githubDataService.syncReposByUser(userame);
    }
}
