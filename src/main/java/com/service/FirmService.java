/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.entity.Firm;
import java.util.List;

/**
 *
 * @author home
 */
public interface FirmService {
    Firm addFirm(String firm);
    Firm getByName(String name);
    Firm getById(int id);
    List<Firm> getAll();
}
