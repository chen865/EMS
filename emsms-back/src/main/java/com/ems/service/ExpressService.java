package com.ems.service;

import com.ems.pojo.Express;

import java.util.List;

/**
 * @author lcy
 */
public interface ExpressService {

    List<Express> findExpress();

    int getThings(String emsId);

    List<Express> findExpressByIssue(Express express);

    int addExpress(Express express);
}
