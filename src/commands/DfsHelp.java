package commands;

import core.MasterNode;

public class DfsHelp extends Command{

	public DfsHelp(String args[]) {
		setCommandId("dfs-help");
		String arguments[];
		int ind = 0;
		if (args.length > 0)
			if (args[0].equals(getCommandId())) {
				ind = 1;
			}
		arguments = new String[args.length - ind];
		for (int i = 0; i < arguments.length; i++) {
			arguments[i] = args[i + ind];
		}
		this.setArgs(arguments);
	}
	
	@Override
	public void action(MasterNode masterNode) {
		System.out.println("Command available :");
		System.out.println("\tdfs-add file/to/cp new/file/in/dfs ");
		System.out.println("\tdfs-ls [-R] [-d] /path/to/show");
		System.out.println("\tdfs-rm path/to/file");
		System.out.println("\tdfs-lsNode [-l]");
		System.out.println("\tdfs-createNode [path/to/dfs/nodeFolder]");
		System.out.println("\tdfs-mv /source/path /dest/path");
		System.out.println("\tdfs-removeNode [-r] nodeName");
		System.out.println("\tdfs-rm /path/to/delete");
		System.out.println("\tdfs-get /file/in/dfs /path/on/local/system");
	}
	
}
