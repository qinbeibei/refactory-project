package com.test.refactoring.organizedata.after;

import java.util.ArrayList;

public class FaceParam {
	private String businessId;
	private ArrayList<Image> images = new ArrayList<Image>();

	// getter
	public ArrayList<Image> getImages() {
		return images;
	}

	// setter
	private void setImages(ArrayList<Image> images) {
		this.images = images;
	}

	public void addImage(Image img) {
		images.add(img);
	}

	public int getImageSize() {
		return images.size();
	}

	public String getImagePkuuid(int index) {
		return images.get(index).getPkuuid();
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
}
