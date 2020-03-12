package cn.bdqn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.answers;

public interface answersMapper {
	List<answers> Getanswers(@Param("qid")Long qid);
	int Addanswers(@Param("ansContent")String ansContent,@Param("qid")Long qid);
}
