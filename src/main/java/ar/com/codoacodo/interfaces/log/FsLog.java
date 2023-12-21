package ar.com.codoacodo.interfaces.log;

public class FsLog implements ILog {

	@Override
	public void log() {
		System.out.println("Logueando en FileSystem c://invento"); 

	}

}
