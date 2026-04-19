package com.awsfileintegration.awsintegrationbatchjob.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.nio.file.Paths;


@Service
public class S3Service {

    private final S3Client s3Client;

    // Spring injects the bean here
    public S3Service(S3Client s3Client) {
        this.s3Client = s3Client;
    }

    public void uploadFile(String bucketName, String keyName, String filePath) {
        PutObjectRequest request = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(keyName)
                .build();

        s3Client.putObject(request, Paths.get(filePath));
        System.out.println("Uploaded: " + bucketName + "/" + keyName);
    }

}
