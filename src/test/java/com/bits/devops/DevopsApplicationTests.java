package com.bits.devops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DevopsApplicationTests {

    @Mock
    private DevopService devopService;

    @InjectMocks
    private DevopsController devopsContoller;

    @Test
    public void testDevops() {
        String name = "John";
        Devops expectedGreeting = new Devops("Hello, " + name + "!");
        when(devopService.devops(name)).thenReturn(expectedGreeting);

        Devops actualGreeting = devopsContoller.devops(name);

        assertEquals(expectedGreeting, actualGreeting);
    }
}
