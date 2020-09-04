/**
 * 
 */
package org.topicquests.os.asr.driver;

import org.topicquests.os.asr.pd.api.ISentenceParser;
import org.topicquests.support.RootEnvironment;
import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public class LGDriverEnvironment extends RootEnvironment implements ISentenceParser {

	/**
	 */
	public LGDriverEnvironment() {
		super("lgd-props.xml", "logger.properties");
		// TODO Auto-generated constructor stub
	}

	@Override
	public IResult processSentence(String sentence) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub

	}

}
