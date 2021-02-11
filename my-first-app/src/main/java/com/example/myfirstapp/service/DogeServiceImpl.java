package com.example.myfirstapp.service;



import com.example.myfirstapp.model.Doges;
import com.example.myfirstapp.repository.DogeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DogeServiceImpl implements DogeService {
    @Autowired
    DogeRepository dogeRepository;
    @Override
    public Iterable<Doges> getDoges() {
        return dogeRepository.findAll();
    }
    @Override
    public Doges findDogeById(Long id) {
        return dogeRepository.findById(id).get();
    }
    @Override
    public Doges createDoge(Doges doge) {
        return dogeRepository.save(doge);
    }
    @Override
    public Doges updateDoge(Doges doge) {
        return dogeRepository.save(doge);
    }
    @Override
    public HttpStatus deleteDoge(Long id) {
        dogeRepository.deleteById(id);
        return HttpStatus.OK;
    }
}