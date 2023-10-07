package com.nutech.tugas.services.topup;

import java.util.List;

import com.nutech.tugas.models.Saldo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.nutech.tugas.payloads.responses.Response;
import com.nutech.tugas.repositories.TopUpRepository;
import com.nutech.tugas.payloads.requests.TopUpRequest;


@Service
public class TopUpServiceImpl implements TopUpService {

    @Autowired
    private TopUpRepository TopUpRepository;


    @Override
    public Response addTopUp(TopUpRequest request) {

        Saldo saldo = new Saldo();

        saldo.setIdMerchan(request.getIdMerchant());
        saldo.setSaldoAwal(request.getNominal());
        saldo.setKredit(request.getNominal());

        saldo = TopUpRepository.save(saldo);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("Topup created successfully!");
        response.setData(saldo);

        return response;
    }

    @Override
    public Response getTopUp() {

        List<Saldo> saldo = TopUpRepository.findAll();

        Response response = new Response(HttpStatus.OK.value(), "success", saldo);
        return response;
    }


}
