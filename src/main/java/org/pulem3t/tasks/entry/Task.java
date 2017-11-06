package org.pulem3t.tasks.entry;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.json.JSONObject;
import org.pulem3t.tasks.enums.Status;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TASKS")
public class Task {
	
	@Id
	@Column(name = "ID")
	@Getter @Setter private String id;
	
	@Column(name = "PREFIX")
	@Getter @Setter private String prefix;
	
	@Column(name = "TITLE")
	@Getter @Setter private String title;
	
	@OneToOne
	@Getter @Setter private User author;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@Getter @Setter private User performer;
	
	@Column(name = "DESCRIPTION")
	@Getter @Setter private String description;
	
	@Column(name = "STATUS")
	@Getter @Setter private int status;
	
	@Column(name = "PRIORITY")
	@Getter @Setter private int priority;
	
	@Column(name = "CREATEDATE")
	@Getter @Setter private long createDate;
	
	@Column(name = "LASTMODDATE")
	@Getter @Setter private long lastmodDate;
	
	@Column(name = "DEADLINE")
	@Getter @Setter private long deadLine;

	public Task() {
		this.id = "";
		this.prefix = "";
		this.title = "";
		this.author = null;
		this.performer = null;
		this.description = "";
		this.status = Status.NEW.getStatus();
		this.priority = 0;
		this.createDate = System.currentTimeMillis();
		this.lastmodDate = System.currentTimeMillis();
		this.deadLine = 0;
	}
	
	@Override
	public String toString() {
		JSONObject o = new JSONObject();
		o.put("id", this.id);
		o.put("prefix", this.prefix);
		o.put("title", this.title);
		o.put("author", this.author);
		o.put("performer", this.performer);
		o.put("description", this.description);
		o.put("status", this.status);
		o.put("priority", this.priority);
		o.put("createDate", this.createDate);
		o.put("lastmodDate", this.lastmodDate);
		o.put("deadLine", this.deadLine);
		return o.toString();
	}
}
