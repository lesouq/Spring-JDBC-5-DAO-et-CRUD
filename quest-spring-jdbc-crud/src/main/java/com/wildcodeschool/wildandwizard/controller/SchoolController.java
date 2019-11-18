package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.entity.School;
import com.wildcodeschool.wildandwizard.entity.Wizard;
import com.wildcodeschool.wildandwizard.repository.CrudDao;
import com.wildcodeschool.wildandwizard.repository.SchoolRepository;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SchoolController implements CrudDao<Wizard>{

    private SchoolRepository repository = new SchoolRepository();

    @GetMapping("/schools")
    public String getAll(Model model) {

        model.addAttribute("schools", repository.findAll());

        return "schools";
    }

    @GetMapping("/school")
    public String getSchool(Model model,
                            @RequestParam(required = false) Long id) {

        School school = new School();
        if (id != null) {
            school = repository.findById(id);
        }
        model.addAttribute("school", school);

        return "school";
    }

    @PostMapping("/school")
    public String postSchool(@ModelAttribute School school) {

        if (school.getId() != null) {
            repository.update(school);
        } else {
            repository.save(school);
        }
        return "redirect:/schools";
    }

    @GetMapping("/school/delete")
    public String deleteSchool(@RequestParam Long id) {

        repository.deleteById(id);

        return "redirect:/schools";
    }

	@Override
	public Wizard save(Wizard wizard) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wizard findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Wizard> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wizard update(Wizard wizard) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	
}
