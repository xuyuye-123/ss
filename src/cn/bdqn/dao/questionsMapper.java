package cn.bdqn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.answers;
import cn.bdqn.pojo.questions;

public interface questionsMapper {
	List<questions>GetAll();
	int add(@Param("title")String title,@Param("detailDesc")String detailDesc);
	questions Getquestions(@Param("id")int id);
}
