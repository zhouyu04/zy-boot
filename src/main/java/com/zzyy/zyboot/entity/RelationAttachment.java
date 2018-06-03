package com.zzyy.zyboot.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "relation_attachment")
public class RelationAttachment {
    /**
     * 主键
     */
    @Id
    @Column(name = "fileId")
    private Long fileid;

    /**
     * 案件ID
     */
    @Column(name = "caseId")
    private String caseid;

    /**
     * 附件文件名
     */
    @Column(name = "fileName")
    private String filename;

    /**
     * 附件文件路径
     */
    @Column(name = "filePath")
    private String filepath;

    /**
     * 附件文件类型
     */
    @Column(name = "fileType")
    private String filetype;

    /**
     * 附件大小
     */
    @Column(name = "fileSize")
    private Integer filesize;

    /**
     * 创建日期
     */
    @Column(name = "date_created")
    private Date dateCreated;

    /**
     * 获取主键
     *
     * @return fileId - 主键
     */
    public Long getFileid() {
        return fileid;
    }

    /**
     * 设置主键
     *
     * @param fileid 主键
     */
    public void setFileid(Long fileid) {
        this.fileid = fileid;
    }

    /**
     * 获取案件ID
     *
     * @return caseId - 案件ID
     */
    public String getCaseid() {
        return caseid;
    }

    /**
     * 设置案件ID
     *
     * @param caseid 案件ID
     */
    public void setCaseid(String caseid) {
        this.caseid = caseid == null ? null : caseid.trim();
    }

    /**
     * 获取附件文件名
     *
     * @return fileName - 附件文件名
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置附件文件名
     *
     * @param filename 附件文件名
     */
    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    /**
     * 获取附件文件路径
     *
     * @return filePath - 附件文件路径
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * 设置附件文件路径
     *
     * @param filepath 附件文件路径
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    /**
     * 获取附件文件类型
     *
     * @return fileType - 附件文件类型
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * 设置附件文件类型
     *
     * @param filetype 附件文件类型
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    /**
     * 获取附件大小
     *
     * @return fileSize - 附件大小
     */
    public Integer getFilesize() {
        return filesize;
    }

    /**
     * 设置附件大小
     *
     * @param filesize 附件大小
     */
    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    /**
     * 获取创建日期
     *
     * @return date_created - 创建日期
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * 设置创建日期
     *
     * @param dateCreated 创建日期
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
