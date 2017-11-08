package com.demo.pojo;

import com.season.core.db.Pojo;
import com.season.core.db.annotation.TableInfo;
import com.season.core.db.annotation.Transient;

import java.util.Date;
import java.util.List;

/**
 * Title:社区帖子表实体类
 * Description:社区帖子表实体类
 * Copyright: 2015 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: bbs
 * Create User: zhang.mingxuan
 * Create Time:2015/12/9 14:42
 */
@TableInfo(tableName = BBSThread.TABLENAME, pkName = "tid")
public class BBSThread extends Pojo<BBSThread> {
    public final static String TABLENAME = "trs_forum_thread";
    public final static BBSThread me = new BBSThread();

    private int tid;//帖子id
    private int fid;//板块id
    private int posttableid;
    private int typeid;//产品线id
    private int sortid;
    private int readperm;
    private int price;
    private String author;//发帖人
    private int authorid;//发帖人id
    private String subject;//帖子标题
    private int dateline;//发帖时间
    private int lastpost;//最后回复时间，默认为发帖时间
    private String lastposter;//最后回复人，默认为发帖人
    private int views;//浏览次数
    private int replies;//回复数
    private int displayorder;//帖子状态，-3 未通过审核 -2 未审核 -1 逻辑删除 0 审核通过  >0  置顶
    private int highlight;
    private int digest;//旧版的推荐
    private int rate;
    private int special;//帖子类型  0文章贴 1图片贴 2 专题帖 3 视频贴 4 app贴 5 晒秀  6竞彩 7发投票 8发征集 10同城活动
    private int attachment;
    private int moderated;
    private int closed;
    private int stickreply;//帖子标识，用来标识新人贴，0为不是新人贴，1为新人贴
    private int recommends;
    private int recommend_add;
    private int recommend_sub;
    private int heats;
    private int status;
    private int isgroup;
    private int favtimes;
    private int lookanswer;//产线下子版块id
    private int sharetimes;
    private int stamp;//-1 默认值 奖励类型0为海贝奖励 1为实物奖励 2为海贝+实物 -2为奖励已发放,-3未审核通过返还海贝，-4无评论返还海贝
    private int icon;
    private int pushedaid;//评论数量限制 默认值 0 为不限制
    private String area;//地区
    private String shortmess;//简介
    private String shortimgs;//帖子中的前三张图片
    private String tags;//标签
    private String ykFlag;//优酷视频审核标志 0未审核,1审核通过,2审核未通过
    private String winners;//中奖名单
    private int researchs;//调研数
    private int isvisible;//可见标示，0投票后可见，1任何人可见
    private String startdate;//开始时间
    private String enddate;//结束时间
    private int boolshow;//精华 0不是 1是
    private String actstartdate;//活动开始时间
    private String actenddate;//活动结束时间
    private Integer original;//原创标志 0为非原创，1为原创
    private String rewardenddate;//有奖活动奖励截止时间
    private Integer zan;//帖子赞数
    private Integer chnid;//板块id，活动汇fid存87，如果活动汇在板块下，此字段存板块id，产线下的活动汇此字段为0
    private String link;//发布同城活动帖的时候这个字段存贮报名截至时间
    @Transient
    private Date DatelineD;//
    @Transient
    private String datelineStr;//
    @Transient
    private List<String> taglist;//
    @Transient
    private int taglistcount;//
    @Transient
    private String topicBanner;//专题帖的缩略图


    public String getTopicBanner() {
        return topicBanner;
    }

    public void setTopicBanner(String topicBanner) {
        this.topicBanner = topicBanner;
    }

