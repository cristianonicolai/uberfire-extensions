/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.ext.widgets.common.client.common;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import org.gwtbootstrap3.client.ui.FormLabel;

public class FormStyleItem extends Composite {

    @UiField
    FormLabel label;

    @UiField
    FlowPanel widget;

    interface FormStyleLayoutBinder
            extends
            UiBinder<Widget, FormStyleItem> {

    }

    private static FormStyleLayoutBinder uiBinder = GWT.create( FormStyleLayoutBinder.class );

    public FormStyleItem() {
        initWidget( uiBinder.createAndBindUi( this ) );
    }

    public void setup( String labelText,
                       IsWidget field ) {

        label.setText( labelText );
        widget.add( field );
    }

}
