package com.crdloo.audit.framework.router.utils;

public class StringUtil {
	
	public static int string2int(String str) {
		if (str == null || str.trim().length() == 0) {
			return 0;
		}
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return 0;
		}
	}
	
	public static int string2int(String str, int defaultValue) {
		if (str == null || str.trim().length() == 0) {
			return defaultValue;
		}
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return defaultValue;
		}
	}
	
	public static Integer string2Int(String str) {
		if (str == null || str.trim().length() == 0) {
			return null;
		}
		try {
			return Integer.valueOf(str);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Integer string2Int(String str, int defaultValue) {
		if (str == null || str.trim().length() == 0) {
			return Integer.valueOf(defaultValue);
		}
		try {
			return Integer.valueOf(str);
		} catch (Exception e) {
			return Integer.valueOf(defaultValue);
		}
	}
	
	public static long string2long(String str) {
		if (str == null || str.trim().length() == 0) {
			return 0l;
		}
		try {
			return Long.parseLong(str);
		} catch (Exception e) {
			return 0l;
		}
	}
	
	public static long string2long(String str, long defaultValue) {
        if (str == null || str.trim().length() == 0) {
            return defaultValue;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            return defaultValue;
        }
    }
	
	public static Long string2Long(String str) {
		if (str == null || str.trim().length() == 0) {
			return null;
		}
		try {
			return Long.valueOf(str);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Long string2Long(String str, long defaultValue) {
        if (str == null || str.trim().length() == 0) {
            return Long.valueOf(defaultValue);
        }
        try {
            return Long.valueOf(str);
        } catch (Exception e) {
            return Long.valueOf(defaultValue);
        }
    }
	
	public static float string2float(String str) {
		if (str == null || str.trim().length() == 0) {
			return 0f;
		}
		try {
			return Float.parseFloat(str);
		} catch (Exception e) {
			return 0;
		}
	}
	
	public static float string2float(String str, float defaultValue) {
        if (str == null || str.trim().length() == 0) {
            return defaultValue;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            return defaultValue;
        }
    }
	
	public static Float string2Float(String str) {
		if (str == null || str.trim().length() == 0) {
			return null;
		}
		try {
			return Float.valueOf(str);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Float string2Float(String str, float defaultValue) {
        if (str == null || str.trim().length() == 0) {
            return Float.valueOf(defaultValue);
        }
        try {
            return Float.valueOf(str);
        } catch (Exception e) {
            return Float.valueOf(defaultValue);
        }
    }

	public static String lowercaseFirstLetter(String data) {
		char firstLetter = Character.toLowerCase(data.substring(0, 1).charAt(0));
		String restLetters = data.substring(1);
		return firstLetter + restLetters;
	}

}
