package cn.bdqn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.answers;

public interface answersService {
	List<answers> Getanswers(Long qid);
	int Addanswers(String ansContent,Long qid);
}
