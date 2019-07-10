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

package com.metaring.framework.type;

import com.metaring.framework.CoreType;
import com.metaring.framework.GeneratedCoreType;
import com.metaring.framework.type.series.DigitSeries;
import com.metaring.framework.type.series.EmailSeries;
import com.metaring.framework.type.series.RealDigitSeries;
import com.metaring.framework.type.series.TextSeries;
import com.metaring.framework.type.series.TruthSeries;
import com.metaring.framework.util.log.LogMessageType;

public interface DataRepresentation extends CoreType, Iterable<DataRepresentation> {

    Boolean hasProperty(String property);
    DataRepresentation add(Iterable<?> values);
    DataRepresentation set(int position, Iterable<?> values);
    DataRepresentation add(String property, Iterable<?> values);
    DataRepresentation remove(String property, String... properties);
    DataRepresentation remove(int position, int... otherPositions);
    DataRepresentation merge(DataRepresentation extension);
    DataRepresentation merge(DataRepresentation extension, DataRepresentation... extensions);

    Boolean isNull();
    Boolean isNull(String property);
    Boolean isNull(int position);

    Boolean isSimple();
    Boolean isSimple(String property);
    Boolean isSimple(int position);

    Boolean hasProperties();
    Boolean hasProperties(int position);
    Boolean hasProperties(String property);

    TextSeries getProperties();
    TextSeries getProperties(int position);
    TextSeries getProperties(String property);

    Boolean hasLength();
    Boolean hasLength(String property);
    Boolean hasLength(int position);

    Boolean isEmpty();
    Boolean isEmpty(String property);
    Boolean isEmpty(int position);

    Boolean isNullOrEmpty();
    Boolean isNullOrEmpty(String property);
    Boolean isNullOrEmpty(int position);

    Integer length();
    Integer getLength(String property);
    Integer getLength(int position);

    DataRepresentation first();
    String firstAsText();
    TextSeries firstAsTextSeries();
    Long firstAsDigit();
    DigitSeries firstAsDigitSeries();
    Double firstAsRealDigit();
    RealDigitSeries firstAsRealDigitSeries();
    Boolean firstAsTruth();
    TruthSeries firstAsTruthSeries();
    Email firstAsEmail();
    EmailSeries firstAsEmailSeries();
    <T extends GeneratedCoreType> T firstAs(Class<T> generatedCoreTypeClass);

    DataRepresentation add(String property, LogMessageType value);
    Boolean isLogMessageType(String porperty);
    LogMessageType getLogMessageType(String porperty);
    Boolean isLogMessageType();
    LogMessageType getLogMessageType();

    Boolean isText(int position);
    Boolean isTextSeries(int position);
    String getText(int position);
    TextSeries getTextSeries(int position);
    DataRepresentation add(String value);
    DataRepresentation add(String... values);
    DataRepresentation add(TextSeries values);
    DataRepresentation set(int position, String value);
    DataRepresentation set(int position, String... values);
    DataRepresentation set(int position, TextSeries values);
    DataRepresentation add(String property, String value);
    DataRepresentation add(String property, String... values);
    DataRepresentation add(String property, TextSeries value);
    Boolean isText();
    Boolean isTextSeries();
    Boolean isText(String property);
    Boolean isTextSeries(String property);
    String asText();
    String getText(String property);
    TextSeries getTextSeries(String property);
    TextSeries asTextSeries();

    Boolean isDigit(int position);
    Boolean isDigitSeries(int position);
    Long getDigit(int position);
    DigitSeries getDigitSeries(int position);
    DataRepresentation add(Long value);
    DataRepresentation add(Long...values);
    DataRepresentation add(DigitSeries values);
    DataRepresentation set(int position, Long value);
    DataRepresentation set(int position, Long...values);
    DataRepresentation set(int position, DigitSeries values);
    DataRepresentation add(String property, Long value);
    DataRepresentation add(String property, Long... values);
    DataRepresentation add(String property, DigitSeries value);
    Boolean isDigit();
    Boolean isDigitSeries();
    Long asDigit();
    DigitSeries asDigitSeries();
    Boolean isDigit(String property);
    Boolean isDigitSeries(String property);
    Long getDigit(String property);
    DigitSeries getDigitSeries(String property);

