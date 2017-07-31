package com.crdloo.audit.platform.sys.service;

import java.util.List;

import com.crdloo.audit.client.dto.PowerDto;
import com.crdloo.audit.framework.common.exception.BizException;

public interface PowerService {

    /**
     * 二级菜单!=null
     * @return
     * @throws BizException
     */
    public List<PowerDto> getPowerDatas() throws BizException;
    /**
     *  一级菜单 =null
     * @return
     */
    public List<PowerDto> getLevelOne() throws BizException;
    
    public List<PowerDto> getPowerByPowerId(List<Long> powerId) throws BizException;
   
    public PowerDto addPowerInfo(PowerDto dto) throws BizException;
    
    public List<PowerDto> getPowerBypersonaId(Long personaId) throws BizException;
}
