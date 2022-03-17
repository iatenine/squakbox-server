package com.revature.services;

import com.revature.driver.SquakboxApplication;
import com.revature.models.Squak;
import com.revature.repositories.SquakRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(
        classes = {SquakboxApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.MOCK
)
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
    void postSquak() {
        List<Squak> list = squakService.getAllSquaks();
        int currSize = list.size();
        Squak testSquak = squakService.postSquak("post test");
        list = squakService.getAllSquaks();
        assertEquals(currSize + 1, list.size());
        assertEquals("post test", testSquak.getContent());
        assertNotEquals(0, testSquak.getId());
    }
}