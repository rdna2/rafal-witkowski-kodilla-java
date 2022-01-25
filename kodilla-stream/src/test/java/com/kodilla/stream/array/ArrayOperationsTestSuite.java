package com.kodilla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {12,9,3,7,0,5,4,4,10,32,2,17,1,32};

               //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(9.8571, average, 0.0001);
    }
}