package com.example.friendList.domain;

import java.util.ArrayList;

public class FriendWrapper {

	private ArrayList<FriendWrapper> friendList;
	
	public ArrayList<FriendWrapper> getFriendList() {
		return friendList;
	}
	public void setFriendList(ArrayList<FriendWrapper> friends) {
		this.friendList = friends;
	}
}
