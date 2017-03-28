package com.qinghuo.git.prj;
/**
 * È¡Êý¼àÌýÆ÷.
 * @author hehuan
 *
 */
public interface FetchInvokerHandler {

	void onDate(Data data) throws Exception;
	void onException(Throwable cause);
}
