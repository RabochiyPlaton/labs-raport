package labotory_9;

public interface StringMethods {
    boolean isOnlySpaces(String str);

    boolean isOnlyOneWord(String str);

    int countWords(String str);

    void countVowelsConsonants(String str);

    void shortAndLongWords(String str);

    String deleteStartEndAndSpaces(String str);

    String addSpacesBetweenWords(String str);

    String spacesBetweenWordsUpTo1(String str);

    String addLeftSpace(String str);

    String alignStrForWide(String str);

    String letterCaseToUp(String str);

    String prepareString(String str);

    String[] stringToMass(String str);

    double hexadecimalToDecimal(String str);

    String encrypt(String str, int step);

    String decrypt(String str, int step);

    String transliteration(String str);

    String getDayStr(int day);

    String getMonthStr(int month);

    String getYearStr(int year);
}
