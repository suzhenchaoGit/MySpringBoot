package cn.hy.erp.service.impl;

import cn.hy.erp.service.ErpBaseService;
import org.springframework.stereotype.Service;

@Service
public class ErpBaseServiceImpl1 implements ErpBaseService {
    @Override
    public void erpServiceDeal(String param) {
        System.out.println("ErpBaseServiceImpl1");
    }

    public static void main(String[] args) {
        System.out.println("测试新加的内容是否可以正常打印！");
    }
}
