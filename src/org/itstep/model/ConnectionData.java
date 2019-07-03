package org.itstep.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ConnectionData {

    private Integer sesionid;
    private String ip;
    private Long time;
    private String UserLogin;

    public Integer getSesionid() {
        return sesionid;
    }

    public void setSesionid(Integer sesionid) {
        this.sesionid = sesionid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getUserLogin() {
        return UserLogin;
    }

    public void setUserLogin(String userLogin) {
        UserLogin = userLogin;
    }
}
