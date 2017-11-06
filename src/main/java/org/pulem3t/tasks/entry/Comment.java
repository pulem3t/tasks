package org.pulem3t.tasks.entry;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.json.JSONObject;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COMMENTS")
public class Comment {

	@Id
	@Column(name = "ID")
	@Getter @Setter private String id;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@Getter @Setter private User author;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@Getter @Setter private Task task;
	
	@Column(name = "TEXT")
	@Getter @Setter private String text;
	
	@Column(name = "RATING")
	@Getter @Setter private int rating;
	
	@ElementCollection
	@Getter @Setter private List<User> relatedUsers;
	
	@Column(name = "CREATEDATE")
	@Getter @Setter private long createDate;
	
	@Column(name = "LASTMODDATE")
	@Getter @Setter private long lastmodDate;
	
	public Comment() {
		this.id = "";
		this.author = null;
		this.task = null;
		this.text = "";
		this.rating = 0;
		this.relatedUsers = new ArrayList<>();
		this.createDate = System.currentTimeMillis();
		this.lastmodDate = System.currentTimeMillis();
	}
	
	@Override
	public String toString() {
		JSONObject o = new JSONObject();
		o.put("id", this.id);
		o.put("author", this.author);
		o.put("task", this.task);
		o.put("text", this.text);
		o.put("rating", this.rating);
		o.put("relatedUsers", this.relatedUsers);
		o.put("createDate", this.createDate);
		o.put("lastmodDate", this.lastmodDate);
		return o.toString();
	}
}
