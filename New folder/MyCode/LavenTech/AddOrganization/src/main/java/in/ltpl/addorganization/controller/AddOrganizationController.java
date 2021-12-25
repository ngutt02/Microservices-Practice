package in.ltpl.addorganization.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ltpl.addorganization.repository.AddOrganizationRepository;

@Controller
public class AddOrganizationController {
	
	@Autowired
	AddOrganizationRepository repository;
	
	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
		
	}
	
	@GetMapping("/addOrganization")
	public String addOrganizationPage(Model model) {
		in.ltpl.addorganization.model.AddOrganization addOrg=new in.ltpl.addorganization.model.AddOrganization();
		model.addAttribute("addOrg", addOrg);
		return "addOrganisation";
		
	}
	
	@PostMapping("/save")
	public String saveOrganization(@Valid@ModelAttribute("addOrg")in.ltpl.addorganization.model.AddOrganization addOrg,BindingResult result,Model model) {
		System.out.println("from save");
				if (result.hasErrors()) {
					System.out.println(addOrg);
					System.out.println(result);
					System.out.println("from if");
					model.addAttribute("addOrg",addOrg);
			return "addOrganisation";
			
		}
		
		else {
			System.out.println("from else");
			
			in.ltpl.addorganization.entity.AddOrganization org=new in.ltpl.addorganization.entity.AddOrganization();
			BeanUtils.copyProperties(addOrg, org);
			boolean flag=repository.existsById(org.getOrganisationsid());

			repository.save(org);
			 model.addAttribute("message","Organization added successfully");
		}
		return "index";
		
		}
	
	
	 @GetMapping("/organizationList") 
	  public String listOrganization(Model model) {
		 
		 List<in.ltpl.addorganization.entity.AddOrganization> orgList=repository.findAll();
		 List<in.ltpl.addorganization.model.AddOrganization> orgList2=new ArrayList<>();
		 BeanUtils.copyProperties(orgList, orgList2);
		 model.addAttribute("organization", orgList);
		return "organizationList";
	 
	 }
	 
	 @GetMapping("/deleteOrganization")
	 public String deleteEmployee(@RequestParam("organisationsid")Integer id,ModelMap model) {
		 
		 repository.deleteById(id);
		 List<in.ltpl.addorganization.entity.AddOrganization> orgList=repository.findAll();
		 model.addAttribute("organization", orgList);
		 
		 
		return "organizationList";
		 
		 
	 }
	 
	 @GetMapping("/editOrganization")
	 public String getEditOrganization(@RequestParam("organisationsid")Integer id,Model model) {
		 Optional<in.ltpl.addorganization.entity.AddOrganization> opt=repository.findById(id);
		 in.ltpl.addorganization.entity.AddOrganization entityOrg=opt.get();
		 
		 in.ltpl.addorganization.model.AddOrganization modelOrg=new in.ltpl.addorganization.model.AddOrganization();
		 
		 BeanUtils.copyProperties(entityOrg, modelOrg);
		 
		 model.addAttribute("addOrg", modelOrg);
		return "editOrganization";
		 
	 }
	 
	 @PostMapping("/update")
	 public String updateOrganization(@ModelAttribute("addOrg") in.ltpl.addorganization.model.AddOrganization modelOrganization,Model model) {
		 
		
		  in.ltpl.addorganization.entity.AddOrganization entityOrganization=new
		  in.ltpl.addorganization.entity.AddOrganization();
		  
		  BeanUtils.copyProperties(modelOrganization, entityOrganization);
		  repository.saveAndFlush(entityOrganization);
		  
		  return "redirect:organizationList";
		 
	 }
	 
	
	  @GetMapping("/search") public String
	  searchOrganizationByShortName(@RequestParam("organisationshortname") String
	  organisationshortname , Model model) {
	  System.out.println(organisationshortname);
	  if (organisationshortname==null) { 
		  System.out.println("from null");
		  return "redirect:organizationList";
	  
	  }
	  
	  else {
		  
		  System.out.println("from else");
	  
	  
	  List<in.ltpl.addorganization.entity.AddOrganization>
	  orgList=repository.findByOrganisationshortname(organisationshortname);
	  System.out.println(orgList);
	  model.addAttribute("organization", orgList); return "organizationList";
	  
	  }
	  
	  }
	 
}
