package cn.hy.erp.controller;

import cn.hy.erp.enums.ErpServiceImplEnum;
import cn.hy.erp.util.ErpServiceRegister;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ErpController {

    @PostMapping("/erpDeal")
    public void erpDeal(String param){
        String fc = JSONObject.parseObject(param).getString("FC");
        String serviceImplName = ErpServiceImplEnum.getServiceImplName(fc);
        ErpServiceRegister.getErpServiceImpl(serviceImplName).erpServiceDeal(param);
    }
}
