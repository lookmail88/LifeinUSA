/**
* <p>Title: StringUtilsTest.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Sep 1, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system.tool;

import static org.junit.Assert.*;

import org.junit.Test;

/**
* <p>Title: StringUtilsTest</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Sep 1, 2015
*/
public class StringUtilsTest {

	/**
	 * Test method for {@link com.gaoxy.lifeinusa.system.tool.StringUtils#randomStr(int)}.
	 */
	@Test
	public void testRandomStr() {
		  int len = 43;
	         System.out.println(StringUtils.randomStr(len));
	}

}
