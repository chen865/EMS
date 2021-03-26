package com.ems.service.impl;

import com.ems.dao.ExpressDao;
import com.ems.pojo.Express;
import com.ems.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lcy
 */
@Service
public class ExpressImpl implements ExpressService {

    @Autowired
    private ExpressDao expressDao;


    @Override
    public List<Express> findExpress() {
        return expressDao.findExpress();
    }

    @Override
    public int getThings(String emsId) {
        return expressDao.getThings(emsId);
    }

    @Override
    public List<Express> findExpressByIssue(Express express) {
        return expressDao.findExpressByIssue(express);
    }

    @Override
    public int addExpress(Express express) {
        return expressDao.addExpress(express);
    }
}
