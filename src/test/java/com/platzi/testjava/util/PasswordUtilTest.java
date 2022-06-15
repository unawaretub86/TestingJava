package com.platzi.testjava.util;

import org.junit.jupiter.api.Test;

import static com.platzi.testjava.util.PasswordUtil.*;
import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(SecurityLevel.WEAK, assessPassword("1234567"));
    }
    @Test
    public void weak_when_has_only_letters(){
        assertEquals(SecurityLevel.WEAK, assessPassword("abcdeasd"));
    }
    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(SecurityLevel.MEDIUM, assessPassword("abcd1234"));
    }
    @Test
    public void strong_when_has_letters_and_number_and_symbols(){
        assertEquals(SecurityLevel.STRONG, assessPassword("abcd1234@"));
    }
}