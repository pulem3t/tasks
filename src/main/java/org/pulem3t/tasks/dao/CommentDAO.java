package org.pulem3t.tasks.dao;

import java.util.List;

import org.pulem3t.tasks.entry.Comment;

public interface CommentDAO {
	public List<Comment> getComments(String taskId);
	public Comment getComment(String id);
	public String addComment(Comment comment);
	public void deleteComment(String id);
	public void updateComment(Comment comment);
}
