package com.demo.pojo;

import com.season.core.db.Pojo;
import com.season.core.db.annotation.Transient;

import java.util.HashSet;
import java.util.Set;

/**
 * Title:社区用户表实体类
 * Description:社区用户表实体类
 * Copyright: 2015 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: bbs
 * Create User: joy
 * Create Time:2015/11/31 09:53
 */

public class Appuser extends Pojo<Appuser> {


    private Integer userid;
    private String username;
    private String loginName;
    private String truename;
    private String email;
    private String cellphoene;
    private Integer sex;
    private String birthday;
    private Integer provinceid;
    private String provincename;
    private Integer areaid;
    private String areaname;
    private Integer professionid;
    private Integer educationid;
    private Integer marriagestatus;
    private Integer homepeoples;
    private Integer homemoney;
    private Integer isrecomend;
    private String attentionproduct;
    private Integer isbought;
    private String groupid;
    private String groupdisplayname;
    private String countryname;
    private Integer actived;
    private Integer registerstatus;
    private Integer registertype;
    private Integer papertype;
    private String papernumber;
    private String membercard;
    private String firstname;
    private String lastname;
    private String occupation;
    private Integer addresstype;
    private String company;
    private String street;
    private String city;
    private String postalcode;
    private String telePhone;
    private String countyName;
    private String landMarkBuilding;
    private String addressRoad;
    private String detailAddress;
    private String tempProvName;
    private String tempAreaName;
    private String headPath;
    private String createddate;
    private String lastlogindate;
    private String lastlogoutdate;
    private Integer logintimes;
    private String myphoto;
    private String headurl;
    // 子女数量
    private Integer childrenNum;
    // 房屋类型
    private Integer dwellingType;
    // 居室类型 室
    private Integer roomType;
    // 居室类型 厅
    private Integer hallType;
    // 房屋拥有
    private Integer homeowners;
    // 房屋面积
    private Integer housingArea;
    // 爱好
    private String likes;
    private String upLikeTime;

    // 喜欢的电视节目
    private String likeTvs;
    private String upLikeTvTime;
    // 星级
    private Integer starUser;
    // 用户属性修改时间
    private String upAppuserTime;
    // ids用户表中userId
    private Integer idsUserId;
    // 会员通过vip登录标识 0为默认，代表其他用户，1代表会员曾经通过vip登录或注册。
    private Integer loginByVip;
    // 会员补全信息标识 0为默认，无积分赠送；
    // 1代表通过注册产品-补全个人信息补全过个人信息，赠送100积分；
    // 2代表通过我的资料-个人信息模块补全过个人信息，赠送200积分；
    // 1,2代表用户在注册产品-补全个人信息和我的资料-个人信息模块都补全过个人信息，赠送300积分。
    private String userInfoFlg;
    // 会员是否完善过信息 0未完善过 1完善过
    private Integer userInfoed;
    // 总积分
    private Integer score;
    // 消费积分
    private Integer expendScore;
    // myhaier是否提示过信息
    private Integer isAlert;

    @Transient
    private Set commentactions = new HashSet(0);
    @Transient
    private Set productcollections = new HashSet(0);
    @Transient
    private Set commententities = new HashSet(0);

    // Constructors

    /**
     * default constructor
     */
    public Appuser() {
    }

    /**
     * minimal constructor
     */
    public Appuser(String username, String truename, String email,
                   String cellphoene, Integer sex, String birthday) {
        this.username = username;
        this.truename = truename;
        this.email = email;
        this.cellphoene = cellphoene;
        this.sex = sex;
        this.birthday = birthday;
    }

