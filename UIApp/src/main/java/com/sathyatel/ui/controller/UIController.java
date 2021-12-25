package com.sathyatel.ui.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.sathyatel.ui.model.CallDetailsDTO;
import com.sathyatel.ui.model.ChangePlan;
import com.sathyatel.ui.model.CustomerDTO;
import com.sathyatel.ui.model.Friend;
import com.sathyatel.ui.model.Login;
import com.sathyatel.ui.model.PlanDTO;
import com.sathyatel.ui.model.RegisterBean;

@Controller
public class UIController {



	@Autowired
	private RestTemplate restTemplate;


	private static String ALLPLANS_URl="http://localhost:4444/PlanDetailsApi/allPlans";
	private static String PLAN_URl="http://localhost:4444/PlanDetailsApi/{planId}";
	private static String REGISTER_CUSTOMER_URL="http://localhost:5588/CustomerApi/register";
	private static String LOGIN_CUSTOMER_URL="http://localhost:5588/CustomerApi/login";	
	private static String CUSTOMERDETAILS_CUSTOMER_URL="http://localhost:5588/CustomerApi/profile/{phoneNo}";
	private static String ADDFRIEND_URl="http://localhost:5577/FriendApi/addFriend";
	private static String CALLDETAILS_URl="http://localhost:5555/CallDetailsApi/{phoneNumber}";
	private static String CHANGEPLAN_URl="http://localhost:4444/PlanDetailsApi/{phoneNo}";
	private static String ALLFRIENDSCONTACT_URl="http://localhost:5577/FriendApi/friends/{phoneNo}";
	private static String CUSTOMER_CHANGEPLANID_URL="http://localhost:5588/CustomerApi/changePlan";

	ParameterizedTypeReference<List<PlanDTO>> typeRef=new ParameterizedTypeReference<List<PlanDTO>>() { };
	ParameterizedTypeReference<List<CallDetailsDTO>> typeRef1=new ParameterizedTypeReference<List<CallDetailsDTO>>() { };
	@GetMapping("index")
	public String getIndexPage()
	{
		return "index";
	}

	@GetMapping("/register")
	public String getRegisterPage(Model model)
	{
		/*ParameterizedTypeReference<List<PlanDetailsDTO>> typeRef=new ParameterizedTypeReference<List<PlanDetailsDTO>>() { };*/
		ResponseEntity<List<PlanDTO>>  response =restTemplate.exchange(ALLPLANS_URl,HttpMethod.GET,null,typeRef);
		List<PlanDTO> listPlanDto=response.getBody();
		List<String> plansList=new ArrayList<String>();
		RegisterBean registerBean=new RegisterBean();
		/*for(PlanDetailsDTO planDetailsDto:listPlanDto)
		{
			String planId=planDetailsDto.getPlanId();
			plansList.add(planId);

		}*/
		registerBean.setPlanDtoList(listPlanDto);
		model.addAttribute("registerBean",registerBean);
		System.out.println(registerBean);
		return "register";   	 
	}

