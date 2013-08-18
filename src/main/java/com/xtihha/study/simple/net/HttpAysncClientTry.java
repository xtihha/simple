package com.xtihha.study.simple.net;

import java.util.concurrent.CountDownLatch;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.DefaultHttpAsyncClient;
import org.apache.http.nio.client.HttpAsyncClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <li>copy from http://www.oschina.net/code/snippet_54371_4566</li> <li>it
 * works well with httpasyncclient 4.0-beta2, but not the latest 4.0-beta4, ref
 * pom.xml</li>
 * 
 */
public class HttpAysncClientTry {
	private static final Logger logger = LoggerFactory
			.getLogger(HttpAysncClientTry.class);

	public static void main(String[] args) throws Exception {
		HttpAsyncClient client = new DefaultHttpAsyncClient();
		HttpGet[] requests = new HttpGet[] {
				new HttpGet("http://www.google.com.hk"),
				new HttpGet("http://www.weibo.com"),
				new HttpGet("http://www.baidu.com/") };
		final CountDownLatch latch = new CountDownLatch(requests.length);
		try {
			client.start();
			for (final HttpGet request : requests) {
				client.execute(request, new FutureCallback<HttpResponse>() {

					public void failed(Exception ex) {
						latch.countDown();
					}

					public void completed(HttpResponse response) {
						latch.countDown();
						logger.info(
								"request({}) returns respons status line({})",
								request.getRequestLine(),
								response.getStatusLine());
					}

					public void cancelled() {
						latch.countDown();
					}
				});
			}
		} finally {
			latch.await();
			client.shutdown();
		}
		logger.info("task done");
	}
}
