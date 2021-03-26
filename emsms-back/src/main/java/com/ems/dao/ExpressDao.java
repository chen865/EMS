package com.ems.dao;

import com.ems.pojo.Express;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lcy
 */
@Mapper
public interface ExpressDao {

    List<Express> findExpress();

    int getThings(String emsId);

    List<Express> findExpressByIssue(Express express);

    int addExpress(Express express);
}
