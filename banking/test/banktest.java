/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class banktest {
    bank b;
    
    public banktest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        //ll
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b=new bank();
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
     public void withdraw() {
     assertEquals(1500,b.withdraw(500));
     
     }
     public void deposite(){
         assertEquals(2300,b.deposit(300));
     }
     public void display(){
         assertEquals(true,b.display());
     }
}

