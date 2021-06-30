package ramesh.pasula.onpassive;

public class RemoveWhiteSpaceEx {

	public static void main(String[] args) {

		String str = "Ramesh Pasula";
		// 1. Way using predefined
		String after_remove_white_space = str.replaceAll("\\s", "");
		System.out.println(after_remove_white_space);
		// 2.Custom way
		char[] strArray = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				stringBuffer.append(strArray[i]);
			}
		}
		String after_remove_white_space1 = stringBuffer.toString();
		System.out.println(after_remove_white_space1);

	}

}
