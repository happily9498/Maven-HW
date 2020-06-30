package org.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FindMaxSumOf2FromArrayTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void positiveTest(){
        int[] array = {2,4,3,5,1};
        int[] expected = {5,4};
        assertArrayEquals(expected,FindMaxSumOf2FromArray.maxTwo(array));
    }

    @Test
    public void emptyArrayTest(){
        int[] array = {};
        int[] expected = {0,0};
        assertArrayEquals(expected,FindMaxSumOf2FromArray.maxTwo(array));
    }
    @Test
    public void oneInputArrayTest(){
        int[] array = {5};
        int[] expected = {5};
        assertArrayEquals(expected,FindMaxSumOf2FromArray.maxTwo(array));
    }
    @Test
    public void negativeValuesTest(){
        int[] array = {-7,-5,-3,-9,-2};
        int[] expected = {-2,-3};
        assertArrayEquals(expected,FindMaxSumOf2FromArray.maxTwo(array));
    }

    @DataProvider
    public Object[][] data(){
        return new Object[][]{
                {new int[]{2,4,3,5,1},new int[]{5,4}},
                {new int[]{},new int[]{0,0}},
                {new int[]{5},new int[]{5}},
                {new int[]{-7,-5,-3,-9,-2},new int[]{-2,-3}},

        };
    }

    @Test(DataProvider="data")
    public void dataProviderTest(int[] input,int[] expected){
        assertArrayEquals(expected,FindMaxSumOf2FromArray.maxTwo(input));
    }

}