    Boolean isRealDigit(int position);
    Boolean isRealDigitSeries(int position);
    Double getRealDigit(int position);
    RealDigitSeries getRealDigitSeries(int position);
    DataRepresentation add(Double value);
    DataRepresentation add(Double...values);
    DataRepresentation add(RealDigitSeries values);
    DataRepresentation set(int position, Double value);
    DataRepresentation set(int position, Double...values);
    DataRepresentation set(int position, RealDigitSeries values);
    DataRepresentation add(String property, Double value);
    DataRepresentation add(String property, Double... values);
    DataRepresentation add(String property, RealDigitSeries value);
    Boolean isRealDigit();
    Boolean isRealDigitSeries();
    Double asRealDigit();
    RealDigitSeries asRealDigitSeries();
    Boolean isRealDigit(String property);
    Boolean isRealDigitSeries(String property);
    Double getRealDigit(String property);
    RealDigitSeries getRealDigitSeries(String property);

    Boolean isTruth(int position);
    Boolean isTruthSeries(int position);
    Boolean getTruth(int position);
    TruthSeries getTruthSeries(int position);
    DataRepresentation add(Boolean value);
    DataRepresentation add(Boolean...values);
    DataRepresentation add(TruthSeries values);
    DataRepresentation set(int position, Boolean value);
    DataRepresentation set(int position, Boolean...values);
    DataRepresentation set(int position, TruthSeries values);
    DataRepresentation add(String property, Boolean value);
    DataRepresentation add(String property, Boolean... values);
    DataRepresentation add(String property, TruthSeries value);
    Boolean isTruth(String property);
    Boolean isTruthSeries(String property);
    Boolean getTruth(String property);
    TruthSeries getTruthSeries(String property);
    Boolean isTruth();
    Boolean isTruthSeries();
    Boolean asTruth();
    TruthSeries asTruthSeries();

    Boolean isEmail(int position);
    Boolean isEmailSeries(int position);
    Email getEmail(int position);
    EmailSeries getEmailSeries(int position);
    Boolean isEmail(String property);
    Boolean isEmailSeries(String property);
    Email getEmail(String property);
    EmailSeries getEmailSeries(String property);
    Boolean isEmail();
    Boolean isEmailSeries();
    Email asEmail();
    EmailSeries asEmailSeries();
    DataRepresentation add(Email value);
    DataRepresentation add(Email...values);
    DataRepresentation add(EmailSeries values);
    DataRepresentation set(int position, Email value);
    DataRepresentation set(int position, Email...values);
    DataRepresentation set(int position, EmailSeries values);
    DataRepresentation add(String property, Email value);
    DataRepresentation add(String property, Email... values);
    DataRepresentation add(String property, EmailSeries value);

    DataRepresentation get(String property);
    DataRepresentation get(int position);
    DataRepresentation add(DataRepresentation value);
    DataRepresentation add(DataRepresentation... values);
    DataRepresentation set(int position, DataRepresentation value);
    DataRepresentation set(int position, DataRepresentation...values);
    DataRepresentation add(String property, DataRepresentation value);
    DataRepresentation add(String property, DataRepresentation... values);

    Boolean is(Class<? extends GeneratedCoreType> generatedCoreTypeClass);
    Boolean is(String property, Class<? extends GeneratedCoreType> generatedCoreTypeClass);
    Boolean is(int position, Class<? extends GeneratedCoreType> generatedCoreTypeClass);
    <T extends GeneratedCoreType> T as(Class<T> generatedCoreTypeClass);
    <T extends GeneratedCoreType> T get(String property, Class<T> generatedCoreTypeClass);
    <T extends GeneratedCoreType> T get(int position, Class<T> generatedCoreTypeClass);
    DataRepresentation add(CoreType coreType);
    DataRepresentation add(CoreType... values);
    DataRepresentation set(int position, CoreType value);
    DataRepresentation set(int position, CoreType...values);
    DataRepresentation add(String property, CoreType coreType);
    DataRepresentation add(String property, CoreType... values);
}