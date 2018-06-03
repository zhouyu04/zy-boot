package com.zzyy.zyboot.entity;

import javax.persistence.*;

public class User {
    @Id
    private Integer id;

    @Column(name = "userName")
    private String username;

    @Column(name = "passWord")
    private String password;

    @Column(name = "actualName")
    private String actualname;

    private Boolean valid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return passWord
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return actualName
     */
    public String getActualname() {
        return actualname;
    }

    /**
     * @param actualname
     */
    public void setActualname(String actualname) {
        this.actualname = actualname == null ? null : actualname.trim();
    }

    /**
     * @return valid
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * @param valid
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", actualname='" + actualname + '\'' +
            ", valid=" + valid +
            '}';
    }
}
