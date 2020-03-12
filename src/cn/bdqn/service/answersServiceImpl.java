package cn.bdqn.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.bdqn.dao.answersMapper;
import cn.bdqn.pojo.answers;
@Service
public class answersServiceImpl implements answersService {
	@Resource
private answersMapper answersDao;
	@Override
	public List<answers> Getanswers(Long qid) {
		// TODO Auto-generated method stub
		return answersDao.Getanswers(qid);
	}
	@Override
	public int Addanswers(String ansContent, Long qid) {
		// TODO Auto-generated method stub
		return answersDao.Addanswers(ansContent, qid);
	}


}
