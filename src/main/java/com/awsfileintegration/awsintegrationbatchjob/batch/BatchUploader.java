package com.awsfileintegration.awsintegrationbatchjob.batch;

import com.awsfileintegration.awsintegrationbatchjob.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BatchUploader implements CommandLineRunner {
    private final S3Service s3Service;

    @Autowired
    public BatchUploader(S3Service s3Service) {
        this.s3Service = s3Service;
    }

    @Override
    public void run(String... args) {
        s3Service.uploadFile("bn-awsfileintegation-my-batch-bucket", "data/file1.txt", "C:\\users\\admin\\file1.txt");
        s3Service.uploadFile("bn-awsfileintegation-my-batch-bucket", "data/file2.txt", "C:\\users\\admin\\file2.txt");
    }
}
