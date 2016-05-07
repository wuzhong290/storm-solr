/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.storm.solr.config;

import org.apache.solr.client.solrj.impl.CloudSolrServer;

import java.io.Serializable;

/**
 * Class containing Solr configuration to be made available to Storm Solr bolts. Any configuration needed in
 * the bolts should be put in this class.
 */
public class SolrConfig implements Serializable {
    private final String zkHostString;
    private final int tickTupleInterval;
    private final String collection;
    private final String uniqueKeyField;

    /**
     * @param zkHostString Zookeeper host string as defined in the {@link CloudSolrServer} constructor
     * */
    public SolrConfig(String zkHostString,String collection,String uniqueKeyField) {
       this(zkHostString,collection,uniqueKeyField, 0);
    }

    /**
     * @param zkHostString Zookeeper host string as defined in the {@link CloudSolrServer} constructor
     * @param tickTupleInterval interval for tick tuples
     * */
    public SolrConfig(String zkHostString,String collection,String uniqueKeyField, int tickTupleInterval) {
        this.zkHostString = zkHostString;
        this.tickTupleInterval = tickTupleInterval;
        this.collection = collection;
        this.uniqueKeyField = uniqueKeyField;
    }

    public String getZkHostString() {
        return zkHostString;
    }

    public int getTickTupleInterval() {
        return tickTupleInterval;
    }

    public String getCollection() {
        return collection;
    }


    public String getUniqueKeyField() {
        return uniqueKeyField;
    }

}
