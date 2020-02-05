package cn.hy.erp.util;

import cn.hy.erp.service.ErpBaseService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ErpServiceRegister implements ApplicationContextAware {

    private static Map<String, ErpBaseService> erpServiceImplMap;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, ErpBaseService> erpBeans = applicationContext.getBeansOfType(ErpBaseService.class);
        erpServiceImplMap = new HashMap<>();
        erpBeans.forEach((key,value) -> erpServiceImplMap.put(value.getClass().getSimpleName(),value));
        System.out.println(erpServiceImplMap.toString());
    }
    public static ErpBaseService getErpServiceImpl(String name){
        return erpServiceImplMap.get(name);
    }
}
