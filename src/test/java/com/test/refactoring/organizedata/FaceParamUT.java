package com.test.refactoring.organizedata;

import com.test.refactoring.organizedata.after.FaceParam;
import com.test.refactoring.organizedata.after.Image;

import junit.framework.TestCase;

public class FaceParamUT extends TestCase {
	public FaceParamUT(String name) {
		super(name);
	}

	public void test_number_of_images_is_0() {
		FaceParam param = new FaceParam();
		assertEquals(0, param.getImageSize());// 图片数量为0
	}

	public void test_one_image() {
		FaceParam param = initData();

		assertEquals(2, param.getImageSize());// 图片数量
		assertEquals("12345", param.getImagePkuuid(0));
//		assertEquals("67890", param.getImage(1).getPkuuid());
//		assertEquals("67890", param.getImages().get(1).getPkuuid());
	}

	private FaceParam initData() {
		FaceParam param = new FaceParam();

		param.addImage(new Image("12345"));
		param.addImage(new Image("67890"));
		return param;
	}
}
