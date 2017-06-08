package application;
	
import java.awt.Insets;
import java.beans.IndexedPropertyChangeEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;
import com.sun.prism.paint.Color;
import javafx.application.Application;
import javafx.beans.property.SetProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Main extends Application {
	
	public Scene scene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//Setup grid for FretFinder
						
			
			GridPane grid = new GridPane();
			grid.setStyle("-fx-background-image: url('file:C:/pic/FretFinderBG.jpg')");
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(2); //height of gaps in columns
			grid.setVgap(2); //width of gaps in columns
			//grid.setPadding(new Insets(2, 2, 2, 2)); //setup padding if needed
						
			//Title
			Text scenetitle = new Text("Fret Finder");
			scenetitle.setFont(Font.font("Arial", FontWeight.BOLD, 28)); //css for title
			//scenetitle.setTextAlignment(CENTER); <================COME BACK HERE================>
			grid.add(scenetitle, 3, 0); //positioning for title
															
//==================================X STRINGS (not played)===========================================//			
			TextField eString_X = new TextField("");
			eString_X.setId("eString_X");
			eString_X.setEditable(false);
			eString_X.setVisible(false);
			grid.add(eString_X, 5, 5);
			
			TextField BString_X = new TextField("");
			BString_X.setId("BString_X");
			BString_X.setEditable(false);
			BString_X.setVisible(false);
			grid.add(BString_X, 5, 6);
			
			TextField GString_X = new TextField("");
			GString_X.setId("GString_X");
			GString_X.setEditable(false);
			GString_X.setVisible(false);
			grid.add(GString_X, 5, 7);
			
			TextField DString_X = new TextField("");
			DString_X.setId("DString_X");
			DString_X.setEditable(false);
			DString_X.setVisible(false);
			grid.add(DString_X, 5, 8);
			
			TextField AString_X = new TextField("");
			AString_X.setEditable(false);
			AString_X.setId("AString_X");
			AString_X.setVisible(false);
			grid.add(AString_X, 5, 9);
			
			TextField EString_X = new TextField("");
			EString_X.setId("EString_X");
			EString_X.setEditable(false);
			EString_X.setVisible(false);
			grid.add(EString_X, 5, 10);
			
			
//==========================================Open Strings========================================//			
			//COMING BACK HERE!!!!!
			//HIGH e OPEN
			TextField eString_E = new TextField("              ");		
			eString_E.setId("eString_E");
			eString_E.setEditable(false);			
			eString_E.setVisible(false);
			grid.add(eString_E, 0, 5);
			
			//B OPEN
			TextField BString_B = new TextField("              ");
			BString_B.setId("BString_B");
			BString_B.setEditable(false);
			BString_B.setVisible(false);
			grid.add(BString_B, 0, 6);
			
			//G OPEN
			TextField GString_G = new TextField("              ");
			GString_G.setId("GString_G");
			GString_G.setEditable(false);			
			GString_G.setVisible(false);
			grid.add(GString_G, 0, 7);
			
			//D OPEN
			TextField DString_D = new TextField("              ");
			DString_D.setId("DString_D");
			DString_D.setEditable(false);			
			DString_D.setVisible(false);
			grid.add(DString_D, 0, 8);
			
			//A OPEN
			TextField AString_A = new TextField("              ");
			AString_A.setId("AString_A");
			AString_A.setEditable(false);			
			AString_A.setVisible(false);
			grid.add(AString_A, 0, 9);
			
			//LOW E OPEN
			TextField EString_E = new TextField("              ");
			EString_E.setId("EString_E");
			EString_E.setEditable(false);			
			EString_E.setVisible(false);
			grid.add(EString_E, 0, 10);
			
			
			//===========================Frets=====================================//

			//e String			
			TextField eString_F = new TextField("              ");
			eString_F.setId("eString_F");
			eString_F.setEditable(false);
			eString_F.setAlignment(Pos.CENTER);
			grid.add(eString_F, 2, 5);
			
			TextField eString_Fs = new TextField("              ");
			eString_Fs.setId("eString_Fs");
			eString_Fs.setEditable(false);
			eString_Fs.setAlignment(Pos.CENTER);
			grid.add(eString_Fs, 3, 5);
			
			TextField eString_G = new TextField("              ");
			eString_G.setId("eString_G");
			eString_G.setEditable(false);
			eString_G.setAlignment(Pos.CENTER);
			grid.add(eString_G, 4, 5);
			
			//B string
			TextField BString_C = new TextField("              ");
			BString_C.setId("BString_C");
			BString_C.setEditable(false);
			BString_C.setAlignment(Pos.CENTER);
			grid.add(BString_C, 2, 6);			
			
			TextField BString_Cs = new TextField("              ");
			BString_Cs.setId("BString_Cs");
			BString_Cs.setEditable(false);
			BString_Cs.setAlignment(Pos.CENTER);
			grid.add(BString_Cs, 3, 6);			
			
			TextField BString_D = new TextField("              ");
			BString_D.setId("BString_D");
			BString_D.setEditable(false);
			BString_D.setAlignment(Pos.CENTER);
			grid.add(BString_D, 4, 6);					
			
			//G string						
			TextField GString_Gs = new TextField("              ");
			GString_Gs.setId("GString_Gs");
			GString_Gs.setEditable(false);
			GString_Gs.setAlignment(Pos.CENTER);
			grid.add(GString_Gs, 2, 7);
			
			TextField GString_A = new TextField("              ");
			GString_A.setId("GString_A");
			GString_A.setEditable(false);
			GString_A.setAlignment(Pos.CENTER);
			grid.add(GString_A, 3, 7);
			
			TextField GString_As = new TextField("              ");
			GString_As.setId("GString_As");
			GString_As.setEditable(false);
			GString_As.setAlignment(Pos.CENTER);
			grid.add(GString_As, 4, 7);
			
			//D string
			TextField DString_Ds = new TextField("              ");
			DString_Ds.setId("DString_Ds");
			DString_Ds.setEditable(false);
			DString_Ds.setAlignment(Pos.CENTER);
			grid.add(DString_Ds, 2, 8);
			
			TextField DString_E = new TextField("              ");
			DString_E.setId("DString_E");
			DString_E.setEditable(false);
			DString_E.setAlignment(Pos.CENTER);
			grid.add(DString_E, 3, 8);
			
			TextField DString_F = new TextField("              ");
			DString_F.setId("DString_F");
			DString_F.setEditable(false);
			DString_F.setAlignment(Pos.CENTER);
			grid.add(DString_F, 4, 8);
			
			//A string
			TextField AString_As = new TextField("              ");
			AString_As.setId("AString_As");
			AString_As.setEditable(false);
			AString_As.setAlignment(Pos.CENTER);
			grid.add(AString_As, 2, 9);
			
			TextField AString_B = new TextField("              ");
			AString_B.setId("AString_B");
			AString_B.setEditable(false);
			AString_B.setAlignment(Pos.CENTER);
			grid.add(AString_B, 3, 9);
			
			TextField AString_C = new TextField("              ");
			AString_C.setId("AString_C");
			AString_C.setEditable(false);
			AString_C.setAlignment(Pos.CENTER);
			grid.add(AString_C, 4, 9);
			
			//Low E string
			TextField EString_F = new TextField("              ");
			EString_F.setId("EString_F");
			EString_F.setEditable(false);
			EString_F.setAlignment(Pos.CENTER);
			grid.add(EString_F, 2, 10);
			
			TextField EString_Fs = new TextField("              ");
			EString_Fs.setId("EString_Fs");
			EString_Fs.setEditable(false);
			EString_Fs.setAlignment(Pos.CENTER);
			grid.add(EString_Fs, 3, 10);
			
			TextField EString_G = new TextField("              ");
			EString_G.setId("EString_G");
			EString_G.setEditable(false);
			EString_G.setAlignment(Pos.CENTER);
			grid.add(EString_G, 4, 10);
						
			//========================String & Position Labels========================//
			
			//Change to (1, x) to swap with the hidden open TextFields
			Label lblString_e = new Label("e");
			lblString_e.setFont(Font.font("Arial", FontWeight.BOLD, 18));
			grid.add(lblString_e, 1, 5);
			
			Label lblString_B = new Label("B");
			lblString_B.setFont(Font.font("Arial", FontWeight.BOLD, 18));
			grid.add(lblString_B, 1, 6);
			
			Label lblString_G = new Label("G");
			lblString_G.setFont(Font.font("Arial", FontWeight.BOLD, 18));
			grid.add(lblString_G, 1, 7);
			
			Label lblString_D = new Label("D");
			lblString_D.setFont(Font.font("Arial", FontWeight.BOLD, 18));
			grid.add(lblString_D, 1, 8);
			
			Label lblString_A = new Label("A");
			lblString_A.setFont(Font.font("Arial", FontWeight.BOLD, 18));
			grid.add(lblString_A, 1, 9);
			
			Label lblString_E = new Label("E");
			lblString_E.setFont(Font.font("Arial", FontWeight.BOLD, 18));
			grid.add(lblString_E, 1, 10);
			//Label lblPos1 = new Label("Open");//OPEN
			//grid.add(lblPos1, 1, 4);
			Label lblPos2 = new Label("Fret 1");//Fret 1
			grid.add(lblPos2, 2, 4);
			Label lblPos3 = new Label("Fret 2");//Fret 2
			grid.add(lblPos3, 3, 4);
			Label lblPos4 = new Label("Fret 3");//Fret 3
			grid.add(lblPos4, 4, 4);
									
//=====================================Labels and Combo-Boxes for selections===============================//
						
			Text currentChord = new Text();			
			currentChord.setFont(Font.font("Arial", FontWeight.BOLD, 30));
			grid.add(currentChord, 3, 1);
			
			Label lblChord = new Label("Chord");
			grid.add(lblChord, 2, 1);
			
			ComboBox<String> cbxChord = new ComboBox<String>(FXCollections.observableArrayList(
					"A", "C", "D", "E", "F", "G"));
			cbxChord.setEditable(false);
			cbxChord.setValue("");
			grid.add(cbxChord, 2, 2);
			
			Label lblType = new Label("Type");			
			grid.add(lblType, 4, 1);
						
			ComboBox<String> cbxType = new ComboBox<String>(FXCollections.observableArrayList(
					"major")); // minor, sus, 7, 9, minor7, sus7
			cbxType.setEditable(false);
			cbxType.setValue("");
			grid.add(cbxType, 4, 2);
			
			//====================EVENT LISTENERS ON CBX CHANGES!!!============================//
						
			cbxChord.valueProperty().addListener(new ChangeListener<String>() {			
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				//THIS IS WHERE WE GET THE CHORD NOTE VALUE!!!!!!!				
				if (currentChord.toString() == ""){
					currentChord.setText(cbxChord.getValue());					
				} else {
					currentChord.setText(cbxChord.getValue());
					cbxType.setValue(""); //Clear out cbxType	
					
					ChordInfo allTxtBox = new ChordInfo(); //new instance of ChordInfo()
					allTxtBox.setTxtBoxes();//set all text box names
					
					//Console Testing
					//System.out.println(allTxtBox.getTxtBoxes());
					
					ArrayList<String> clearColors = allTxtBox.getTxtBoxes();					
					for (int i = 0; i < allTxtBox.getTxtBoxes().size(); i++){
						scene.lookup("#" + clearColors.get(i)).setStyle(null);
						((TextField) scene.lookup("#" + clearColors.get(i))).setText(null);
					}															
				}												
			}
			});
			
			cbxType.valueProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
					//THIS IS WEHRE WE GET THE CHORD TYPE!!!!					
					if (currentChord.toString() == ""){
						currentChord.setText(cbxType.getValue());
					} else {							
						currentChord.setText(cbxChord.getValue() + cbxType.getValue());											
					}	
				}					
			});
			
			//BUTTON CONTROLS
			Button getChord = new Button("Get Chord");
			HBox hbBtn = new HBox(15);
			grid.add(hbBtn, 3, 2);			
			hbBtn.setAlignment(Pos.BOTTOM_CENTER);
			hbBtn.getChildren().add(getChord);
			
			//Button Actions
			EventHandler<ActionEvent> actionEventHandler =
					new EventHandler<ActionEvent>() {
				public void handle(final ActionEvent myEvent) {

					Strings chord = new Strings(); //New instance of Strings()
					chord.setChords(); //setup all chords
					chord.setStrings();//setup all strings
																				
					//Tests to find properties
					//System.out.println(chord.getChords(currentChord.getText()));										
									
					//gets names of all textFields and store them in arrayList
					ArrayList<String> setColor = chord.getChords(currentChord.getText()); 
					ArrayList<String> setTexts = chord.getChordNotes(currentChord.getText());					
					//cycle through array containing textFields and change color (#7689BA = blue)	
					for (int i = 0; i < 6; i++){																	
						scene.lookup("#" + setColor.get(i)).setStyle("-fx-background-color: #7689BA");
						//System.out.println(chord.getChordNotes(currentChord.getText()));
						((TextField) scene.lookup("#" + setColor.get(i))).setText(setTexts.get(i));
						((TextField) scene.lookup("#" + setColor.get(i))).setFont(Font.font("Arial", FontWeight.BOLD, 13));
						
						
					}
					//Open Strings in chord selections (#7ED57E = green)
					Strings red = new Strings();
					
					red.seteString();
					if (eString_E.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> greenStrings = red.geteString();
						for (int i = 0; i < greenStrings.size(); i++){
							scene.lookup("#" + greenStrings.get(i)).setStyle("-fx-background-color: #7ED57E");
						}
					}
					red.setBString();
					if (BString_B.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> greenStrings = red.getBString();
						for (int i = 0; i < greenStrings.size(); i++){
							scene.lookup("#" + greenStrings.get(i)).setStyle("-fx-background-color: #7ED57E");
						}
					}
					red.setGString();
					if (GString_G.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> gStrings = red.getGString();						
						for (int i = 0; i < gStrings.size(); i++){
							scene.lookup("#" + gStrings.get(i)).setStyle("-fx-background-color: #7ED57E");
						}
					}					
					red.setDString();
					if (DString_D.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> dStrings = red.getDString();
						for (int i = 0; i < dStrings.size(); i++){
							scene.lookup("#" + dStrings.get(i)).setStyle("-fx-background-color: #7ED57E");
						}
					}
					red.setAString();
					if (AString_A.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> greenStrings = red.getAString();
						for (int i = 0; i < greenStrings.size(); i++){
							scene.lookup("#" + greenStrings.get(i)).setStyle("-fx-background-color: #7ED57E");
						}
					}
					red.setEString();
					if (EString_E.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> greenStrings = red.getEString();
						for (int i = 0; i < greenStrings.size(); i++){
							scene.lookup("#" + greenStrings.get(i)).setStyle("-fx-background-color: #7ED57E");
						}	
					}
					//X strings in chord selections (#C93F3F = red)
					red.seteString();
					if (eString_X.getStyle().equals("-fx-background-color: #7689BA")){					
						ArrayList<String> redStrings = red.geteString();					
						for (int i = 0; i < redStrings.size(); i++){						
							scene.lookup("#" + redStrings.get(i)).setStyle("-fx-background-color: #C93F3F");					
						}
					}
					red.setBString();
					if (BString_X.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> redStrings = red.getBString();					
						for (int i = 0; i < redStrings.size(); i++){						
							scene.lookup("#" + redStrings.get(i)).setStyle("-fx-background-color: #C93F3F");					
						}
					}
					red.setGString();
					if (GString_X.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> redStrings = red.getGString();					
						for (int i = 0; i < redStrings.size(); i++){						
							scene.lookup("#" + redStrings.get(i)).setStyle("-fx-background-color: #C93F3F");					
						}
					}
					red.setDString();
					if (GString_X.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> redStrings = red.getDString();					
						for (int i = 0; i < redStrings.size(); i++){						
							scene.lookup("#" + redStrings.get(i)).setStyle("-fx-background-color: #C93F3F");					
						}
					}
					red.setAString();
					if (AString_X.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> redStrings = red.getAString();					
						for (int i = 0; i < redStrings.size(); i++){						
							scene.lookup("#" + redStrings.get(i)).setStyle("-fx-background-color: #C93F3F");					
						}
					}
					red.setEString();
					if (EString_X.getStyle().equals("-fx-background-color: #7689BA")){
						ArrayList<String> redStrings = red.getEString();					
						for (int i = 0; i < redStrings.size(); i++){						
							scene.lookup("#" + redStrings.get(i)).setStyle("-fx-background-color: #C93F3F");					
						}
					}
					
				};					
			};
			
			getChord.setOnAction(actionEventHandler); //creation of box coloring
			
			//Setting up the scene to display in the java window
			
			scene = new Scene(grid, 900, 500); //controls the size of the window
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); //call in css
			primaryStage.setScene(scene); //get scene ready
			primaryStage.show(); //display app
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
