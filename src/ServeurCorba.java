import javax.naming.Context;
import javax.naming.InitialContext;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CORBA_2_3.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import servants.EquationServiceImp;

public class ServeurCorba {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				try {
					ORB orb = (ORB) ORB.init(args, null);
					POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
					rootPOA.the_POAManager().activate();
					EquationServiceImp od = new EquationServiceImp();
					Context ctx = new InitialContext();
					ctx.rebind("EQUATION",rootPOA.servant_to_reference(od));
					orb.run();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

			}

	}


