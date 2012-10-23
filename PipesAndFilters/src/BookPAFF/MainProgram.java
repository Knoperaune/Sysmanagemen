/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BookPAFF;

import Filters.PullFilter;
import Filters.Pump;
import Filters.PushFilter;
import Pipes.SinglePullPipe;
import Pipes.SinglePushPipe;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author phil
 */
public class MainProgram {
    public static void main(String[] args) {
		try {
                        String path = "C:\\Users\\phil\\Desktop\\FHV\\5. Semester\\Systemarchitekturen\\Übung\\SysArchitekturen\\PipesAndFilters\\src\\Tests\\pg11.txt";
			FileSource source = new FileSource(new FileInputStream(/*"pg11.txt"*/path));
			PullFilter<Character[], CharSequence> word = new PullFilter<Character[], CharSequence>(
					new WordProcessor(), source);

			ConsoleBook destination = new ConsoleBook();
			PushFilter<CharSequence, CharSequence> page = new PushFilter<CharSequence, CharSequence>(
					new PageProcessor(40), destination);

			Pump<CharSequence, CharSequence> line = new Pump<CharSequence, CharSequence>(
					new LineProcessor(60), new SinglePullPipe<CharSequence>(
							word), new SinglePushPipe<CharSequence>(page));

			while (line.doit()) {

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
