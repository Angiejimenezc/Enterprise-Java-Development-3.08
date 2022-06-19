package com.demo.repositoriesTest;


import com.demo.enums.Status2;
import com.demo.models.Event;
import com.demo.models.Guest;
import com.demo.repositories.EventRepository;
import com.demo.repositories.GuestRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
   public class EventRepositoryTest {

        @Autowired
        private EventRepository eventRepository;

        @Autowired
        private GuestRepository guestRepository;




        @BeforeEach
        void setUp() {
            LocalDate date = LocalDate.of(2022,6,28);


        }

        @AfterEach
        void tearDown() {
            //eventRepository.deleteAll();
            guestRepository.deleteAll();
        }
        @Test

        void saveEvent_Event_created(){
            Optional<Guest> guest1=guestRepository.findById(1L);
            //assertEquals("Miguel",guest1.get().getName());
            //assertEquals(1,eventRepository.findAll().size());
            //assertEquals("Summer event",eventRepository.findById(1L).get().getTitle());
            //assertEquals("2021-06-28",eventRepository.findById(1L).get().getDate().toString());
        }

    }
