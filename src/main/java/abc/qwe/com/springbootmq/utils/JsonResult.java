package abc.qwe.com.springbootmq.utils;

public class JsonResult {
	
	private String status;
	
	private Object result;

	public JsonResult(String status, Object result) {
		this.status = status;
		this.result = result;
	}

	public String getStatus() {
		return status;
	}
 
	public void setStatus(String status) {
		this.status = status;
	}
 
	public Object getResult() {
		return result;
	}
 
	public void setResult(Object result) {
		this.result = result;
	}
	
 
}

