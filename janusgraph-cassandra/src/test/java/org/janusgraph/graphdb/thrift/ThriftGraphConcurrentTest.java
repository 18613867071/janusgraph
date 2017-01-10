package org.janusgraph.graphdb.thrift;

import org.janusgraph.CassandraStorageSetup;
import org.janusgraph.diskstorage.configuration.WriteConfiguration;
import org.janusgraph.graphdb.JanusGraphConcurrentTest;
import org.janusgraph.testcategory.PerformanceTests;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

@Category({PerformanceTests.class})
public class ThriftGraphConcurrentTest extends JanusGraphConcurrentTest {

    @Override
    public WriteConfiguration getConfiguration() {
        return CassandraStorageSetup.getCassandraThriftGraphConfiguration(getClass().getSimpleName());
    }


    @BeforeClass
    public static void beforeClass() {
        CassandraStorageSetup.startCleanEmbedded();
    }
}