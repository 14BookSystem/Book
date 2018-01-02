package com.common.action;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.common.model.Comments;
import com.common.service.CommentsService;



public class CommentsAction extends BaseAction{
	private CommentsService commentsservice;
	private Comments comments;
	private String jsonString;
	private String comment;
	private int userid;
	private int bioid;
	private List<Comments> list = new ArrayList<Comments>();
	
	
	
	public String save(){
		comments= new Comments();
		comments.setUserid(userid);
		comments.setContent(comment);
		comments.setCommitdate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		comments.setBioid(bioid);
		boolean flag = commentsservice.save(comments);
		if(flag){
			jsonString="1";
		}else{
			jsonString="0";
		}
		
		return SUCCESS;
	}
	
	public String list(){
		list = commentsservice.list();
		return SUCCESS;
	}

	
	public String add(){
		return SUCCESS;
	}

	
	
	public String listjson(){
		jsonString = commentsservice.listbybiotech(bioid);
		return SUCCESS;
}
	
	
	public String delete(){
		commentsservice.del(comments);
		return SUCCESS;
	}





	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}



	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public CommentsService getCommentsservice() {
		return commentsservice;
	}

	public void setCommentsservice(CommentsService commentsservice) {
		this.commentsservice = commentsservice;
	}

	public Comments getComments() {
		return comments;
	}

	public void setComments(Comments comments) {
		this.comments = comments;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<Comments> getList() {
		return list;
	}

	public void setList(List<Comments> list) {
		this.list = list;
	}

	public int getBioid() {
		return bioid;
	}

	public void setBioid(int bioid) {
		this.bioid = bioid;
	}





	
	
	

}
