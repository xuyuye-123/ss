package cn.bdqn.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class questions {
private Long id;//问题id
private String title;//问题名
private String detailDesc;//问题描述
private int answerCount;//回答次数
@DateTimeFormat
private Date lastModified;//最后修改时间
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDetailDesc() {
	return detailDesc;
}
public void setDetailDesc(String detailDesc) {
	this.detailDesc = detailDesc;
}
public int getAnswerCount() {
	return answerCount;
}
public void setAnswerCount(int answerCount) {
	this.answerCount = answerCount;
}
public Date getLastModified() {
	return lastModified;
}
public void setLastModified(Date lastModified) {
	this.lastModified = lastModified;
}



}
