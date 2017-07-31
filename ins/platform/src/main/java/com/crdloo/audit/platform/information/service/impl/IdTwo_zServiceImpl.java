package com.crdloo.audit.platform.information.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crdloo.audit.client.dto.IdTwo_zDto;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.platform.common.hao.bfd.BfdMealTypeEnum;
import com.crdloo.audit.platform.common.service.AbstractBfdEntityService;
import com.crdloo.audit.platform.information.dao.entity.IdTwo_zEntity;
import com.crdloo.audit.platform.information.service.IdTwo_zService;
import com.crdloo.audit.platform.information.service.vo.IdTwo_zVo;
@Service("com.crdloo.audit.platform.information.service.impl.IdTwo_zServiceImpl")
public class IdTwo_zServiceImpl extends AbstractBfdEntityService<IdTwo_zDto, IdTwo_zEntity>  implements IdTwo_zService{

    @Override
    public IdTwo_zDto bfdQueryIdTwo_zData(Long employeeId, BfdMealTypeEnum mealType, String id,
            String name) throws BizException {
        monitorLog.info("IdTwo_zServiceImpl-bfdQueryIdTwo_zData: [employeeId="+employeeId+",id="+id+",name="+name+"]");
        Map<String,Object> map =  new HashMap<String,Object>();
        map.put("id", id);
        map.put("name", name);
        return bfdQuery(employeeId, mealType, map, IdTwo_zVo.class);
    }

}
