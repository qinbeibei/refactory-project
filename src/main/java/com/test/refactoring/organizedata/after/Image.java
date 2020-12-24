package com.test.refactoring.organizedata.after;

public class Image {
	private String pkuuid;

	public Image(String arg) {
		setPkuuid(arg);
	}

	public String getPkuuid() {
		return pkuuid;
	}

	public void setPkuuid(String pkuuid) {
		this.pkuuid = pkuuid;
	}

}
