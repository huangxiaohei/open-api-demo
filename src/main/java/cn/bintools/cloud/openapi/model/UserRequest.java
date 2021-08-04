package cn.bintools.cloud.openapi.model;

import java.util.List;

/***
 * 用户请求对象
 * @author <a href="jian.huang@bintools.cn">Turbo</a>
 * @version 1.0.0 2021-06-2021/6/24-21:50
 */
public class UserRequest {

    /**用户标识id 【需用户标识加密】**/
    private String appId;

    /**数据来源 【需用户标识加密】**/
    private String source;

    /**当前时间 【需用户标识加密】**/
    private Long currentTime;

    /**加密字段生成的标识key**/
    private String status;

    /**部门详情信息**/
    private List<UserInfo> userInfos;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<UserInfo> departmentInfos) {
        this.userInfos = departmentInfos;
    }

    public UserRequest(String appId, String source, Long currentTime) {
        this.appId = appId;
        this.source = source;
        this.currentTime = currentTime;
    }
}
