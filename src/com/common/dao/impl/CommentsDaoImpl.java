package com.common.dao.impl;

import java.util.List;

import com.common.dao.CommentsDAO;
import com.common.model.Comments;


public class CommentsDaoImpl extends BaseDAO implements CommentsDAO {

	@Override
	public boolean save(Comments comments) {
		return saveOrUpdate(comments);
	}

	@Override
	public boolean del(Comments comments) {
		// TODO Auto-generated method stub
		return deleteById(Comments.class, comments.getId());
	}

	@Override
	public List<Comments> list() {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Comments ");

		List<Comments> lst = findByHQL(sb.toString());
		return lst;
	}

	@Override
	public List<Comments> listbyluxian(int bioid) {
		StringBuffer sb = new StringBuffer();
		sb = new StringBuffer("FROM Comments where bioid =").append(bioid);

		List<Comments> lst = findByHQL(sb.toString());
		return lst;
	}

}
