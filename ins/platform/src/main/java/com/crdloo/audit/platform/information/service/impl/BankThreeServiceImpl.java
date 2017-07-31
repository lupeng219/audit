package com.crdloo.audit.platform.information.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.BankThreeDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;
import com.crdloo.audit.platform.information.dao.entity.BankThreeEntity;
import com.crdloo.audit.platform.information.service.BankThreeService;
import com.crdloo.audit.platform.information.service.vo.BankThreeVo;

@Service("com.crdloo.audit.platform.information.service.impl.BankThreeServiceImpl")
public class BankThreeServiceImpl extends AbstractBfdEntityService<BankThreeDto, BankThreeEntity>  implements BankThreeService {

    @Override
    public BankThreeDto bfdQueryBankThreeData(Long employeeId, BfdMealTypeEnum mealType, String id,
            String name, String bank_id) throws BizException {
        monitorLog.info("BankThreeServiceImpl-getBankThreeData: [employeeId="+employeeId+",id="+id+", bank_id="+bank_id+",name="+name+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("name", name);
        map.put("bank_id", bank_id);
        return bfdQuery(employeeId, mealType, map, BankThreeVo.class);
        
    }

  

}
