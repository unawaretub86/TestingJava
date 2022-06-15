package com.platzi.testjava.util;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {
        @Test
        public void test_repeat_once() {
            Assert.assertEquals("hi",StringUtil.repeat("hi", 1));
        }
        @Test
        public void test_repeat_multiple_times() {
            Assert.assertEquals("hihihihi",StringUtil.repeat("hi", 4));
        }
        @Test
        public void test_repeat_zero_times() {
            Assert.assertEquals("",StringUtil.repeat("hi", 0));
        }
        @Test(expected = IllegalArgumentException.class)
        public void test_repeat_negative_times() {
            StringUtil.repeat("hi", -1);
        }
}