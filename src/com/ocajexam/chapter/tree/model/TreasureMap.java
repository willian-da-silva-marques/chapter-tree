package com.ocajexam.chapter.tree.model;

import java.io.Serializable;

public class TreasureMap implements Serializable {

	private static final long serialVersionUID = 6272297215831918348L;

	private String owner;
	private String location;
	
	public TreasureMap(String owner, String location) {
		this.owner = owner;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Map Owner: " + this.owner + ", treasure location: " + this.location;
	}
}