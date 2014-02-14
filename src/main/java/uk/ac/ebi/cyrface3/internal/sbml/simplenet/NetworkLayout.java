package uk.ac.ebi.cyrface3.internal.sbml.simplenet;

import java.awt.geom.Point2D;

public interface NetworkLayout extends Network
{
	public abstract void getLocation (Node n, Point2D p);
	public abstract void setLocation (Node n, Point2D p);
}
