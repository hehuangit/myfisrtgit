package com.qinghuo.git.prj;
/**
 * ȡ��������.
 * @author hehuan
 *
 */
public interface FetchInvokerHandler {

	void onDate(Data data) throws Exception;
	void onException(Throwable cause);
}
