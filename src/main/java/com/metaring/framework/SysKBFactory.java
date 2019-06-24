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

package com.metaring.framework;

import com.metaring.framework.util.log.LogMessageType;
import com.metaring.framework.type.DataRepresentation;

public interface SysKBFactory {
    SysKB load(String fileName);
    SysKB create(String systemName);
    SysKB create(String systemName, LogMessageType logMessageType);
    SysKB create(String systemName, Boolean test);
    SysKB create(String systemName, LogMessageType logMessageType, Boolean test);
    SysKB create(DataRepresentation dataRepresentation);
}