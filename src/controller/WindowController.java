package controller;
import model.Buscaminas;
import model.Casilla;
import model.ExcepcionDarPista;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WindowController implements Initializable{
	
	private Buscaminas buscaminas;
	@FXML
	private AnchorPane ap;
	@FXML
	private AnchorPane ap2;
	@FXML
	private BorderPane bp;
	@FXML
	private GridPane gd;
	@FXML
	private Label info;
	@FXML
	private Label infoFinish;
	@FXML
	private Button reinicio;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		bp.setVisible(false);
		ap.setVisible(true);
	}
	
	public void principiante(MouseEvent e) {
		info.setText("");
		ap.setVisible(false);
		buscaminas = new Buscaminas(1);
		gd = new GridPane();
		for(int i = 0; i < buscaminas.darCasillas().length; i++) {
			for(int j = 0; j < buscaminas.darCasillas()[i].length; j++) {
				Button b = new Button();
				b.setMinWidth(40);
				b.setMinHeight(40);
				b.setId(i+"-"+j);
				b.setOnMouseClicked(p -> {
					if (p.getButton() == MouseButton.SECONDARY) {
	                    if(b.getText().equals("m")) {
	                    	b.setText("");
	                    }
	                    else if(b.getText().equals("")) {
	                    	b.setText("m");
	                    }
	                }
				});
				b.setOnAction(t -> {
					if(!b.getText().equals("m")) {
						String[] s = b.getId().split("-");
						destaparMina(Integer.parseInt(s[0]), Integer.parseInt(s[1]), b);
						b.setOnAction(p -> {
						});
					}
				});
				gd.add(b, j, i);
			}
		}
		bp.setVisible(true);
		bp.setCenter(gd);
	}
	
	public void intermedio(MouseEvent e) {
		info.setText("");
		ap.setVisible(false);
		buscaminas = new Buscaminas(2);
		gd = new GridPane();
		for(int i = 0; i < buscaminas.darCasillas().length; i++) {
			for(int j = 0; j < buscaminas.darCasillas()[i].length; j++) {
				Button b = new Button();
				b.setMinWidth(30);
				b.setMinHeight(30);
				b.setId(i+"-"+j);
				b.setOnMouseClicked(p -> {
					if (p.getButton() == MouseButton.SECONDARY) {
	                    if(b.getText().equals("m")) {
	                    	b.setText("");
	                    }
	                    else if(b.getText().equals("")) {
	                    	b.setText("m");
	                    }
	                }
				});
				b.setOnAction(t -> {
					if(!b.getText().equals("m")) {
						String[] s = b.getId().split("-");
						destaparMina(Integer.parseInt(s[0]), Integer.parseInt(s[1]), b);
						b.setOnAction(p -> {
						});
					}
				});
				gd.add(b, j, i);
			}
		}
		bp.setVisible(true);
		bp.setCenter(gd);
	}
	
	public void experto(MouseEvent e) {
		info.setText("");
		ap.setVisible(false);
		buscaminas = new Buscaminas(3);
		gd = new GridPane();
		for(int i = 0; i < buscaminas.darCasillas().length; i++) {
			for(int j = 0; j < buscaminas.darCasillas()[i].length; j++) {
				Button b = new Button();
				b.setMinWidth(30);
				b.setMinHeight(30);
				b.setId(i+"-"+j);
				b.setOnMouseClicked(p -> {
					if (p.getButton() == MouseButton.SECONDARY) {
	                    if(b.getText().equals("m")) {
	                    	b.setText("");
	                    }
	                    else if(b.getText().equals("")) {
	                    	b.setText("m");
	                    }
	                }
				});
				b.setOnAction(t -> {
					if(!b.getText().equals("m")) {
						String[] s = b.getId().split("-");
						destaparMina(Integer.parseInt(s[0]), Integer.parseInt(s[1]), b);
						b.setOnAction(p -> {
						});
					}
				});
				gd.add(b, j, i);
			}
		}
		bp.setVisible(true);
		bp.setCenter(gd);
	}
	
	public void destaparMina(int i, int j, Button b) {
		buscaminas.abrirCasilla(i, j);
		b.setText(buscaminas.darCasillas()[i][j].mostrarValorCasilla()+"");
		if(b.getText().equals("*")) {
			perdio();
		}
		else {
			if(buscaminas.gano()) {
				bp.setVisible(false);
				ap2.setVisible(true);
				infoFinish.setText("Ganaste!");
			}
		}
	}
	
	public void perdio() {
		bp.setVisible(false);
		ap2.setVisible(true);
		infoFinish.setText("Perdiste!");
	}
	
	public void reiniciar(MouseEvent e){
		ap2.setVisible(false);
		bp.setVisible(false);
		ap.setVisible(true);
	}
	
	public void darPista(MouseEvent e) {
		String s = "";
		try {
			s = buscaminas.darPista();
			ObservableList os = gd.getChildren();
			for(int i = 0; i < os.size(); i++) {
				Button b = (Button)os.get(i);
				if(b.getId().equals(s)) {
					String[] sp = s.split("-");
					destaparMina(Integer.parseInt(sp[0]), Integer.parseInt(sp[1]), b);
				}
			}
		} catch (ExcepcionDarPista e1) {
			info.setText("No hay casillas para destapar");
		}
	}
	
	public void verSolucion(MouseEvent e) {
		buscaminas.resolver();
		ObservableList os = gd.getChildren();
		Casilla[][] c = buscaminas.darCasillas();
		int cont = 0;
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j <c[0].length; j++) {
				Button b = (Button)os.get(cont);
				b.setText(c[i][j].mostrarValorCasilla());
				b.setOnAction(p -> {
				});
				cont++;
			}
		}
		reinicio.setVisible(true);
		reinicio.setOnAction(t -> {
			reiniciar(e);
		});
	}
}
