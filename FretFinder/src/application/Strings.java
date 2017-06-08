package application;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.*;


public class Strings {
	
	//creation of strings with notes by position
	//index(0) = open string, index(1) = 1st fret, etc.
	//s -> sharp
	//b -> flat
	//X -> Not Played
			//		OPEN|| 1 || 2 || 3 || X
	public enum E_STRING 		{E,   F,   Fs,  G,   X}
	public enum A_STRING 		{A,   As,  B,   C,   X}
	public enum D_STRING 		{D,   Ds,  E,   F,   X}
	public enum G_STRING 		{G,   Gs,  A,   As,  X}
	public enum B_STRING 		{B,   C,   Cs,  D,   X}
	public enum HIGH_E_STRING	{E,   F,   Fs,  G,   X}
	

	ArrayList<String> EString = new ArrayList<String>();
	ArrayList<String> AString = new ArrayList<String>();
	ArrayList<String> DString = new ArrayList<String>();
	ArrayList<String> GString = new ArrayList<String>();
	ArrayList<String> BString = new ArrayList<String>();
	ArrayList<String> eString = new ArrayList<String>();
	
	//Majors
	ChordInfo Gmajor = new ChordInfo();
	ChordInfo Amajor = new ChordInfo();
	ChordInfo Cmajor = new ChordInfo();
	ChordInfo Dmajor = new ChordInfo();
	ChordInfo Emajor = new ChordInfo();
	ChordInfo Fmajor = new ChordInfo();