    // add by Vincent 评论是否仅管理员可见字段，数据库已存在，加入实体类 start
    private Integer authority;

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }
    // add by Vincent 评论是否仅管理员可见字段，数据库已存在，加入实体类 end

    @Transient
    private String message;//帖子内容，这个字段不入库,只是暂时用来存放帖子内容


    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getPosttableid() {
        return posttableid;
    }

    public void setPosttableid(int posttableid) {
        this.posttableid = posttableid;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public int getSortid() {
        return sortid;
    }

    public void setSortid(int sortid) {
        this.sortid = sortid;
    }

    public int getReadperm() {
        return readperm;
    }

    public void setReadperm(int readperm) {
        this.readperm = readperm;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getDateline() {
        return dateline;
    }

    public void setDateline(int dateline) {
        this.dateline = dateline;
    }

    public int getLastpost() {
        return lastpost;
    }

    public void setLastpost(int lastpost) {
        this.lastpost = lastpost;
    }

    public String getLastposter() {
        return lastposter;
    }

    public void setLastposter(String lastposter) {
        this.lastposter = lastposter;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getReplies() {
        return replies;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public int getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(int displayorder) {
        this.displayorder = displayorder;
    }

    public int getHighlight() {
        return highlight;
    }

    public void setHighlight(int highlight) {
        this.highlight = highlight;
    }

    public int getDigest() {
        return digest;
    }

    public void setDigest(int digest) {
        this.digest = digest;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getAttachment() {
        return attachment;
    }

    public void setAttachment(int attachment) {
        this.attachment = attachment;
    }

    public int getModerated() {
        return moderated;
    }

    public void setModerated(int moderated) {
        this.moderated = moderated;
    }

    public int getClosed() {
        return closed;
    }

    public void setClosed(int closed) {
        this.closed = closed;
    }

    public int getStickreply() {
        return stickreply;
    }

    public void setStickreply(int stickreply) {
        this.stickreply = stickreply;
    }

    public int getRecommends() {
        return recommends;
    }

    public void setRecommends(int recommends) {
        this.recommends = recommends;
    }

    public int getRecommend_add() {
        return recommend_add;
    }

    public void setRecommend_add(int recommend_add) {
        this.recommend_add = recommend_add;
    }

    public int getRecommend_sub() {
        return recommend_sub;
    }

    public void setRecommend_sub(int recommend_sub) {
        this.recommend_sub = recommend_sub;
    }

    public int getHeats() {
        return heats;
    }

    public void setHeats(int heats) {
        this.heats = heats;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIsgroup() {
        return isgroup;
    }

    public void setIsgroup(int isgroup) {
        this.isgroup = isgroup;
    }

    public int getFavtimes() {
        return favtimes;
    }

    public void setFavtimes(int favtimes) {
        this.favtimes = favtimes;
    }

    public int getLookanswer() {
        return lookanswer;
    }

    public void setLookanswer(int lookanswer) {
        this.lookanswer = lookanswer;
    }

    public int getSharetimes() {
        return sharetimes;
    }

    public void setSharetimes(int sharetimes) {
        this.sharetimes = sharetimes;
    }

    public int getStamp() {
        return stamp;
    }

    public void setStamp(int stamp) {
        this.stamp = stamp;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getPushedaid() {
        return pushedaid;
    }

    public void setPushedaid(int pushedaid) {
        this.pushedaid = pushedaid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getShortmess() {
        return shortmess;
    }

    public void setShortmess(String shortmess) {
        this.shortmess = shortmess;
    }

    public String getShortimgs() {
        return shortimgs;
    }

    public void setShortimgs(String shortimgs) {
        this.shortimgs = shortimgs;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getYkFlag() {
        return ykFlag;
    }

    public void setYkFlag(String ykFlag) {
        this.ykFlag = ykFlag;
    }

    public String getWinners() {
        return winners;
    }

    public void setWinners(String winners) {
        this.winners = winners;
    }

    public int getResearchs() {
        return researchs;
    }

    public void setResearchs(int researchs) {
        this.researchs = researchs;
    }

    public int getIsvisible() {
        return isvisible;
    }

    public void setIsvisible(int isvisible) {
        this.isvisible = isvisible;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public int getBoolshow() {
        return boolshow;
    }

    public void setBoolshow(int boolshow) {
        this.boolshow = boolshow;
    }

    public String getActstartdate() {
        return actstartdate;
    }

    public void setActstartdate(String actstartdate) {
        this.actstartdate = actstartdate;
    }

    public String getActenddate() {
        return actenddate;
    }

    public void setActenddate(String actenddate) {
        this.actenddate = actenddate;
    }

    public Integer getOriginal() {
        return original;
    }

    public void setOriginal(Integer original) {
        this.original = original;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRewardenddate() {
        return rewardenddate;
    }

    public void setRewardenddate(String rewardenddate) {
        this.rewardenddate = rewardenddate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getZan() {
        return zan;
    }

    public void setZan(Integer zan) {
        this.zan = zan;
    }

    public Integer getChnid() {
        return chnid;
    }

    public void setChnid(Integer chnid) {
        this.chnid = chnid;
    }

    public Date getDatelineD() {
        return DatelineD;
    }

    public void setDatelineD(Date datelineD) {
        DatelineD = datelineD;
    }

    public List<String> getTaglist() {
        return taglist;
    }

    public void setTaglist(List<String> taglist) {
        this.taglist = taglist;
    }

    public int getTaglistcount() {
        return taglistcount;
    }

    public void setTaglistcount(int taglistcount) {
        this.taglistcount = taglistcount;
    }

    public String getDatelineStr() {
        return datelineStr;
    }

    public void setDatelineStr(String datelineStr) {
        this.datelineStr = datelineStr;
    }
}
