package cn.bdqn.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class questions {
private Long id;//����id
private String title;//������
private String detailDesc;//��������
private int answerCount;//�ش����
@DateTimeFormat
private Date lastModified;//����޸�ʱ��
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