    /**
     * full constructor
     */
    public Appuser(String username, String truename, String email,
                   String cellphoene, Integer sex, String birthday,
                   Integer provinceid, String provincename, Integer areaid,
                   String areaname, Integer professionid, Integer educationid,
                   Integer marriagestatus, Integer homepeoples, Integer homemoney,
                   Integer isrecomend, String attentionproduct, Integer isbought,
                   Set commentactions, Set productcollections, Set commententities) {
        this.username = username;
        this.truename = truename;
        this.email = email;
        this.cellphoene = cellphoene;
        this.sex = sex;
        this.birthday = birthday;
        this.provinceid = provinceid;
        this.provincename = provincename;
        this.areaid = areaid;
        this.areaname = areaname;
        this.professionid = professionid;
        this.educationid = educationid;
        this.marriagestatus = marriagestatus;
        this.homepeoples = homepeoples;
        this.homemoney = homemoney;
        this.isrecomend = isrecomend;
        this.attentionproduct = attentionproduct;
        this.isbought = isbought;
        this.commentactions = commentactions;
        this.productcollections = productcollections;
        this.commententities = commententities;
    }

    // Property accessors

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return o;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public String getMyphoto() {
        return myphoto;
    }

    public void setMyphoto(String myphoto) {
        this.myphoto = myphoto;
    }

