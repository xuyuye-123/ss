package cn.bdqn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.answers;
import cn.bdqn.pojo.questions;

public interface questionsService {
	List<questions>GetAll();
	int add(String title,String detailDesc);
	questions Getquestions(int id);
}
