/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipes;

/**
 *
 * @author Kno
 */
public interface PushPipe<IN> extends Pipe{
    void write(IN in);
}
