package com.common.service;

import java.util.List;

import com.common.model.Comments;






public interface CommentsService {
	
	public boolean save(Comments comments);
	public boolean del(Comments comments);
	public List<Comments> list();
	public String listbybiotech(int biotechid);
	

}
