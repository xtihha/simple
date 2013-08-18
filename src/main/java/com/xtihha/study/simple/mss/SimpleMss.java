package com.xtihha.study.simple.mss;

import java.io.File;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.CreateBucketRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.util.StringUtils;

public class SimpleMss {
	private static final Logger logger = LoggerFactory
			.getLogger(SimpleMss.class);

	public static void main(String[] args) {
		String accessKey = "49eddc7629974db4adf0f73609fee1b6";
		String secretKey = "18d832b48e3c4c37b96994a292bc1080";
		String endPoint = "http://192.168.2.163";
		AWSCredentials credentials = new BasicAWSCredentials(accessKey,
				secretKey);
		ClientConfiguration cfg = new ClientConfiguration();
		cfg.setProtocol(Protocol.HTTP);

		AmazonS3 conn = new AmazonS3Client(credentials, cfg);
		conn.setEndpoint(endPoint);

		List<Bucket> buckets = conn.listBuckets();
		for (Bucket bucket : buckets) {
			logger.info("bucket({}) created at {}", bucket.getName(),
					StringUtils.fromDate(bucket.getCreationDate()));
		}

		conn.createBucket(new CreateBucketRequest("test3", "region3"));
		conn.deleteBucket("test3");
		logger.info("create bucket test3 successfully");

		String bucketName = "test2";
		String key = "k1";
		conn.putObject(new PutObjectRequest(bucketName, key, new File(
				"/Users/meituan/.m2/settings.xml")));
		logger.info("put sample object successfully");

		conn.getObject(new GetObjectRequest(bucketName, key), new File(
				"/Users/meituan/mss_download"));
		logger.info("get object successfully");
	}

}
