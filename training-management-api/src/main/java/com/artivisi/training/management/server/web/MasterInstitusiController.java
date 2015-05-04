package com.artivisi.training.management.server.web;

import com.artivisi.training.management.server.domain.MasterInstitusi;
import com.artivisi.training.management.server.domain.service.MasterInstitusiDao;
import com.artivisi.training.management.server.exception.ResourceNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anggi
 */
@RestController
@RequestMapping("/api")
public class MasterInstitusiController {

    @Autowired
    private MasterInstitusiDao masterInstitusiDao;

    @RequestMapping(value = "/institusi", method = RequestMethod.GET)
    public Iterable<MasterInstitusi> findAll() {
        return masterInstitusiDao.findAll();
    }

    @RequestMapping(value = "/institusi/{id}", method = RequestMethod.GET)
    public MasterInstitusi findById(@PathVariable String id) {
        MasterInstitusi institusi = masterInstitusiDao.findOne(id);
        if (institusi == null) {
            throw new ResourceNotFoundException("No User with id :" + id);
        }
        return institusi;
    }

    @RequestMapping(value = "/institusi", method = RequestMethod.POST)
    public void create(@RequestBody MasterInstitusi x, HttpServletRequest request, HttpServletResponse response) {
        if (x == null) {
            throw new ResourceNotFoundException("No User to save");
        }
        masterInstitusiDao.save(x);
    }

    @RequestMapping(value = "/institusi/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable String id, @RequestBody MasterInstitusi x) {
        MasterInstitusi institusi = masterInstitusiDao.findOne(id);
        if (institusi == null) {
            throw new ResourceNotFoundException("No User with id :" + id);
        }
        x.setId(institusi.getId());
        masterInstitusiDao.save(x);
    }
}
