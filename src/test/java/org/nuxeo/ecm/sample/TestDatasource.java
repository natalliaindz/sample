/*
 * (C) Copyright 2013 Nuxeo SA (http://nuxeo.com/) and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Julien Carsique
 *
 */

package org.nuxeo.ecm.sample;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.runtime.datasource.DataSourceHelper;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;

/**
 * Test a datasource as explained in http://doc.nuxeo.com/x/5AFc
 *
 * @since 5.7
 */
@RunWith(FeaturesRunner.class)
@Features(DatasourceFeature.class)
public class TestDatasource {

    @Test
    public void test() throws Exception {
        DataSource ds = DataSourceHelper.getDataSource("foo");
        Connection conn = ds.getConnection();
        try {
            // ... use the connection ...
        } finally {
            conn.close();
        }
    }
}
