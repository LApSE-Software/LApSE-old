/*
 * The MIT License
 *
 * Copyright 2015 Burhanuddin.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package lapse.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import lapse.MainApp;

/**
 * FXML Controller class
 *
 * @author Burhanuddin
 */
public class DrawingSequenceController implements Initializable {

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane drawingPane;
    
    public MainApp mainApp;
    
    private Group mainGroup;
    private Group lineLabelGroup;
    private Group lineSequenceGroup;
    private Group drawingSequenceGroup;
    private Group arrowGroup;
    private Group circleGroup;
    private Canvas canvas;
    private Rectangle rect;
    private GraphicsContext gc;
    
    private int minWidth, minHeight;
    private double startX, startY;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
}
