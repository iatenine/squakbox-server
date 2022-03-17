package com.revature.services;

import com.revature.models.Squak;
import com.revature.repositories.SquakRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquakServiceImplTest {
    @Autowired
    SquakService squakService;

    @Test
    void getAllSquaks() {
        // Should return 3 Squaks
        List<Squak> list = squakService.getAllSquaks();
        assertEquals(3, list.size());
        assertEquals("goodbye", list.get(1).getContent());
        assertNotEquals("hello", list.get(1).getContent());
    }

    @Test
    void getSquakById() {
        Squak testSquak = squakService.getSquakById(2);
        assertEquals(2, testSquak.getId());
        assertEquals("goodbye", testSquak.getContent());
    }

    @Test
    void postSquak() {
        List<Squak> list = squakService.getAllSquaks();
        int currSize = list.size();
        Squak testSquak = squakService.postSquak(new Squak("post test"));
        assertEquals(currSize + 1, list.size());
        assertNotEquals(0, testSquak.getId());
    }

    @Test
    void deleteSquak() {
        List<Squak> list = squakService.getAllSquaks();
        int currSize = list.size();
        boolean result = squakService.deleteSquak(list.get(1).getId());
        assertTrue(result);

        boolean fakeResult = squakService.deleteSquak(-1);
        assertFalse(fakeResult);

        list = squakService.getAllSquaks();
        assertNotEquals(currSize, list.size());
        assertEquals(currSize -1, list.size());
    }
}