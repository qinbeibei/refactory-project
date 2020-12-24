package com.test.refactoring.organizemethod.after;

public class Result {
	private String code;
	private String msg;
	private boolean isSame = false;

	public Result(String codeArg, String msgArg, boolean isSameArg) {
		setCode(codeArg);
		setMsg(msgArg);
		setSame(isSame);
	}

	public Result(String codeArg, String msgArg) {
		setCode(codeArg);
		setMsg(msgArg);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isSame() {
		return isSame;
	}

	public void setSame(boolean isSame) {
		this.isSame = isSame;
	}
}
