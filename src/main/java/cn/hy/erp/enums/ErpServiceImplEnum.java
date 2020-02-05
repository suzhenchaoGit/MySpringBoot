package cn.hy.erp.enums;

import lombok.Getter;

@Getter
public enum ErpServiceImplEnum {
    SERVICE_1("FC1","erpServiceImpl1"),
    SERVICE_2("FC2","erpServiceImpl2");

    private String fc;
    private String code;

    ErpServiceImplEnum(String code, String fc) {
        this.code = code;
        this.fc = fc;
    }

    public static ErpServiceImplEnum getEnumByInstance(String fc){
        for (ErpServiceImplEnum erpServiceImplEnum: ErpServiceImplEnum.values()) {
            if (erpServiceImplEnum.fc.equals(fc) || erpServiceImplEnum.code.equals(fc)){
                return erpServiceImplEnum;
            }
        }
        return null;
    }

    public static String getServiceImplName(String fc){
        for (ErpServiceImplEnum erpServiceImplEnum: ErpServiceImplEnum.values()) {
            if (erpServiceImplEnum.fc.equals(fc)){
                return erpServiceImplEnum.code;
            }
        }
        return null;
    }
}
