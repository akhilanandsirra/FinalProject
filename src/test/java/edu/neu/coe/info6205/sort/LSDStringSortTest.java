package edu.neu.coe.info6205.sort;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class LSDStringSortTest {

    String[] input = "she sells seashells by the seashore the shells she sells are surely seashells".split(" ");
    String[] expected = "are by seashells seashells seashore sells sells she she shells surely the the".split(" ");

    @Test
    public void sortSeaShells() {
        LSDStringSort.sort(input);
        assertArrayEquals(expected, input);
    }

    String[] input1 = "Lorem ipsum dolor sit amet".split(" ");
    String[] expected1 = "Lorem amet dolor ipsum sit".split(" ");

    @Test
    public void sortEnglishString() {
        LSDStringSort.sort(input1);
        assertArrayEquals(expected1, input1);
    }



}
