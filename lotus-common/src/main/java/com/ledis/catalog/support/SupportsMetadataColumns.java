/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.ledis.catalog.support;

import com.ledis.catalog.MetadataColumn;
import com.ledis.catalog.table.Table;
import com.ledis.types.StructField;
import com.ledis.types.StructType;
import com.ledis.utils.reader.SupportsPushDownRequiredColumns;

/**
 * An interface for exposing data columns for a table that are not in the table schema. For example,
 * a file source could expose a "file" column that contains the path of the file that contained each
 * row.
 * <p>
 * The columns returned by {@link #metadataColumns()} may be passed as {@link StructField} in
 * requested projections. Sources that implement this interface and column projection using
 * {@link SupportsPushDownRequiredColumns} must accept metadata fields passed to
 * {@link SupportsPushDownRequiredColumns#pruneColumns(StructType)}.
 * <p>
 * If a table column and a metadata column have the same name, the metadata column will never be
 * requested. It is recommended that Table implementations reject data column name that conflict
 * with metadata column names.
 */
public interface SupportsMetadataColumns extends Table {
  /**
   * Metadata columns that are supported by this {@link Table}.
   * <p>
   * The columns returned by this method may be passed as {@link StructField} in requested
   * projections using {@link SupportsPushDownRequiredColumns#pruneColumns(StructType)}.
   * <p>
   * If a table column and a metadata column have the same name, the metadata column will never be
   * requested and is ignored. It is recommended that Table implementations reject data column names
   * that conflict with metadata column names.
   *
   * @return an array of {@link MetadataColumn}
   */
  MetadataColumn[] metadataColumns();
}
