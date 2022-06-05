/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ledis.utils;

import com.ledis.types.ArrayData;
import com.ledis.types.CalendarInterval;
import com.ledis.types.DataType;
import com.ledis.types.Decimal;
import com.ledis.utils.UTF8String;
import com.ledis.utils.collections.row.InternalRow;
import com.ledis.utils.collections.MapData;

public interface SpecializedGetters {

  boolean isNullAt(int ordinal);

  boolean getBoolean(int ordinal);

  byte getByte(int ordinal);

  short getShort(int ordinal);

  int getInt(int ordinal);

  long getLong(int ordinal);

  float getFloat(int ordinal);

  double getDouble(int ordinal);

  Decimal getDecimal(int ordinal, int precision, int scale);

  UTF8String getUTF8String(int ordinal);

  byte[] getBinary(int ordinal);

  CalendarInterval getInterval(int ordinal);

  InternalRow getStruct(int ordinal, int numFields);

  ArrayData getArray(int ordinal);

  MapData getMap(int ordinal);

  Object get(int ordinal, DataType dataType);
}
