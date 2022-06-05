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

package com.ledis.catalog.table;

import java.util.Map;

import com.ledis.catalog.Identifier;
import com.ledis.catalog.StagingTableCatalog;
import com.ledis.catalog.support.SupportsWrite;
import com.ledis.types.StructType;
import com.ledis.utils.expressions.Transform;
import com.ledis.utils.writer.LogicalWriteInfo;

/**
 * Represents a table which is staged for being committed to the metastore.
 * <p>
 * This is used to implement atomic CREATE TABLE AS SELECT and REPLACE TABLE AS SELECT queries. The
 * planner will create one of these via
 * {@link StagingTableCatalog#stageCreate(Identifier, StructType, Transform[], Map)} or
 * {@link StagingTableCatalog#stageReplace(Identifier, StructType, Transform[], Map)} to prepare the
 * table for being written to. This table should usually implement {@link SupportsWrite}. A new
 * writer will be constructed via {@link SupportsWrite#newWriteBuilder(LogicalWriteInfo)}, and the
 * write will be committed. The job concludes with a call to {@link #commitStagedChanges()}, at
 * which point implementations are expected to commit the table's metadata into the metastore along
 * with the data that was written by the writes from the write builder this table created.
 */
public interface StagedTable extends Table {

  /**
   * Finalize the creation or replacement of this table.
   */
  void commitStagedChanges();

  /**
   * Abort the changes that were staged, both in metadata and from temporary outputs of this
   * table's writers.
   */
  void abortStagedChanges();
}
