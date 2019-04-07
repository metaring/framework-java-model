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

package com.metaring.framework.util.log;

public interface Logger {
    String getLoggedSystemName();
    LogMessageType getMinimumLogLevel();
    void setMinimumLogLevel(LogMessageType message);
    Long getActualStackPosition();
    void setActualStackPosition(Long position);
    String entering();
    String entering(String methodName);
    String exiting();
    String exiting(String methodName);
    String info(String message);
    String debug(String message);
    String config(String message, Object var2);
    String warning(String message);
    String severe(String message);
}