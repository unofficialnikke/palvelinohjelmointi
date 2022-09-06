package com.example.friendList.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.friendList.domain.FriendWrapper;


@Controller
public class FriendController {

	private ArrayList<FriendWrapper> allFriendsWrapped = new ArrayList<FriendWrapper>();
	
	@GetMapping("/index")
	public String friendAdd(Model model) {
		FriendWrapper wrapper = new FriendWrapper();
		wrapper.setFriendList(allFriendsWrapped);
		
		model.addAttribute("wrapper", wrapper);
		return "list";
	}
	@PostMapping("/index")
		public String friendSubmit(@ModelAttribute FriendWrapper wrapper, Model model) {
		
		System.out.println(wrapper.getFriendList() != null ? wrapper.getFriendList().size() : "null list");
	    System.out.println("--");
		
		model.addAttribute("wrapper", wrapper);
		return "list";
	}
	
	
	
	
}
