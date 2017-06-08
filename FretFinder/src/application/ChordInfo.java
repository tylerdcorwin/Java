package application;

import java.util.ArrayList;
import javafx.scene.control.TextField;

public class ChordInfo {

	public ArrayList<String> allTxtBoxes = new ArrayList<String>(); //access all text box fields
	
	public ArrayList<String> gMajorChord = new ArrayList<String>(); //stores gMajor chord notes
	public ArrayList<String> aMajorChord = new ArrayList<String>(); //stores aMajor chord notes
	public ArrayList<String> cMajorChord = new ArrayList<String>(); //stores cMajor chord notes
	public ArrayList<String> dMajorChord = new ArrayList<String>(); //stores dMajor chord notes
	public ArrayList<String> eMajorChord = new ArrayList<String>(); //stores eMajor chord notes
	public ArrayList<String> fMajorChord = new ArrayList<String>(); //stores fMajor chord notes
		
	public ArrayList<String> gMajorTxtBoxes = new ArrayList<String>(); //stores gMajor text boxes
	public ArrayList<String> aMajorTxtBoxes = new ArrayList<String>(); //stores aMajor text boxes
	public ArrayList<String> cMajorTxtBoxes = new ArrayList<String>(); //stores cMajor text boxes
	public ArrayList<String> dMajorTxtBoxes = new ArrayList<String>(); //stores dMajor text boxes
	public ArrayList<String> eMajorTxtBoxes = new ArrayList<String>(); //stores eMajor text boxes
	public ArrayList<String> fMajorTxtBoxes = new ArrayList<String>(); //stores fMajor text boxes
	
	
	public String chordName;
	public String txtBox;
	
	public String getChordName(){
		return chordName;
	}
	public void setChordName(String name){
		chordName = name;
		//notesForChord.add(name);
	}
	public void notesForChord(String name) {
		// TODO Auto-generated method stub
		
	}
	public void setTxtBoxes(){
		//E
		allTxtBoxes.add("EString_E");
		allTxtBoxes.add("EString_F");
		allTxtBoxes.add("EString_Fs");
		allTxtBoxes.add("EString_G");
		allTxtBoxes.add("EString_X");
		//A
		allTxtBoxes.add("AString_A");
		allTxtBoxes.add("AString_As");
		allTxtBoxes.add("AString_B");
		allTxtBoxes.add("AString_C");
		allTxtBoxes.add("AString_X");
		//D
		allTxtBoxes.add("DString_D");
		allTxtBoxes.add("DString_Ds");
		allTxtBoxes.add("DString_E");
		allTxtBoxes.add("DString_F");
		allTxtBoxes.add("DString_X");
		//G
		allTxtBoxes.add("GString_G");
		allTxtBoxes.add("GString_Gs");
		allTxtBoxes.add("GString_A");
		allTxtBoxes.add("GString_As");
		allTxtBoxes.add("GString_X");
		//B
		allTxtBoxes.add("BString_B");
		allTxtBoxes.add("BString_C");
		allTxtBoxes.add("BString_Cs");
		allTxtBoxes.add("BString_D");
		allTxtBoxes.add("BString_X");
		//e
		allTxtBoxes.add("eString_E");
		allTxtBoxes.add("eString_F");
		allTxtBoxes.add("eString_Fs");
		allTxtBoxes.add("eString_G");
		allTxtBoxes.add("eString_X");
		
	}
	
	public ArrayList<String> getTxtBoxes(){
		
			return allTxtBoxes;
	}
}