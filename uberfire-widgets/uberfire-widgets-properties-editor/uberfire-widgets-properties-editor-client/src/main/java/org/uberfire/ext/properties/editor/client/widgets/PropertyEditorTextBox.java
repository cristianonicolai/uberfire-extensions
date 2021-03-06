package org.uberfire.ext.properties.editor.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import org.gwtbootstrap3.client.ui.TextBox;

public class PropertyEditorTextBox extends AbstractPropertyEditorWidget {

    @UiField
    TextBox textBox;

    public PropertyEditorTextBox() {
        initWidget( uiBinder.createAndBindUi( this ) );
        textBox.addFocusHandler( new FocusHandler() {
            @Override
            public void onFocus( FocusEvent event ) {
                textBox.selectAll();
            }
        } );
    }

    public void setText(String text){
        textBox.setText( text );
    }

    public void setId( String id ) {
//        textBox.setId( id );
    }

    public String getText() {
        return textBox.getText();
    }

    public void addKeyDownHandler( KeyDownHandler keyDownHandler ) {
        textBox.addKeyDownHandler( keyDownHandler );
    }

    public void addBlurHandler( BlurHandler blurHandler ) {
        textBox.addBlurHandler( blurHandler );
    }

    interface MyUiBinder extends UiBinder<Widget, PropertyEditorTextBox> {

    }

    private static MyUiBinder uiBinder = GWT.create( MyUiBinder.class );

}