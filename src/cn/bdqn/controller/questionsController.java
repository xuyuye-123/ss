package cn.bdqn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.bdqn.pojo.answers;
import cn.bdqn.pojo.questions;
import cn.bdqn.service.answersService;
import cn.bdqn.service.questionsService;

@Controller
public class questionsController {
	@Resource
	private questionsService questionsService;
	@Resource
	private answersService answersService;
	@RequestMapping("/list.html")
public String GetAll(Model model){
	List<questions>list=questionsService.GetAll();
	model.addAttribute("list",list);
	return "index";
}
@RequestMapping("/Toadd.html")
public String Toadd(){
	
	return "Add";
}
@RequestMapping(value="/add.html",method = RequestMethod.POST)
public String add(questions questions){
	if (questionsService.add(questions.getTitle(),questions.getDetailDesc())==1) {
		return "redirect:/list.html";
	} else {
		return "redirect:/Toadd.html";
	}
	
}
@RequestMapping("/xiangqing.html")
public String xiangqing(@RequestParam("id")String id,Model model){
	questions questions=questionsService.Getquestions(Integer.parseInt(id));
	List<answers> answers=answersService.Getanswers(Long.parseLong(id));
	model.addAttribute("answers", answers);
	model.addAttribute("questions", questions);
	
	return "xiangqing";
}
@RequestMapping("Addanswers.html")
public String Addanswers(@RequestParam("ansContent")String ansContent,@RequestParam("qid")String qid){
	System.out.println(ansContent);
	if (answersService.Addanswers(ansContent, Long.parseLong(qid))==1) {
		
		return "redirect:/list.html";
	} else {
		return "redirect:/xiangqing.html";
	}
	
	
}
}
