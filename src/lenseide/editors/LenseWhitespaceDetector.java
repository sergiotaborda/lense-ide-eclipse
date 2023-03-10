package lenseide.editors;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class LenseWhitespaceDetector implements IWhitespaceDetector {

	@Override
	public boolean isWhitespace(char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}
}
