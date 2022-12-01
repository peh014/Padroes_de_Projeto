/* @author pedro */
package ProjetoCars;
public class FabricaCarros {

    private boolean paint;
	private boolean build;
	private static FabricaCarros uniqueInstance;

	private FabricaCarros(){
		paint=true;
		build=false;
	}


	public static FabricaCarros getInstance(){

		if (uniqueInstance==null){
			uniqueInstance= new FabricaCarros();
		}

		return uniqueInstance;		
	}
	public void build(){

		if (isBuild()){
			build=false;
			paint=false;
		}		
	}

	public void paint(){
		if (!isBuild() && isPaint()){
			paint=true;
		}		
	}
	public void deliver(){
		if(!isBuild() && ! isPaint()){
			paint=true;
		}
	}
	
	public boolean isBuild(){      
		return build;
	}
	public boolean isPaint(){
		return paint;	
	}


}
