package ru.practicum.tests;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.practicum.SpeedLight;


@RunWith(Parameterized.class)
public class SpeedLightTest {

    public SpeedLightTest(String expectedLight, int speed) {
        this.expectedLight = expectedLight;
        this.speed = speed;
    }

    private final String expectedLight;
    private final int speed;

    @Parameterized.Parameters(name = "expected Light = {0}, speed = {1} ")
    public static Object[] data(){
        return new Object[][]{
                {"green", 50},
                {"red" , 90},
                {"yellow", 70}
        };
    };

    @Test
    public void сheckLight() {
        SpeedLight speedLight = new SpeedLight();
        Assert.assertEquals(expectedLight, speedLight.showLight(speed));
    }
}
