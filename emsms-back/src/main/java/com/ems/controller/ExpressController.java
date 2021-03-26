package com.ems.controller;

import com.ems.pojo.Express;
import com.ems.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lcy
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/main")
public class ExpressController {
    @Autowired
    private ExpressService expressService;

    @GetMapping("/")
    public List<Express> main(){
        List<Express> expressList=expressService.findExpress();
        return expressList;
    }

    @PostMapping("/getThings")
    public String getThings(@RequestParam("emsId") String emsId){
        int result=expressService.getThings(emsId);
        if (result==1){
            return "true";
        }else {
            return "false";
        }
    }

    @PostMapping("/findExpress")
    public List<Express> findExpressByIssue(Express express){
        List<Express> expressList=expressService.findExpressByIssue(express);
        return expressList;
    }

    @PostMapping("/addExpress")
    public String addExpress(Express express){
        System.out.println(express);
        int result=expressService.addExpress(express);
        if (result==1){
            return "true";
        }else {
            return "false";
        }
    }


}
