/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipes;

import Filters.PullFilter;

/**
 *
 * @author Kno
 */
public interface PullPipe<OUT> extends Pipe{
    PullFilter getPullFilter();
    OUT read();
}
