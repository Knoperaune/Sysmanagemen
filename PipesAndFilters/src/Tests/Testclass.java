/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Pipes.PushPipe;

/**
 *
 * @author Kno
 */
public class Testclass {

    public static void main(String[] args) {
        
        PushPipe p1 = new PushPipe() {

            @Override
            public void write(Object in) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }
}
