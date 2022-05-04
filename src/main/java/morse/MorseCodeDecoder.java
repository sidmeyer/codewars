package morse;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
 */
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        var morseWords = morseCode.trim().split("   ");

        return Arrays.stream(morseWords)
                .map(MorseCodeDecoder::decodeWord)
                .collect(Collectors.joining(" "));
    }

    private static String decodeWord(String morseWord) {
        var morseCharacters = morseWord.split(" ");
        return Arrays.stream(morseCharacters)
                .map(MorseCode::get)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }
}

class MorseCode {
    public static String get(String morseCode) {
        return "a";
    }
}
