package com.spring.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Repository.QuestionRepo;
import com.spring.Model.Question;



@RestController()
@RequestMapping("otm")
public class QuestionController {

	@Autowired
	public QuestionRepo qrepo;
	
	@PostMapping
	public String saveDetails(@RequestBody Question q)
	{
		qrepo.save(q);
		return"Data is saved";
	}
	@GetMapping
	public List<Question> getDetails()
	{
		return qrepo.findAll();
	}
	
	@DeleteMapping("/delete/{qno}")
	public String deleteDetails(@PathVariable int qid)
	{
		qrepo.deleteById(qid);
		return qid+" deleted";
	}
}