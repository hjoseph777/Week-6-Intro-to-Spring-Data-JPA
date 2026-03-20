package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.repository.FighterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FighterService {

    private final FighterRepository fighterRepository;

    public FighterService(FighterRepository fighterRepository) {
        this.fighterRepository = fighterRepository;
    }

    public List<Fighter> findAll() {
        return fighterRepository.findAll();
    }

    public void save(Fighter fighter) {
        fighterRepository.save(fighter);
    }

    public Fighter findById(Long id) {
        return fighterRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        fighterRepository.deleteById(id);
    }

    public long count() {
        return fighterRepository.count();
    }

    public boolean existsById(Long id) {
        return fighterRepository.existsById(id);
    }

}
