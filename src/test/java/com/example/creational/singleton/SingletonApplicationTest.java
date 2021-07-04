package com.example.creational.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SingletonApplication.class)
class SingletonApplicationTest {
    // The Application Context is Spring's advanced container. Similar to BeanFactory, it can load bean definitions, wire beans together, and dispense beans upon request.
    // Bawaan dari Spring, spring selalu membuat application context
    @Autowired
    private ApplicationContext applicationContext;


    @Test
    void testSingleton() {
        // inisiasi kelas baru
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);

        counter1.increment();
        counter2.increment(); // seharusnya ini jadi 2, bukan 1
        counter3.increment(); // seharusnya ini jadi 3, bukan 1

        System.out.println(counter1.getValue()); // 3
        System.out.println(counter2.getValue()); // 3
        System.out.println(counter3.getValue()); // 3
    }


    @Test
    void incrementRaceCondition() throws InterruptedException {
        Counter race1 = applicationContext.getBean(Counter.class);
        Counter race2 = applicationContext.getBean(Counter.class); // kalau ini di matikan, maka outputnya ttp 1 jt

        incrementCounterAsync(race1, 1000000);
        incrementCounterAsync(race2, 1000000); // di tempat b lakukan 1 jt kali increment

        Thread.sleep(5_000L);
        System.out.println(race1.getValue()); // harusnya 2 jt, output: 1037841
        System.out.println(race2.getValue()); // harusnya 2 jt, output: 1037841

        // kita kemudian menambahkan synchronized untuk membuat thread lain menunggu utk mengakses method increment
        // setelah ditambahkan pada method increment, jadi 2 juta dua duanya, melambat tapi meminimalisir race condition
    }

    // Test race condition
    private void incrementCounterAsync(Counter counter, int total) {
        new Thread(() -> {
            for (int i = 0; i < total; i++) {
                counter.increment();
            }
        }).start();
    }
}