    public Integer getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }

    public String getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(String lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public String getLastlogoutdate() {
        return lastlogoutdate;
    }

    public void setLastlogoutdate(String lastlogoutdate) {
        this.lastlogoutdate = lastlogoutdate;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getHeadPath() {
        return headPath;
    }

    public void setHeadPath(String headPath) {
        this.headPath = headPath;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getLandMarkBuilding() {
        return landMarkBuilding;
    }

    public void setLandMarkBuilding(String landMarkBuilding) {
        this.landMarkBuilding = landMarkBuilding;
    }

    public String getAddressRoad() {
        return addressRoad;
    }

    public void setAddressRoad(String addressRoad) {
        this.addressRoad = addressRoad;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Integer getAddresstype() {
        return addresstype;
    }

    public void setAddresstype(Integer addresstype) {
        this.addresstype = addresstype;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public Integer getPapertype() {
        return papertype;
    }

    public void setPapertype(Integer papertype) {
        this.papertype = papertype;
    }

    public String getPapernumber() {
        return papernumber;
    }

    public void setPapernumber(String papernumber) {
        this.papernumber = papernumber;
    }

    public String getMembercard() {
        return membercard;
    }

    public void setMembercard(String membercard) {
        this.membercard = membercard;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getGroupdisplayname() {
        return groupdisplayname;
    }

    public void setGroupdisplayname(String groupdisplayname) {
        this.groupdisplayname = groupdisplayname;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public Integer getActived() {
        return actived;
    }

    public void setActived(Integer actived) {
        this.actived = actived;
    }

    public Integer getRegisterstatus() {
        return registerstatus;
    }

    public void setRegisterstatus(Integer registerstatus) {
        this.registerstatus = registerstatus;
    }

    public Integer getRegistertype() {
        return registertype;
    }

    public void setRegistertype(Integer registertype) {
        this.registertype = registertype;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTruename() {
        return this.truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphoene() {
        return this.cellphoene;
    }

    public void setCellphoene(String cellphoene) {
        this.cellphoene = cellphoene;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getProvinceid() {
        return this.provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return this.provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public Integer getAreaid() {
        return this.areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return this.areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public Integer getProfessionid() {
        return this.professionid;
    }

    public void setProfessionid(Integer professionid) {
        this.professionid = professionid;
    }

    public Integer getEducationid() {
        return this.educationid;
    }

    public void setEducationid(Integer educationid) {
        this.educationid = educationid;
    }

    public Integer getMarriagestatus() {
        return this.marriagestatus;
    }

    public void setMarriagestatus(Integer marriagestatus) {
        this.marriagestatus = marriagestatus;
    }

    public Integer getHomepeoples() {
        return this.homepeoples;
    }

    public void setHomepeoples(Integer homepeoples) {
        this.homepeoples = homepeoples;
    }

    public Integer getHomemoney() {
        return this.homemoney;
    }

    public void setHomemoney(Integer homemoney) {
        this.homemoney = homemoney;
    }

    public Integer getIsrecomend() {
        return this.isrecomend;
    }

    public void setIsrecomend(Integer isrecomend) {
        this.isrecomend = isrecomend;
    }

    public String getAttentionproduct() {
        return this.attentionproduct;
    }

    public void setAttentionproduct(String attentionproduct) {
        this.attentionproduct = attentionproduct;
    }

    public Integer getIsbought() {
        return this.isbought;
    }

    public void setIsbought(Integer isbought) {
        this.isbought = isbought;
    }

    public Set getCommentactions() {
        return this.commentactions;
    }

    public void setCommentactions(Set commentactions) {
        this.commentactions = commentactions;
    }

    public Set getProductcollections() {
        return this.productcollections;
    }

    public void setProductcollections(Set productcollections) {
        this.productcollections = productcollections;
    }

    public Set getCommententities() {
        return this.commententities;
    }

    public void setCommententities(Set commententities) {
        this.commententities = commententities;
    }

    public String getTempProvName() {
        return tempProvName;
    }

    public void setTempProvName(String tempProvName) {
        this.tempProvName = tempProvName;
    }

    public String getTempAreaName() {
        return tempAreaName;
    }

    public void setTempAreaName(String tempAreaName) {
        this.tempAreaName = tempAreaName;
    }

    public Integer getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(Integer childrenNum) {
        this.childrenNum = childrenNum;
    }

    public Integer getDwellingType() {
        return dwellingType;
    }

    public void setDwellingType(Integer dwellingType) {
        this.dwellingType = dwellingType;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Integer getHallType() {
        return hallType;
    }

    public void setHallType(Integer hallType) {
        this.hallType = hallType;
    }

    public Integer getHomeowners() {
        return homeowners;
    }

    public void setHomeowners(Integer homeowners) {
        this.homeowners = homeowners;
    }

    public Integer getHousingArea() {
        return housingArea;
    }

    public void setHousingArea(Integer housingArea) {
        this.housingArea = housingArea;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getLikeTvs() {
        return likeTvs;
    }

    public void setLikeTvs(String likeTvs) {
        this.likeTvs = likeTvs;
    }

    public Integer getStarUser() {
        return starUser;
    }

    public void setStarUser(Integer starUser) {
        this.starUser = starUser;
    }

    public String getUpLikeTime() {
        return upLikeTime;
    }

    public void setUpLikeTime(String upLikeTime) {
        this.upLikeTime = upLikeTime;
    }

    public String getUpLikeTvTime() {
        return upLikeTvTime;
    }

    public void setUpLikeTvTime(String upLikeTvTime) {
        this.upLikeTvTime = upLikeTvTime;
    }

    public String getUpAppuserTime() {
        return upAppuserTime;
    }

    public void setUpAppuserTime(String upAppuserTime) {
        this.upAppuserTime = upAppuserTime;
    }

    public Integer getIdsUserId() {
        return idsUserId;
    }

    public void setIdsUserId(Integer idsUserId) {
        this.idsUserId = idsUserId;
    }

    public Integer getLoginByVip() {
        return loginByVip;
    }

    public void setLoginByVip(Integer loginByVip) {
        this.loginByVip = loginByVip;
    }

    public Integer getUserInfoed() {
        return userInfoed;
    }

    public void setUserInfoed(Integer userInfoed) {
        this.userInfoed = userInfoed;
    }

    public String getUserInfoFlg() {
        return userInfoFlg;
    }

    public void setUserInfoFlg(String userInfoFlg) {
        this.userInfoFlg = userInfoFlg;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getExpendScore() {
        return expendScore;
    }

    public void setExpendScore(Integer expendScore) {
        this.expendScore = expendScore;
    }

    public Integer getIsAlert() {
        return isAlert;
    }

    public void setIsAlert(Integer isAlert) {
        this.isAlert = isAlert;
    }


}