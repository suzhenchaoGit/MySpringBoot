package cn.hy.erp.service.impl;

import cn.hy.erp.service.ErpBaseService;
import org.springframework.stereotype.Service;

@Service
public class ErpBaseServiceImpl1 implements ErpBaseService {
    @Override
    public void erpServiceDeal(String param) {
        System.out.println("ErpBaseServiceImpl1");
    }
}
