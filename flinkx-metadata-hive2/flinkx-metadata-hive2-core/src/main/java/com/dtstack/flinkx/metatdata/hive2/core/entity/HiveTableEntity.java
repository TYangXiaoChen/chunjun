/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flinkx.metatdata.hive2.core.entity;


import com.dtstack.metadata.rdb.core.entity.TableEntity;

/**
 * @company:www.dtstack.com
 * @Author:shiFang
 * @Date:2021-01-20 11:06
 * @Description:
 */
public class HiveTableEntity extends TableEntity {

    /**最近一次访问时间*/
    private String lastAccessTime;

    /**最近一次修改时间*/
    private String transientLastDdlTime;

    /**hdfs存储路径*/
    private String location;

    /**hdfs存储类型*/
    private String storeType;

    public void setLastAccessTime(String lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public void setTransientLastDdlTime(String transientLastDdlTime) {
        this.transientLastDdlTime = transientLastDdlTime;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "HiveTableEntity{" +
                "lastAccessTime='" + lastAccessTime + '\'' +
                ", transientLastDdlTime='" + transientLastDdlTime + '\'' +
                ", location='" + location + '\'' +
                ", storeType='" + storeType + '\'' +
                '}';
    }
}
