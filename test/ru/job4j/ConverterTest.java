package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Converter;

public class ConverterTest {
    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        float expected = 2.0f;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        float expected = 3.0f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0);
    }
}