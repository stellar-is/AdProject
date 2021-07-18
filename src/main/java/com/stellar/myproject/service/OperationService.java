package com.stellar.myproject.service;

import com.stellar.myproject.entity.objects.FinalResponse;
import com.stellar.myproject.entity.objects.InputData;

public interface OperationService {
    FinalResponse operation(InputData inputData);
}
