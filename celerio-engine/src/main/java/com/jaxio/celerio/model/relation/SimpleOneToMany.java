/*
 * Copyright 2015 JAXIO http://www.jaxio.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jaxio.celerio.model.relation;

import com.jaxio.celerio.model.Attribute;
import com.jaxio.celerio.model.Entity;
import com.jaxio.celerio.support.Namer;

public class SimpleOneToMany extends SimpleRelation {

    public SimpleOneToMany(Namer fromNamer, Namer toNamer, Attribute fromAttribute, Entity fromEntity, Entity toEntity, Attribute toAttribute) {
        super(fromNamer, toNamer, fromAttribute, fromEntity, toEntity, toAttribute);
    }

    @Override
    final public boolean isOneToMany() {
        return true;
    }

    // ---------------------------
    // VIEW SUPPORT
    // ---------------------------
    @Override
    public String getLabelName() {
        return getFromEntity().getModel().getVar() + "_" + getTo().getVars();
    }
}
