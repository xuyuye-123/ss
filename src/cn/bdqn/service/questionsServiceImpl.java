package cn.bdqn.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.bdqn.dao.questionsMapper;
import cn.bdqn.pojo.answers;
import cn.bdqn.pojo.questions;
@Service
public class questionsServiceImpl implements questionsService {
	@Resource
	private questionsMapper questionsDao;
	@Override
	public List<questions> GetAll() {
		// TODO Auto-generated method stub
		return questionsDao.GetAll();
	}
	
	@Override
	public int add(String title,String detailDesc) {
		// TODO Auto-generated method stub
		return questionsDao.add(title,detailDesc);
	}

	@Override
	public questions Getquestions(int id) {
		// TODO Auto-generated method stub
		return questionsDao.Getquestions(id);
	}
}
