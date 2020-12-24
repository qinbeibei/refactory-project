package com.test.refactoring.organizemethod.after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.test.refactoring.organizedata.after.FaceParam;
import com.test.refactoring.organizedata.after.Image;

public class CompareServiceImpl implements CompareService {

	private static final String SHARE_ICMS_TEMP = "/share/icmsTemp/";

	@Override
	public Result CompareTwoFaces(FaceParam param) {
		Result result = checkParam(param);
		if ("0000".equals(result.getCode())) {
			Result compareResult = doCompare(param);
			saveTradeInfo();
			return compareResult;
		}
		return result;
	}

	private void saveTradeInfo() {
		// TODO Auto-generated method stub
	}

	private Result doCompare(FaceParam param) {
		// 生成下载路径
		// 下载
		downLoadImages(param.getImages(), getTempPath(param));

		Map<String, String> map = new HashMap<String, String>();
		// 遍历每一张图片，计算特征值
		for (int i = 0; i < param.getImages().size(); i++) {
			String feature = calculateFeature(getImagePathAndFileName(param, i));
			map.put(getPkuuid(param, i), feature);
		}
		// do something.....
		// .........
		return new Result("0000", "", true);
	}

	private String getImagePathAndFileName(FaceParam param, int i) {
		return SHARE_ICMS_TEMP + param.getBusinessId() + "/" + getPkuuid(param, i) + ".jpg";
	}

	private String getPkuuid(FaceParam param, int i) {
		return param.getImages().get(i).getPkuuid();
	}

	private String getTempPath(FaceParam param) {
		return SHARE_ICMS_TEMP + param.getBusinessId();
	}

	private String calculateFeature(String path) {
		return null;
	}

	private void downLoadImages(ArrayList<Image> images, String path) {
		// do something
	}

	private Result checkParam(FaceParam param) {
		if (param == null) {
			return new Result("0001", "illegal parameter");
		}
		if (param.getImages() == null || param.getImages().size() < 2) {
			return new Result("0001", "illegal parameter");
		}
		return new Result("0000", "");
	}

}
