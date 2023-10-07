package com.nutech.tugas.services.topup;

import com.nutech.tugas.payloads.requests.TopUpRequest;
import com.nutech.tugas.payloads.responses.Response;

public interface TopUpService {
    Response addTopUp(TopUpRequest request);

    Response getTopUp();
}
