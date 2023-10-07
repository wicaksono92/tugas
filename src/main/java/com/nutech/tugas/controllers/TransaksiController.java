package com.nutech.tugas.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nutech.tugas.payloads.responses.Response;
import com.nutech.tugas.services.topup.TopUpService;
import com.nutech.tugas.payloads.requests.TopUpRequest;

@RestController
@RequestMapping("/transaksi")
public class TransaksiController {

    private TopUpService topUpService;


    @PostMapping("/topup")
    public ResponseEntity<?> addTopUp(@RequestBody TopUpRequest topUpRequest) {
        try {
            Response response = topUpService.addTopUp(topUpRequest);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping()
    public ResponseEntity<?> getTopUp() {
        try {
            Response response = topUpService.getTopUp();
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
