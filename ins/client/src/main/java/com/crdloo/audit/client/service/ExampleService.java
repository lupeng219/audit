package com.crdloo.audit.client.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crdloo.audit.client.dto.ExampleDto;
import com.crdloo.audit.framework.client.EnumConnectType;
import com.crdloo.audit.framework.client.PageInfo;
import com.crdloo.audit.framework.client.PlatformResult;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.client.router.AbstractRouterService;
import com.crdloo.audit.framework.router.Router;

public class ExampleService extends AbstractRouterService {

	public ExampleService(Router router)
    {
        super(router);
    }
    
    @Override
    public String getContext()
    {
        return "/example/";
    }

    public PlatformResult<ExampleDto> getData(Long id)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("id", id);
        map.put("name", "中文123abc");
        
        PlatformResult<ExampleDto> result = processNullMap(map);
        if(result != null)
        {
            return result;
        }
        
        return post("getdata.json", map, ExampleDto.class, EnumConnectType.SHORT);
    }
    
    @SuppressWarnings("unchecked")
    public PlatformResult<List<ExampleDto>> getDataList(String tag, Integer pageNo, Integer pageSize)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("tag", tag);
        map.put(PageInfo.PAGEINFO_PAGESIZE, pageSize);
        map.put(PageInfo.PAGEINFO_CURRENTPAGE, pageNo);
        
        PlatformResult<List<ExampleDto>> result = processNullMap(map);
        if(result != null)
        {
            return result;
        }
        
        return post("getdatalist.json", map, List.class, ExampleDto.class, EnumConnectType.SHORT);
    }
    
    @SuppressWarnings("unchecked")
    public PlatformResult<PageResults<ExampleDto>> getdatapagelist(String tag, Integer pageNo, Integer pageSize){
    	Map<String , Object> map = new HashMap<String , Object>();
        map.put("tag", tag);
        map.put(PageInfo.PAGEINFO_PAGESIZE, pageSize);
        map.put(PageInfo.PAGEINFO_CURRENTPAGE, pageNo);
        
        PlatformResult<PageResults<ExampleDto>> result = processNullMap(map);
        if(result != null)
        {
            return result;
        }
        
        return post("getdatapagelist.json", map, PageResults.class, ExampleDto.class, EnumConnectType.SHORT);
    }
    
    public PlatformResult<ExampleDto> insertData(ExampleDto dto)
    {
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("exampleDto", dto);
        
        PlatformResult<ExampleDto> result = processNullMap(map);
        if(result != null)
        {
            return result;
        }
        
        return post("insertdata.json", map, ExampleDto.class, EnumConnectType.SHORT);
    }
    public PlatformResult<ExampleDto> insertDatas()
    {
        ExampleDto dto = new ExampleDto();
        Map<String , Object> map = new HashMap<String , Object>();
        map.put("exampleDto", dto);

        return post("insertdatas.json", map, ExampleDto.class, EnumConnectType.SHORT);
    }
}
