/********************************************************************

 Class:  FastGazelle  (extends SmartGazelle which extends Prey which extends Animal)
Author:  Tommy Alford
  Date:  November 19, 2015

Models the behavior of FastGazelles in the simulation

Date			Modification
11-19-2015  Main coding started


*********************************************************************/

import java.awt.Color;
public class FastGazelle extends SmartGazelle
{
	
public FastGazelle(Cage myCage, Color magenta) 
	{
	// TODO Auto-generated constructor stub
	super(myCage, magenta);
	}

public String toString()
{
	return (myPos.toString() + " is a fast gazelle.");
}

public boolean act()
{
	boolean didIAct = false;
	super.act();
	super.act();
	didIAct = true;
	return didIAct;
}
	
}