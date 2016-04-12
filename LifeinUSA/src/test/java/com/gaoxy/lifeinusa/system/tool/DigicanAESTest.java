/**
* <p>Title: DigicanAESTest.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 31, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system.tool;

import static org.junit.Assert.*;

import org.junit.Test;

/**
* <p>Title: DigicanAESTest</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 31, 2015
*/
public class DigicanAESTest extends DigicanAES {

	/**
	 * Test method for {@link com.gaoxy.lifeinusa.system.tool.DigicanAES#getAutoCreateAESKey()}.
	 */
	@Test
	public void testGetAutoCreateAESKey() {
		String s=com.gaoxy.lifeinusa.system.tool.DigicanAES.getAutoCreateAESKey();
		System.out.println(s);
	}

}
