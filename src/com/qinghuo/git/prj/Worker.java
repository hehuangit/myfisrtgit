package com.qinghuo.git.prj;

public class Worker {
	
	private Fetch fetcher;
	public void setFetch(Fetch fetcher) {
		this.fetcher = fetcher;
	}
	
	public void doWork() throws Exception {
		fetcher.fetch(new FetchInvokerHandler() {
			
			@Override
			public void onException(Throwable cause) {
				System.out.println(cause.toString());
			}
			@Override
			public void onDate(Data data) throws Exception {
				System.out.println(data.toString());
			}
		});
	}
	public static void main(String[] args) {
		
		Worker worker = new Worker();
		Data data = new Data();
		data.setM(6);
		data.setN(9);
		
		Fetch fetcher = new MyFetch(data);
		worker.setFetch(fetcher);
		
		try {
			worker.doWork();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
