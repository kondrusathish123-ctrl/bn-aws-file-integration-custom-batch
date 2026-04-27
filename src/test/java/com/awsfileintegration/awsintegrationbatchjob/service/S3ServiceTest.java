package com.awsfileintegration.awsintegrationbatchjob.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;

import java.nio.file.Path;


import static org.mockito.AdditionalMatchers.eq;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class S3ServiceTest {
    @Mock
    private S3Client mockS3Client;
    @InjectMocks
    private S3Service s3Service;

    @Test
    void testUploadFile() {
        System.out.println("first test case");
        s3Service.uploadFile("test-bucket","test-key","test.txt");
        //Assert
        verify(mockS3Client, times(1))
                .putObject(any(PutObjectRequest.class), any(Path.class));
    }
}
