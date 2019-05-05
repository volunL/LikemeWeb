package com.emotion.cus.po;

import java.io.Serializable;
import java.util.Date;

public class CusUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_like_user.userid
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_like_user.password
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_like_user.uemail
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    private String uemail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_like_user.uname
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    private String uname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_like_user.createtime
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_like_user.updatetime
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_like_user.updateuser
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    private String updateuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_like_user.createdate
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_like_user.updatedate
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    private String updatedate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_like_user.userid
     *
     * @return the value of t_like_user.userid
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_like_user.userid
     *
     * @param userid the value for t_like_user.userid
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_like_user.password
     *
     * @return the value of t_like_user.password
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_like_user.password
     *
     * @param password the value for t_like_user.password
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_like_user.uemail
     *
     * @return the value of t_like_user.uemail
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public String getUemail() {
        return uemail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_like_user.uemail
     *
     * @param uemail the value for t_like_user.uemail
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_like_user.uname
     *
     * @return the value of t_like_user.uname
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_like_user.uname
     *
     * @param uname the value for t_like_user.uname
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_like_user.createtime
     *
     * @return the value of t_like_user.createtime
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_like_user.createtime
     *
     * @param createtime the value for t_like_user.createtime
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_like_user.updatetime
     *
     * @return the value of t_like_user.updatetime
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_like_user.updatetime
     *
     * @param updatetime the value for t_like_user.updatetime
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_like_user.updateuser
     *
     * @return the value of t_like_user.updateuser
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public String getUpdateuser() {
        return updateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_like_user.updateuser
     *
     * @param updateuser the value for t_like_user.updateuser
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_like_user.createdate
     *
     * @return the value of t_like_user.createdate
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_like_user.createdate
     *
     * @param createdate the value for t_like_user.createdate
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_like_user.updatedate
     *
     * @return the value of t_like_user.updatedate
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public String getUpdatedate() {
        return updatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_like_user.updatedate
     *
     * @param updatedate the value for t_like_user.updatedate
     *
     * @mbg.generated Wed Mar 27 19:07:58 CST 2019
     */
    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate == null ? null : updatedate.trim();
    }

    @Override
    public String toString() {
        return "CusUser{" +
                "userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", uemail='" + uemail + '\'' +
                ", uname='" + uname + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", updateuser='" + updateuser + '\'' +
                ", createdate=" + createdate +
                ", updatedate='" + updatedate + '\'' +
                '}';
    }
}