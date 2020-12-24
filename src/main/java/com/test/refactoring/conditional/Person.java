package com.test.refactoring.conditional;

public class Person {
	private String _idType;
	private String _idNo;
	private String _name;

	public boolean normalCheck() {
		if (idTypeIlleagle() || idNoEmpty()) {
			return false;
		}
		return true;
	}

	private boolean idNoEmpty() {
		return _idNo == null || "".equals(_idNo);
	}

	private boolean idTypeIlleagle() {
		return _idType == null || _idType.length() != 2;
	}

	public boolean specialCheck() {
		if (normalCheck() && idNoLenIs18()) {
			return true;
		}
		return false;
	}

	private boolean idNoLenIs18() {
		return _idType == "01" && _idNo.length() == 18;
	}

	public String get_idNo() {
		return _idNo;
	}

	public void set_idNo(String _idNo) {
		this._idNo = _idNo;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_idType() {
		return _idType;
	}

	public void set_idType(String _idType) {
		this._idType = _idType;
	}

}
