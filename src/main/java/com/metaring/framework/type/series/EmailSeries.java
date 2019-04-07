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
import com.metaring.framework.type.Email;

public interface EmailSeries extends CoreType, List<Email> {
    Email[] toArray();
    Enumerable<Email> asEnumerable();
    boolean addAll(Enumerable <Email> enumerable);
    boolean containsAll(Enumerable<Email> enumerable);
    boolean removeAll(Enumerable<Email> enumerable);
    boolean retainAll(Enumerable<Email> enumerable);
    boolean addAll(Email[] array);
    boolean containsAll(Email[] array);
    boolean removeAll(Email[] array);
    boolean retainAll(Email[] array);
}