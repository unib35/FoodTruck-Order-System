package cse.foodtruck.order.system.pattern.strategy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    static ArrayList<String> namebook;

    @BeforeAll
    static void setUp() {
        namebook = new ArrayList<>();
        namebook.add("John");

        System.out.println("setUp");
    }

    @BeforeEach
    void setNamebook() {
        namebook.set(0, "Jane");
    }

    @Test
    void test0() {
        assertEquals("Jane", namebook.get(0));
    }

    @Test
    void test1() {
        namebook.set(0, "Jane1");
        assertEquals("Jane1", namebook.get(0));
    }

    @Test
    void test2() {
        assertEquals("Jane", "sdg");

    }

}