/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipes;

/**
 *
 * @author Kno
 */
public interface SyncPipe<IN, OUT> extends Pipe {
    public IN pull();
    public void push(OUT data);
}
