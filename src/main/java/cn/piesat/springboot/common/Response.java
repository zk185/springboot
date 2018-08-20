/*
 * Response.java
 * @version 1.0
 * 2018年4月24日
 * 北京航天宏图信息技术股份有限公司
 */
package cn.piesat.springboot.common;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;

public class Response {

	@JSONField(ordinal = 4)
	private int code;
	@JSONField(ordinal = 3)
	private String msg;
	@JSONField(ordinal = 2)
	private String api;
	@JSONField(ordinal = 1)
	private Object data;
	private Map<String,Object> detailsMap;

	public static Response getInstance(){
		Response response = new Response();
		return response;
	}
	
	public Response setOk(int code,String api,String msg,Object data){
		this.setCode(code);
		this.setApi(api);
		this.setMsg(msg);
		this.setData(data);
		return this;
	}
	
	public Response setOk(int code,String api,String msg,Object data,int total){
		detailsMap = new HashMap<String,Object>();
		detailsMap.put("details", data);
		detailsMap.put("total", total);

		this.setCode(code);
		this.setApi(api);
		this.setMsg(msg);
		this.setData(detailsMap);
		return this;
	}
	
	public Response setError(int code,String api,String msg){

		this.setCode(code);
		this.setApi(api);
		this.setMsg(msg);
		return this;
	}
	

	public String getApi() {
		return api;
	}

	private void setApi(String api) {
		this.api = api;
	}

	public Object getData() {
		return data;
	}

	private void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	private void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	private void setCode(int code) {
		this.code = code;
	}
	
}
