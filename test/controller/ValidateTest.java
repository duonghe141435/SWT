/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.text.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * validate class
 */
public class ValidateTest {

    /**
     *
     * validate constructor
     */
    public ValidateTest() {
    }

    /**
     *
     * testInputNameCorrect
     *
     * @throws java.io.IOException
     */
    @Test
    public void testInputNameCorrect() throws IOException {
        Validate v = new Validate();
        String input = "trung";
        boolean result = v.testName(input);
        assertEquals(true, result);

    }

    /**
     *
     * testInputName50Character
     */
    @Test
    public void testInputName50Character() {
        Validate v = new Validate();
        String input = "abcxyzvbcsjcsjbcjsbcsjcbscbksbksckbckscmavczxdfgqw";
        boolean result = v.testName(input);
        assertEquals(true, result);
    }

    /**
     *
     * testInputNameMoreThan50Char
     */
    @Test
    public void testInputNameMoreThan50Char() {
        Validate v = new Validate();
        String input = "askdjalskdjaskldlkasjdalksjdaslkdjaskdajwiawlrhjhfkasdlajkrwlaishfaskjd";
        boolean result = v.testName(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputName1() {
        Validate v = new Validate();
        String input = "t";
        boolean result = v.testName(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputName2() {
        Validate v = new Validate();
        String input = "tru";
        boolean result = v.testName(input);
        assertEquals(true, result);
    }

    @Test
    public void testInputName3() {
        Validate v = new Validate();
        String input = "tru@";
        boolean result = v.testName(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputName4() {
        Validate v = new Validate();
        String input = "tru1";
        boolean result = v.testName(input);
        assertEquals(false, result);
    }

    /**
     *
     * testInputDobCorrect
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testInputDobCorrect() throws ParseException {
        Validate v = new Validate();
        String input = "12/10/2000";
        boolean result = v.testDate(input);
        assertEquals(true, result);
    }

    /**
     *
     * testInputDobWrongFormatOutRangeDateInMonth
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testInputDobWrongFormatOutRangeDateInMonth() throws ParseException {
        Validate v = new Validate();
        String input = "13/02/2001";
        boolean result = v.testDate(input);
        assertEquals(true, result);
    }

    /**
     *
     * testInputDobWrongFormat
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testInputDobWrongFormat() throws ParseException {
        Validate v = new Validate();
        String input = "17/02/2001";
        boolean result = v.testDate(input);
        assertEquals(true, result);
    }

    @Test
    public void testInputDobWrongFormat1() throws ParseException {
        Validate v = new Validate();
        String input = "31/02/2001";
        boolean result = v.testDate(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputDobWrongFormat2() throws ParseException {
        Validate v = new Validate();
        String input = "";
        boolean result = v.testDate(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputDobWrongFormat3() throws ParseException {
        Validate v = new Validate();
        String input = "01/02/2001";
        boolean result = v.testDate(input);
        assertEquals(true, result);

    }
    @Test
    public void testInputDobWrongFormat4() throws ParseException {
        Validate v = new Validate();
        String input = "-1/02/2001";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
    @Test
    public void testInputDobWrongFormat5() throws ParseException {
        Validate v = new Validate();
        String input = "00/02/2001";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
    @Test
    public void testInputDobWrongFormat6() throws ParseException {
        Validate v = new Validate();
        String input = "29/02/2001";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
    @Test
    public void testInputDobWrongFormat7() throws ParseException {
        Validate v = new Validate();
        String input = "28/02/2001";
        boolean result = v.testDate(input);
        assertEquals(true, result);

    }
    @Test
    public void testInputDobWrongFormat8() throws ParseException {
        Validate v = new Validate();
        String input = "28/-02/2001";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
    @Test
    public void testInputDobWrongFormat9() throws ParseException {
        Validate v = new Validate();
        String input = "28/02/-2001";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
    @Test
    public void testInputDobWrongFormat10() throws ParseException {
        Validate v = new Validate();
        String input = "28/02/2001";
        boolean result = v.testDate(input);
        assertEquals(true, result);

    }
    @Test
    public void testInputDobWrongFormat11() throws ParseException {
        Validate v = new Validate();
        String input = "28/02/0000";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
    
    @Test
    public void testInputDobWrongFormat12() throws ParseException {
        Validate v = new Validate();
        String input = "01/03/2021";
        boolean result = v.testDate(input);
        assertEquals(true, result);

    }
    @Test
     public void testInputDobWrongFormat13() throws ParseException {
        Validate v = new Validate();
        String input = "31/03/2021";
        boolean result = v.testDate(input);
        assertEquals(true, result);

    }
     @Test
     public void testInputDobWrongFormat14() throws ParseException {
        Validate v = new Validate();
        String input = "32/03/2021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
     @Test
     public void testInputDobWrongFormat15() throws ParseException {
        Validate v = new Validate();
        String input = "01/04/2021";
        boolean result = v.testDate(input);
        assertEquals(true, result);

    }@Test
       public void testInputDobWrongFormat16() throws ParseException {
        Validate v = new Validate();
        String input = "00/04/2021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }@Test
       public void testInputDobWrongFormat17() throws ParseException {
        Validate v = new Validate();
        String input = "30/04/2021";
        boolean result = v.testDate(input);
        assertEquals(true, result);

    }@Test
       public void testInputDobWrongFormat18() throws ParseException {
        Validate v = new Validate();
        String input = "31/04/2021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
        @Test
    public void testInputDobWrongFormat19() throws ParseException {
        Validate v = new Validate();
        String input = "28/02/1000";
        boolean result = v.testDate(input);
        assertEquals(true, result);

    }
       @Test
    public void testInputDobWrongFormat23() throws ParseException {
        Validate v = new Validate();
        String input = "32/04/2021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
     @Test
    public void testInputDobWrongFormat20() throws ParseException {
        Validate v = new Validate();
        String input = "29/02/9999";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
     @Test
    public void testInputDobWrongFormat21() throws ParseException {
        Validate v = new Validate();
        String input = "29/00/2021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
    
     @Test
    public void testInputDobWrongFormat22() throws ParseException {
        Validate v = new Validate();
        String input = "28/12/2021";
        boolean result = v.testDate(input);
        assertEquals(true, result);

    }
     @Test
    public void testInputDobWrongFormat24() throws ParseException {
        Validate v = new Validate();
        String input = "28/13/2021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
     @Test
    public void testInputDobWrongFormat25() throws ParseException {
        Validate v = new Validate();
        String input = "aa/13/2021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    } @Test
    public void testInputDobWrongFormat26() throws ParseException {
        Validate v = new Validate();
        String input = "28/13/2021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
     @Test
    public void testInputDobWrongFormat27() throws ParseException {
        Validate v = new Validate();
        String input = "28/aa/2021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
     @Test
    public void testInputDobWrongFormat28() throws ParseException {
        Validate v = new Validate();
        String input = "28/13/AAAA";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
     @Test
    public void testInputDobWrongFormat29() throws ParseException {
        Validate v = new Validate();
        String input = "2813/2021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
     @Test
    public void testInputDobWrongFormat30() throws ParseException {
        Validate v = new Validate();
        String input = "28/132021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
     @Test
    public void testInputDobWrongFormat31() throws ParseException {
        Validate v = new Validate();
        String input = "28132021";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
     @Test
    public void testInputDobWrongFormat32() throws ParseException {
        Validate v = new Validate();
        String input = "2008/13/02";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
    @Test
    public void testInputDobWrongFormat33() throws ParseException {
        Validate v = new Validate();
        String input = "20/2008/02";
        boolean result = v.testDate(input);
        assertEquals(false, result);

    }
   

    /**
     *
     * testInputSpecializationCorect
     *
     */
    @Test
    public void testInputSpecializationCorect() {
        Validate v = new Validate();
        String input = "Doctor";
        boolean result = v.testSpec(input);
        assertEquals(true, result);
    }

    @Test
    public void testInputSpecializationInCorect1() {
        Validate v = new Validate();
        String input = "";
        boolean result = v.testSpec(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputSpecializationInCorect2() {
        Validate v = new Validate();
        String input = "F";
        boolean result = v.testSpec(input);
        assertEquals(true, result);
    }

    /**
     *
     * testInputSpecializationMoreThan225Character
     *
     */
    @Test
    public void testInputSpecializationMoreThan256Character() {
        Validate v = new Validate();
        String input = "qwertasdfgqwertasdfghqwer qwertasdfgqwertasdfghqwer qwertasdfgqwertasdfghqwer qwertasdfgqwertasdfghqwer "
                + "qwertasdfgqwertasdfghqwer qwertasdfgqwertasdfghqwer qwertasdfgqwertasdfghqwer qwertasdfgqwertasdfghqwer "
                + "qwertasdfgqwertasdfghqwer qwertasdfgqwertasdfghqwer qwertasdfgqwertasdfghqwer qwertasdfgqwertasdfghqwer1111111 ";
        boolean result = v.testSpec(input);
        assertEquals(false, result);
    }

    /**
     *
     * testInputSpecializationCorrect
     *
     */
    @Test
    public void testInputSpecializationCorrect() {
        Validate v = new Validate();
        String input = "psychologist";
        boolean result = v.testSpec(input);
        assertEquals(true, result);
    }

    /**
     *
     * testInput1ToAvailable
     *
     */
    @Test
    public void testInput1ToAvailable() {
        Validate v = new Validate();
        String input = "1";
        boolean result = v.testAvailable(input);
        assertEquals(true, result);
    }

    /**
     * testInput7Available
     *
     */
    @Test
    public void testInput7Available() {
        Validate v = new Validate();
        String input = "7";
        boolean result = v.testAvailable(input);
        assertEquals(false, result);
    }

    /**
     *
     * testInputStringToAvailable
     *
     */
    @Test
    public void testInputStringToAvailable() {
        Validate v = new Validate();
        String input = "aaa";
        boolean result = v.testAvailable(input);
        assertEquals(false, result);
    }

    /**
     * testInputEmailCorrect
     */
    @Test
    public void testInputEmailCorrect() {
        Validate v = new Validate();
        String input = "trungnxhe@gmail.com";
        boolean result = v.testEmail(input);
        assertEquals(true, result);
    }

    /**
     * testInputEmailInValidFormat
     */
    @Test
    public void testInputEmailInValidFormat() {
        Validate v = new Validate();
        String input = "abcabc@";
        boolean result = v.testEmail(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputEmailInValidFormat1() {
        Validate v = new Validate();
        String input = "abcabc@gmail.commmm";
        boolean result = v.testEmail(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputEmailInValidFormat2() {
        Validate v = new Validate();
        String input = "abcabc";
        boolean result = v.testEmail(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputEmailInValidFormat3() {
        Validate v = new Validate();
        String input = "abcabc@gmaill.com";
        boolean result = v.testEmail(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputEmailInValidFormat4() {
        Validate v = new Validate();
        String input = "c@gmaill.com";
        boolean result = v.testEmail(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputEmailInValidFormat5() {
        Validate v = new Validate();
        String input = "abcabc1111111@gmaill.com";
        boolean result = v.testEmail(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputEmailInValidFormat6() {
        Validate v = new Validate();
        String input = "abcabc@gmaill.c";
        boolean result = v.testEmail(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputEmailInValidFormat7() {
        Validate v = new Validate();
        String input = "abcabc@g.com";
        boolean result = v.testEmail(input);
        assertEquals(false, result);
    }

    /**
     *
     * testInputMobileCorrect
     *
     */
    @Test
    public void testInputMobileCorrect() {
        Validate v = new Validate();
        String input = "(123)-234-4567";
        boolean result = v.testMobile(input);
        assertEquals(true, result);
    }

    /**
     *
     * testInputMobileIncorrectFormat
     *
     */
    @Test
    public void testInputMobileIncorrectFormat() {
        Validate v = new Validate();
        String input = "0369662341";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat2() {
        Validate v = new Validate();
        String input = "a01S2345678";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat3() {
        Validate v = new Validate();
        String input = "@01-2345678";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat4() {
        Validate v = new Validate();
        String input = "@01-234-5678";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat5() {
        Validate v = new Validate();
        String input = "4-01-234-5678";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat6() {
        Validate v = new Validate();
        String input = "4-0-1-234-5678";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat7() {
        Validate v = new Validate();
        String input = "4-0-1-2-34-5678";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat8() {
        Validate v = new Validate();
        String input = "!401)-2-34-5678";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat9() {
        Validate v = new Validate();
        String input = "(401)-234-678";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat10() {
        Validate v = new Validate();
        String input = "(401)-234-67891";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat11() {
        Validate v = new Validate();
        String input = "(1)-234-67891";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputMobileIncorrectFormat12() {
        Validate v = new Validate();
        String input = "(1111)-234-67891";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }
    @Test
     public void testInputMobileIncorrectFormat13() {
        Validate v = new Validate();
        String input = "(111)-23-67891";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }
     @Test
     public void testInputMobileIncorrectFormat14() {
        Validate v = new Validate();
        String input = "(111)-2344-67891";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    /**
     * testInputMobileContainCharacter
     */
    @Test
    public void testInputMobileContainCharacter() {
        Validate v = new Validate();
        String input = "cbasckasjas";
        boolean result = v.testMobile(input);
        assertEquals(false, result);
    }

    /**
     * testInputIdCorrect
     */
    @Test
    public void testInputIdCorrect() {
        Validate v = new Validate();
        String input = "3";
        boolean result = v.testId(input);
        assertEquals(true, result);
    }

    @Test
    public void testInputIdInCorrect() {
        Validate v = new Validate();
        String input = "da";
        boolean result = v.testId(input);
        assertEquals(false, result);
    }

    /**
     * testInputStringToId
     */
    @Test
    public void testInputStringToId() {
        Validate v = new Validate();
        String input = "a";
        boolean result = v.testId(input);
        assertEquals(false, result);
    }

    /**
     * testInputIdIs6
     */
    @Test
    public void testInputIdIs6() {
        Validate v = new Validate();
        String input = "1";
        boolean result = v.testId(input);
        assertEquals(true, result);
    }

    @Test
    public void testInputIdIs7() {
        Validate v = new Validate();
        String input = "10000";
        boolean result = v.testId(input);
        assertEquals(true, result);
    }

    @Test
    public void testInputIdIs8() {
        Validate v = new Validate();
        String input = "1000000";
        boolean result = v.testId(input);
        assertEquals(true, result);
    }

    @Test
    public void testInputIdIs9() {
        Validate v = new Validate();
        String input = "1000001";
        boolean result = v.testId(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputIdIs10() {
        Validate v = new Validate();
        String input = "0";
        boolean result = v.testId(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputIdIs11() {
        Validate v = new Validate();
        String input = "-1";
        boolean result = v.testId(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputIdIs12() {
        Validate v = new Validate();
        String input = "9";
        boolean result = v.testId(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputIdIs13() {
        Validate v = new Validate();
        String input = "19";
        boolean result = v.testId(input);
        assertEquals(false, result);
    }

    @Test
    public void testInputIdIs14() {
        Validate v = new Validate();
        String input = "29";
        boolean result = v.testId(input);
        assertEquals(false, result);
    }

}
