package com.oep.project.mock.client;

public class Result {
	private Object body;
	private String code;

	public Result() {
	}

	public Result(Object body, String code) {
		super();
		this.body = body;
		this.code = code;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Result [body=" + body + ", code=" + code + "]";
	}

}
