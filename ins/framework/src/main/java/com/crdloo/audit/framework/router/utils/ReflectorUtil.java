package com.crdloo.audit.framework.router.utils;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class ReflectorUtil {
	
	private static final Logger logger = Logger.getLogger(ReflectorUtil.class);

	private static final Map<Class<?>, List<Field>> CLASS_FIELD_CACHE = new HashMap<Class<?>, List<Field>>();
	
	/**
     * 获取类的字段列表
     * 
     * @param clazz
     * @return List<Field>
     */
    public static List<Field> getClassFields(Class<?> clazz) {
        List<Field> fields = CLASS_FIELD_CACHE.get(clazz);
        if (fields == null) {
            synchronized (clazz) {
                if (!CLASS_FIELD_CACHE.containsKey(clazz)) {
                    CLASS_FIELD_CACHE.put(clazz, fields = collectFields(clazz));
                } else {
                    fields = CLASS_FIELD_CACHE.get(clazz);
                }
            }
        }
        return fields;
    }
    
	/**
     * 判断对象里的字段都不为null
     * 
     * @param obj
     * @return boolean true都非null | false有为null的
     */
    public static boolean isAllFieldsNotNull(final Object obj) {
        List<Field> fields = getClassFields(obj.getClass());
        try {
            for (Field field : fields) {
                if (field.get(obj) == null) {
                    return false;
                }
            }
        } catch (Exception e) {
            logger.error(obj + " get field value fail", e);
            return false;
        }
        return true;
    }
    
    private static List<Field> collectFields(Class<?> clazz) {
        List<Field> list = new ArrayList<Field>();
        List<AccessibleObject> fields = new ArrayList<AccessibleObject>();
        Class<?> superClazz = clazz;
        while (superClazz != null && superClazz != Object.class) {
            fields.addAll(Arrays.asList(superClazz.getDeclaredFields()));
            superClazz = superClazz.getSuperclass();
        }
        for (AccessibleObject ao : fields) {
            ao.setAccessible(true);
            Field field = (Field) ao;
            int mod = field.getModifiers();
            if (Modifier.isFinal(mod)) {
                continue;
            }
            list.add(field);
        }
        return list;
    }
    
}
