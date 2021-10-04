package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.UserMemo;
import com.example.demo.service.UserMemoService;

@Controller
@RequestMapping("/userMemo")
public class UserMemoController {

	@Autowired
	private UserMemoService userMemoService;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("userMemo", userMemoService.findAll());
		return "index";	
	}
	
    @GetMapping("{id}")
    public String show(@PathVariable Long id, Model model) {
    	model.addAttribute("userMemo", userMemoService.findOne(id));
    	return "show";
    }
    
    @GetMapping("new")
    public String newUserMemo(@ModelAttribute("userMemo") UserMemo userMemo, Model model) {
      return "new";
    }

    @GetMapping("{id}/edit")
    public String edit(@PathVariable Long id, @ModelAttribute("userMemo") UserMemo userMemo, Model model) {
      model.addAttribute("userMemo", userMemoService.findOne(id));
      return "edit";
    }
	
	@PostMapping
    public String create(@ModelAttribute("userMemo") @Validated UserMemo userMemo, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	      return "new";
	    } else {
	    	userMemoService.save(userMemo);
	      return "redirect:/userMemo";
	    }
    }
	
	@PutMapping("{id}")
    public String update(@PathVariable Long id, @ModelAttribute("userMemo") @Validated UserMemo userMemo, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	    	model.addAttribute("userMemo", userMemo);
	      	return "edit";
	    } else {
	    	userMemo.setId(id);
	    	userMemoService.update(userMemo);
	    	return "redirect:/userMemo";
	    }
    }
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable Long id) {
		userMemoService.delete(id);
		return "redirect:/userMemo"; 
	}
}
