package com.java.mapremove;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class MapTest {
	
	public static Map<String, String> map = new HashMap<String, String>();
	static {
		map.put("lisi", "李四");
		map.put("zhangsan", "张三");
		map.put("xiaoming", "小明");
		map.put("laowan", "老王");
		map.put("zhaoliu", "赵六");
		map.put("zhaoliu", "赵六1");
		
	}
	
	/**
	 * for-each遍历时不能同时调用remove
	 * 根据javadoc的说明，如果在for-each遍历中尝试使用此方法，结果是不可预测的。
	 */
	@Test
	public void test1() {
		for(Map.Entry<String, String> entry : map.entrySet()) {
			if("zhaoliu".equals(entry.getKey())) {
				map.remove(entry.getKey());
			}
		}
		for(String value : map.values()) {
			System.out.println("value:"+value);
			
		}
	}
	
	/**
	 * 如果只需要获得map中的key或者value，可以采用这种方式
	 * 
	 */
	@Test
	public void test2() {
		for(String key : map.keySet()) {
			System.out.println("key:"+key);
		}
		for(String value : map.values()) {
			System.out.println("value:" +value);
		}
	}
	
	/**
	 *代码比较冗余，但是可以调用 iterator.remove()方法在遍历时删除数据
	 * 
	 */
	@Test
	public void test3() {
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry = (Entry<String, String>) iterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			if("zhaoliu".equals(key)) {
				iterator.remove();
			}
		}
		for(String value: map.values()) {
			System.out.println("value:" + value);
		}
	}
	
	/**
	 * 效率最低，因为根据键取值是耗时操作
	 * 
	 * @author huangwu
	 */
	@Test
	public void test4() {
		for(String key : map.keySet()) {
			String value = map.get(key);
			System.out.println("key:"+ key+"  value:" + value);
		}
	}

}