	@PostMapping("/addCustomer")
	public String addCustomer(@Valid @ModelAttribute RegisterBean registerBean,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			ResponseEntity<List<PlanDTO>> response=	restTemplate.exchange(ALLPLANS_URl,HttpMethod.GET,null,typeRef);
			List<PlanDTO> planDtoList=response.getBody();
			registerBean.setPlanDtoList(planDtoList);
			model.addAttribute("registerBean",registerBean);
			return "register";
		}
		else
		{
			boolean flag=restTemplate.postForObject(REGISTER_CUSTOMER_URL,registerBean,boolean.class);
			System.out.println(flag);
			if(flag==true)
			{
				model.addAttribute("msg", "customer successfully added to database");
			}else
			{
				model.addAttribute("msg", "customer already exist in database");
			}

			return "success";
		}

	}

	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@PostMapping("/checkLogin")
	public String checkLogin(@RequestParam Long phoneNo,@RequestParam String password,Model model)
	{
		Login  login=new Login();
		login.setPhoneNo(phoneNo);
		login.setPassword(password);
		System.out.println("hoiiii");
		boolean flag=restTemplate.postForObject(LOGIN_CUSTOMER_URL,login,boolean.class);
		System.out.println(flag);
		System.out.println("phoneNo is:"+login.getPhoneNo());
		CustomerDTO customerDto=restTemplate.getForObject(CUSTOMERDETAILS_CUSTOMER_URL,CustomerDTO.class,login.getPhoneNo());
		System.out.println(customerDto);
		System.out.println("before If");
		if(flag==true)
		{
			System.out.println("valid");
			model.addAttribute("phoneNo",login.getPhoneNo());

			model.addAttribute("name",customerDto.getName());
			model.addAttribute("planId",customerDto.getPlanId());

			return "home";
		}
		else
		{
			System.out.println("invalid");
			model.addAttribute("name","bad credentials");
			return "login";
		}

	}

	@GetMapping("/viewProfile")
	public String getProfile(@RequestParam Long phoneNo,Model model)
	{
		System.out.println(phoneNo);
		CustomerDTO customerDto=restTemplate.getForObject(CUSTOMERDETAILS_CUSTOMER_URL,CustomerDTO.class,phoneNo);
		model.addAttribute("customerDto",customerDto);
		model.addAttribute("phoneNo",phoneNo);
		System.out.println(customerDto);
		return "profile";
	}

	@GetMapping("/addFriendPage")
	public String getAddFriendPage()
	{

		return "addFriendPage";

	}

	@PostMapping("/addFriend")
	public String addFriend(@ModelAttribute Friend friend,Model model)
	{
		String message=restTemplate.postForObject(ADDFRIEND_URl,friend,String.class);
		model.addAttribute("message",message);
		return "addFriendPage";
	}



	@GetMapping("/allPlans")
	public String getAllPlans(Model model)
	{
		ResponseEntity<List<PlanDTO>> response=restTemplate.exchange(ALLPLANS_URl,HttpMethod.GET,null,typeRef);
		List<PlanDTO> planList=response.getBody();
		model.addAttribute("planDtoList",planList);
		
		System.out.println(planList);
		return "allPlansDetails";

	}
	@GetMapping("/callDetails")
	public String callDetails(@RequestParam Long phoneNo,Model model)
	{
		model.addAttribute("phoneNo",phoneNo);
		ResponseEntity<List<CallDetailsDTO>> response=restTemplate.exchange(CALLDETAILS_URl,HttpMethod.GET,null,typeRef1,phoneNo);
		List<CallDetailsDTO> callDtoList=response.getBody();
		model.addAttribute("callDtoList",callDtoList);
		return "callDetails";

	}

	@GetMapping("/planById")
	public String getPlanById(@RequestParam String planId,Model model)
	{
		PlanDTO planDto=restTemplate.getForObject(PLAN_URl,PlanDTO.class,planId);
		model.addAttribute("planDto",planDto);
		return "specificPlan";

	}

	@GetMapping("/changePlanId")
	public String getChangePlanIdPage(@RequestParam Long phoneNo,Model model)
	{
		CustomerDTO customerDto=restTemplate.getForObject(CHANGEPLAN_URl,CustomerDTO.class,phoneNo);
		model.addAttribute("customerDto",customerDto);
		return "changedPlanIdOfCustomer";
	}

	@GetMapping("/allFriendsContact")
	public String getAllFriendsContact(@RequestParam Long phoneNo,Model model)
	{
		ParameterizedTypeReference<List<Long>> typeRef= new ParameterizedTypeReference<List<Long>>() {}; 
		ResponseEntity<List<Long>> response=restTemplate.exchange(ALLFRIENDSCONTACT_URl,HttpMethod.GET,null,typeRef,phoneNo);
		List<Long> friendsPhoneList=response.getBody();
		System.out.println("from friend handler:"+friendsPhoneList);
		model.addAttribute("friendsPhone",friendsPhoneList);
		return "friendsConatct";

	}

	@GetMapping("/changePlanPage")
	public String getChangePlanPage(@RequestParam Long phoneNo,Model model)
	{
		System.out.println(phoneNo);
		model.addAttribute("phoneNo", phoneNo);
		return "changePlanPage";
	}
	@PostMapping("/changePlan")
	public String changePlan(@RequestParam Long phoneNo,@RequestParam String planId,Model model)
	{
		ChangePlan changePlan=new ChangePlan();
		changePlan.setPhoneNo(phoneNo);
		changePlan.setPlanId(planId);
		CustomerDTO customerDto=restTemplate.postForObject(CUSTOMER_CHANGEPLANID_URL,changePlan,CustomerDTO.class);

		model.addAttribute("customerDto",customerDto);
         model.addAttribute("msg","Customer Details With new PlanId");
		return "changedCustomerDetails";
	}

	
	@GetMapping("/home")
	public String getHomePage(@RequestParam Long phoneNo,Model model)
	{
		CustomerDTO customerDto=restTemplate.getForObject(CUSTOMERDETAILS_CUSTOMER_URL,CustomerDTO.class,phoneNo);
		model.addAttribute("phoneNo",customerDto.getPhoneNo());

		model.addAttribute("name",customerDto.getName());
		model.addAttribute("planId",customerDto.getPlanId());

		return "home";
	}
	
	
	
	
	
	
	
	
}
