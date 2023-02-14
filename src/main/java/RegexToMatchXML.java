/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
    import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * The regular expression matches a pattern of XML tags. The pattern consists of the following components:

    <(.+)>: This matches the opening tag of an XML element, capturing the name of the element into the first capture group (denoted by (.+)). The < and > characters are literal characters that match the corresponding characters in the input string.

    ([^<]+): This matches the content of the XML element, capturing it into the second capture group. The content is any sequence of characters that are not the < character, represented by [^<]+. This ensures that the match will stop at the closing tag of the XML element.

    </\\1>: This matches the closing tag of the XML element. The \\1 in the pattern refers to the first capture group, which captures the name of the opening tag. So, the closing tag must have the same name as the opening tag. The / and > characters are literal characters that match the corresponding characters in the input string.
 */
public class RegexToMatchXML {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases-- > 0) {
            String line = in.nextLine();
            boolean matchFound = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
        }
    }
}




    

