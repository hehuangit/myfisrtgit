package com.qinghuo.git.prj;
/**
 * 
 * @author hehuan
 *
 */
public class MyFetch implements Fetch {

	final Data data;
	public MyFetch(Data data) {
		this.data = data;
	}
	@Override
	public void fetch(FetchInvokerHandler handler) throws Exception {
		try {
			handler.onDate(data);
		} catch(Exception e) {
			handler.onException(e);
		}
		
	}

}
