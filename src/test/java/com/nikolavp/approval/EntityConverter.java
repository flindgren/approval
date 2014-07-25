package com.nikolavp.approval;

/*
 * #%L
 * approval
 * %%
 * Copyright (C) 2014 Nikolavp
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.nikolavp.approval.converters.Converter;

import javax.annotation.Nonnull;
import java.nio.charset.StandardCharsets;

public class EntityConverter implements Converter<Entity> {
    @Nonnull
    @Override
    public byte[] getRawForm(Entity value) {
        return ("Entity is:\n" +
                "age = " + value.getAge() + "\n" +
                "name = " + value.getName() + "\n").getBytes(StandardCharsets.UTF_8);
    }
}