	//ArrayList<chordInfo> GmajorChord = new ArrayList<chordInfo>();
	
	
	public void setEString(){
		EString.add("EString_E");
		EString.add("EString_F");
		EString.add("EString_Fs");
		EString.add("EString_G");
	}	
	public void setAString(){
		AString.add("AString_A");
		AString.add("AString_As");
		AString.add("AString_B");
		AString.add("AString_C");
	}
	public void setDString(){
		DString.add("DString_D");
		DString.add("DString_Ds");
		DString.add("DString_E");
		DString.add("DString_F");
	}
	public void setGString(){
		GString.add("GString_G");
		GString.add("GString_Gs");
		GString.add("GString_A");
		GString.add("GString_As");
	}
	public void setBString(){
		BString.add("BString_B");
		BString.add("BString_C");
		BString.add("BString_Cs");
		BString.add("BString_D");
	}
	public void seteString(){
		eString.add("eString_E");
		eString.add("eString_F");
		eString.add("eString_Fs");
		eString.add("eString_G");
	}
	public void setStrings(){
		setEString();
		setAString();
		setDString();
		setGString();
		setBString();
		seteString();	
	}	
	public ArrayList<String> getEString(){
		return EString;
	}
	public ArrayList<String> getAString(){
		return AString;
	}
	public ArrayList<String> getDString(){
		return DString;
	}
	public ArrayList<String> getGString(){
		return GString;
	}
	public ArrayList<String> getBString(){
		return BString;
	}
	public ArrayList<String> geteString(){
		return eString;
	}
	public ArrayList<String> getAllStrings(){
		ArrayList<String> AllStrings = new ArrayList<String>();
		AllStrings.addAll(getEString());
		AllStrings.addAll(getAString());
		AllStrings.addAll(getDString());
		AllStrings.addAll(getGString());
		AllStrings.addAll(getBString());
		AllStrings.addAll(geteString());
		return AllStrings;
	}
	
	
	public void setChords() {
		//G Major
		
		//CHANGE THE IDS OF ALL TEXTBOXES TO SHOW WHAT STRING THEY ARE ACCESSING!!!!!!
		//THEN CREATE A FOR LOOP THAT GETS THE NAME OF THE CHORD WITH THE TEXTBOX VALUES AND CHANGE COLORS BASED OFF OF ID
		
		//G Major
		Gmajor.gMajorChord.add(E_STRING.G.toString());  //note
		Gmajor.gMajorChord.add(A_STRING.B.toString());
		Gmajor.gMajorChord.add(D_STRING.D.toString());
		Gmajor.gMajorChord.add(G_STRING.G.toString());
		Gmajor.gMajorChord.add(B_STRING.C.toString());
		Gmajor.gMajorChord.add(HIGH_E_STRING.G.toString());
		
		//GMajor TextBoxes
		Gmajor.gMajorTxtBoxes.add("EString_G");    
		Gmajor.gMajorTxtBoxes.add("AString_B");
		Gmajor.gMajorTxtBoxes.add("DString_D");
		Gmajor.gMajorTxtBoxes.add("GString_G");
		Gmajor.gMajorTxtBoxes.add("BString_D");
		Gmajor.gMajorTxtBoxes.add("eString_G");
		
		
		//A Major
		Amajor.aMajorChord.add(E_STRING.X.toString());
		Amajor.aMajorChord.add(A_STRING.A.toString());
		Amajor.aMajorChord.add(D_STRING.E.toString());
		Amajor.aMajorChord.add(G_STRING.A.toString());
		Amajor.aMajorChord.add(B_STRING.Cs.toString());
		Amajor.aMajorChord.add(HIGH_E_STRING.E.toString());
		
		//AMajor TextBoxes
		Amajor.aMajorTxtBoxes.add("EString_X");//X
		Amajor.aMajorTxtBoxes.add("AString_A");
		Amajor.aMajorTxtBoxes.add("DString_E");
		Amajor.aMajorTxtBoxes.add("GString_A");
		Amajor.aMajorTxtBoxes.add("BString_Cs");
		Amajor.aMajorTxtBoxes.add("eString_E");
		
		//C Major		
		Cmajor.cMajorChord.add(E_STRING.X.toString());
		Cmajor.cMajorChord.add(A_STRING.C.toString());
		Cmajor.cMajorChord.add(D_STRING.E.toString());
		Cmajor.cMajorChord.add(G_STRING.G.toString());
		Cmajor.cMajorChord.add(B_STRING.C.toString());
		Cmajor.cMajorChord.add(HIGH_E_STRING.E.toString());
		
		//CMajor TextBoxes
		Cmajor.cMajorTxtBoxes.add("EString_X");
		Cmajor.cMajorTxtBoxes.add("AString_C");
		Cmajor.cMajorTxtBoxes.add("DString_E");
		Cmajor.cMajorTxtBoxes.add("GString_G");
		Cmajor.cMajorTxtBoxes.add("BString_C");
		Cmajor.cMajorTxtBoxes.add("eString_E");
		
		//D Major
		Dmajor.dMajorChord.add(E_STRING.X.toString());
		Dmajor.dMajorChord.add(A_STRING.X.toString());
		Dmajor.dMajorChord.add(D_STRING.D.toString());
		Dmajor.dMajorChord.add(G_STRING.A.toString());
		Dmajor.dMajorChord.add(B_STRING.D.toString());
		Dmajor.dMajorChord.add(HIGH_E_STRING.Fs.toString());
		
		//DMajor TextBoxes
		Dmajor.dMajorTxtBoxes.add("EString_X");
		Dmajor.dMajorTxtBoxes.add("AString_X");
		Dmajor.dMajorTxtBoxes.add("DString_D");
		Dmajor.dMajorTxtBoxes.add("GString_A");
		Dmajor.dMajorTxtBoxes.add("BString_D");
		Dmajor.dMajorTxtBoxes.add("eString_Fs");
		
		//E Major
		Emajor.eMajorChord.add(E_STRING.E.toString());
		Emajor.eMajorChord.add(A_STRING.B.toString());
		Emajor.eMajorChord.add(D_STRING.E.toString());
		Emajor.eMajorChord.add(G_STRING.Gs.toString());
		Emajor.eMajorChord.add(B_STRING.B.toString());
		Emajor.eMajorChord.add(HIGH_E_STRING.E.toString());
		
		//EMajor TextBoxes
		Emajor.eMajorTxtBoxes.add("EString_E");
		Emajor.eMajorTxtBoxes.add("AString_B");
		Emajor.eMajorTxtBoxes.add("DString_E");
		Emajor.eMajorTxtBoxes.add("GString_Gs");
		Emajor.eMajorTxtBoxes.add("BString_B");
		Emajor.eMajorTxtBoxes.add("eString_E");
		
		//F Major
		Fmajor.fMajorChord.add(E_STRING.X.toString());
		Fmajor.fMajorChord.add(A_STRING.X.toString());
		Fmajor.fMajorChord.add(D_STRING.F.toString());
		Fmajor.fMajorChord.add(G_STRING.A.toString());
		Fmajor.fMajorChord.add(B_STRING.C.toString());
		Fmajor.fMajorChord.add(HIGH_E_STRING.F.toString());
		
		//FMajor TextBoxes
		Fmajor.fMajorTxtBoxes.add("EString_X");
		Fmajor.fMajorTxtBoxes.add("AString_X");
		Fmajor.fMajorTxtBoxes.add("DString_F");
		Fmajor.fMajorTxtBoxes.add("GString_A");
		Fmajor.fMajorTxtBoxes.add("BString_C");
		Fmajor.fMajorTxtBoxes.add("eString_F");
		
		
	}
	
	public ArrayList<String> getChords(String chordName){
		if (chordName.equals("Gmajor")){
			return Gmajor.gMajorTxtBoxes;//textBoxes
		} else if (chordName.equals("Amajor")){
			return Amajor.aMajorTxtBoxes;
		} else if (chordName.equals("Cmajor")){
			return Cmajor.cMajorTxtBoxes;
		} else if (chordName.equals("Dmajor")){
			return Dmajor.dMajorTxtBoxes;
		} else if (chordName.equals("Emajor")){
			return Emajor.eMajorTxtBoxes;
		} else if (chordName.equals("Fmajor")){
			return Fmajor.fMajorTxtBoxes;
		}
		return null;
	}
	
	public ArrayList<String> getChordNotes(String chordName){
		if (chordName.equals("Gmajor")){
			return Gmajor.gMajorChord;
		} else if (chordName.equals("Amajor")){
			return Amajor.aMajorChord;
		} else if (chordName.equals("Cmajor")){
			return Cmajor.cMajorChord;
		} else if (chordName.equals("Dmajor")){
			return Dmajor.dMajorChord;
		} else if (chordName.equals("Emajor")){
			return Emajor.eMajorChord;
		} else if (chordName.equals("Fmajor")){
			return Fmajor.fMajorChord;
		}
		return null;
	}
}
