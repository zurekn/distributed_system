package commands;

public class DfsRemoveNode extends Command {
	
	
	public DfsRemoveNode(String args[]){
		setCommandId("dfs-removeNode");
		String arguments[];
		int ind = 0;
		if(args.length > 0)
			if(args[0].equals("remove")){
				ind = 1;
			}
		arguments = new String[args.length-ind];
		for(int i = 0 ; i < arguments.length ; i++){
			arguments[i] = args[i+ind];
		}
		this.setArgs(arguments);
	}
	
	@Override
	public void action() {
		// TODO Auto-generated method stub

	}

}
