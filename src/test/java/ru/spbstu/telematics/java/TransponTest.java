package ru.spbstu.telematics.java;

import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/** * Unit test for simple App.
 */
public class TransponTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TransponTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TransponTest.class );
    }

    public void testApp(){
        ArrayList<ArrayList<Double>> matrix = new ArrayList<ArrayList<Double>>();
        ArrayList<ArrayList<Double>> test = new ArrayList<ArrayList<Double>>();
        ArrayList<Double> temp1 = new ArrayList<Double>();
        temp1.add(1d);
        temp1.add(2d);
        temp1.add(3d);
        temp1.add(4d);
        test.add(temp1);
        temp1 = new ArrayList<Double>();

        temp1.add(5d);
        temp1.add(6d);
        temp1.add(7d);
        temp1.add(8d);
        test.add(temp1);
        temp1 = new ArrayList<Double>();

        temp1.add(9d);
        temp1.add(1d);
        temp1.add(1d);
        temp1.add(1d);
        test.add(temp1);
        temp1 = new ArrayList<Double>();

        temp1.add(5d);
        temp1.add(6d);
        temp1.add(6d);
        temp1.add(8d);
        test.add(temp1);

        for(int i=0; i<4;i++){
            for(int j=0;j<4;j++)
                System.out.print(test.get(i).get(j));
            System.out.print("\n");
        }

        Foo a = new Foo(test);
        a.start();
        ArrayList<ArrayList<Double>> result = a.getResult();

        System.out.print("\n");
        for(int i=0; i<4;i++){
            for(int j=0;j<4;j++)
                System.out.print(result.get(i).get(j));
            System.out.print("\n");
        }
    }
}

