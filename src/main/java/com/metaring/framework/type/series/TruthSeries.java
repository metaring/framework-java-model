/**
 *    Copyright 2019 MetaRing s.r.l.
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.metaring.framework.type.series;

import java.util.List;

import org.apache.calcite.linq4j.Enumerable;

import com.metaring.framework.CoreType;

public interface TruthSeries extends CoreType, List<Boolean> {
    Boolean[] toArray();
    Enumerable<Boolean> asEnumerable();
    boolean addAll(Enumerable <Boolean> enumerable);
    boolean containsAll(Enumerable<Boolean> enumerable);
    boolean removeAll(Enumerable<Boolean> enumerable);
    boolean retainAll(Enumerable<Boolean> enumerable);
    boolean addAll(Boolean[] array);
    boolean containsAll(Boolean[] array);
    boolean removeAll(Boolean[] array);
    boolean retainAll(Boolean[] array);
}