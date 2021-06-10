package com.codegym.service.impl;

import com.codegym.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public List<String> loadMenu() {
        List<String> menus  = new ArrayList<>();
        menus.add("Bog Java");
        menus.add("Huong dan hoc java web");
        menus.add("Lien He");
        menus.add("Thanh Toan");
        return menus;
    }
}
