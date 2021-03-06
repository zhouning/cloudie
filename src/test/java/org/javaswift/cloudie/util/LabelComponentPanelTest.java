/*
 *  Copyright 2012-2013 E.Hooijmeijer
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.javaswift.cloudie.util;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import javax.swing.JComponent;
import javax.swing.JLabel;


import org.javaswift.cloudie.util.LabelComponentPanel;
import org.junit.Test;

public class LabelComponentPanelTest {

    @Test
    public void shouldCreateWithOne() {
        JComponent comp = new JLabel();
        LabelComponentPanel cmp = new LabelComponentPanel("label", comp);
        //
        assertTrue(Arrays.asList(cmp.getComponents()).contains(comp));
    }

    @Test
    public void shouldCreateWithTwo() {
        JComponent comp = new JLabel();
        JComponent compToo = new JLabel();
        LabelComponentPanel cmp = new LabelComponentPanel("label", comp, compToo);
        //
        assertTrue(Arrays.asList(cmp.getComponents()).contains(comp));
        assertTrue(Arrays.asList(cmp.getComponents()).contains(compToo));
    }
}
