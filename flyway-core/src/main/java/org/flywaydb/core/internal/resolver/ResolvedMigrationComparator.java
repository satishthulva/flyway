/*
 * Copyright 2010-2018 Boxfuse GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.internal.resolver;

import java.util.Comparator;

import org.flywaydb.core.api.resolver.ResolvedMigration;

/**
* Comparator for ResolvedMigration.
*/
public class ResolvedMigrationComparator implements Comparator<ResolvedMigration> {
    @Override
    public int compare(ResolvedMigration o1, ResolvedMigration o2) {
        if ((o1.getVersion() != null) && o2.getVersion() != null) {
            int v = o1.getVersion().compareTo(o2.getVersion());













            return v;
        }
        if (o1.getVersion() != null) {
            return Integer.MIN_VALUE;
        }
        if (o2.getVersion() != null) {
            return Integer.MAX_VALUE;
        }

        if(o1.getDescription() == null && o2.getDescription() == null) {
        	return 0;
        }
        
        if(o1.getDescription() == null) {
        	return -1;
        }
        
        if(o2.getDescription() == null) {
        	return 1;
        }
        
        return o1.getDescription().compareTo(o2.getDescription());
    }
}