package org.pulem3t.tasks.enums;

public enum Status {
	TEMP (-1),
	NEW (0),
	IN_WORK (1),
	CLOSED (2),
	CANCELED (3),
	TESTING (4),
	DONE (5);
	
	private int status;
	
	private Status(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
}
