package org.cassandraunit.dataset;

import org.cassandraunit.model.ColumnFamilyModel;
import org.cassandraunit.model.KeyspaceModel;

import java.util.List;

/**
 * @author Jeremy Sevellec
 */
public interface CQLDataSet {

    List<String> getCQLStatements();

    String getKeyspaceName();

    boolean isKeyspaceCreation();

    boolean isKeyspaceDeletion();
}
