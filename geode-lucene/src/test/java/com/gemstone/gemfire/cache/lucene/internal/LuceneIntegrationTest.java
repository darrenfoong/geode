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

package com.gemstone.gemfire.cache.lucene.internal;

import com.gemstone.gemfire.cache.Cache;
import com.gemstone.gemfire.cache.CacheFactory;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;

public class LuceneIntegrationTest {

  protected Cache cache;

  @Rule
  public TestName name = new TestName();

  @After
  public void tearDown() {
    if(this.cache != null) {
      this.cache.close();
    }
  }

  protected void createCache() {
    CacheFactory cf = new CacheFactory();
    cf.set("mcast-port", "0");
    this.cache = cf.create();
  }
}
